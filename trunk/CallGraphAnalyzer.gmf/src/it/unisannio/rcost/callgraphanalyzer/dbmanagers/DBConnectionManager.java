package it.unisannio.rcost.callgraphanalyzer.dbmanagers;

import it.unisannio.se.c3rep.extractors.staticmodel.DBListener;
import it.unisannio.se.c3rep.extractors.staticmodel.StaticModelEmitter;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IParameter;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.ParameterValuesException;
import org.eclipse.core.commands.Parameterization;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IJavaModel;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.IHandlerService;

/**
 * This class is a Singleton that provides access to one or many connection
 * pools defined in a Property file. A client gets access to the single instance
 * through the static getInstance() method and can then check-out and check-in
 * connections from a pool. When the client shuts down it should call the
 * release() method to close all open connections and do other clean up.
 */
@SuppressWarnings("unchecked")
public class DBConnectionManager implements DBListener {
	private static String url = "jdbc:hsqldb:file:";
	private static final String user = "sa";
	private static final String password = "";
	private static final int maxConn = 0;
	private static final String driverClassName = "org.hsqldb.jdbcDriver";

	static private DBConnectionManager instance; // The single instance
	static private int clients;

	private Vector<Driver> drivers = new Vector<Driver>();
	private PrintWriter log;
	private Hashtable<String, DBConnectionPool> pools = new Hashtable<String, DBConnectionPool>();

	/**
	 * Returns the single instance, creating one if it's the first time this
	 * method is called.
	 * 
	 * @return DBConnectionManager The single instance.
	 */
	static synchronized public DBConnectionManager getInstance() {
		if (instance == null) {
			instance = new DBConnectionManager();
		}
		clients++;
		return instance;
	}

	/**
	 * A private constructor since this is a Singleton
	 */
	private DBConnectionManager() {
		// init();
		loadDrivers(driverClassName);
	}

	/**
	 * Returns a connection to the named pool.
	 * 
	 * @param name
	 *            The pool name as defined in the properties file
	 * @param con
	 *            The Connection
	 */
	public void freeConnection(String name, Connection conn) {
		DBConnectionPool pool = (DBConnectionPool) pools.get(name);
		if (pool != null) {
			pool.freeConnection(conn);
		}
	}

	/**
	 * Returns an open connection. If no one is available, and the max number of
	 * connections has not been reached, a new connection is created.
	 * 
	 * @param name
	 *            The pool name as defined in the properties file
	 * @return Connection The connection or null
	 */
	public Connection getConnection(String poolName) {
		DBConnectionPool pool = (DBConnectionPool) pools.get(poolName);
		if (pool != null) {
			return pool.getConnection();
		} else {
			
			return newConnectionPool(poolName).getConnection();
		}
	}

	private DBConnectionPool newConnectionPool(String poolName) {
		DBConnectionPool pool = null;
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(poolName);
		
		if(project != null) {
			String newUrl = url + project.getLocation().toOSString() + "/" + poolName;//"quicksort_versione1/quicksort_versione1.log";
			//System.out.println(newUrl);
			pool = new DBConnectionPool(poolName, newUrl, user, password, maxConn);

			pools.put(poolName, pool);
		}
		
		return pool;
	}
	/**
	 * Returns an open connection. If no one is available, and the max number of
	 * connections has not been reached, a new connection is created. If the max
	 * number has been reached, waits until one is available or the specified
	 * time has elapsed.
	 * 
	 * @param name
	 *            The pool name as defined in the properties file
	 * @param time
	 *            The number of milliseconds to wait
	 * @return Connection The connection or null
	 */
//	public synchronized Connection getConnection(String name, long time) {
//		
//		DBConnectionPool pool = (DBConnectionPool) pools.get(name);
//		if (pool != null) {
//			return pool.getConnection(time);
//		}
//		return null;
//	}

	/**
	 * Closes all open connections and deregisters all drivers.
	 */
	public synchronized void release() {
		// Wait until called by the last client
		if (--clients != 0) {
			return;
		}

		Enumeration allPools = pools.elements();
		while (allPools.hasMoreElements()) {
			DBConnectionPool pool = (DBConnectionPool) allPools.nextElement();
			pool.release();
		}
		Enumeration allDrivers = drivers.elements();
		while (allDrivers.hasMoreElements()) {
			Driver driver = (Driver) allDrivers.nextElement();
			try {
				DriverManager.deregisterDriver(driver);
				log("Deregistered JDBC driver " + driver.getClass().getName());
			} catch (SQLException e) {
				log(e, "Can't deregister JDBC driver: " + driver.getClass().getName());
			}
		}
	}

	private void loadDrivers(String driverClassName) {
		try {
			Driver driver = (Driver) Class.forName(driverClassName).newInstance();
			DriverManager.registerDriver(driver);
			drivers.addElement(driver);
			log("Registered JDBC driver " + driverClassName);
		} catch (Exception e) {
			System.err.println("Can't register JDBC driver: " + driverClassName + ", Exception: "
					+ e);
		}
	}

	/**
	 * Writes a message to the log file.
	 */
	private void log(String msg) {
		if (log != null)
			log.println(new Date() + ": " + msg);
	}

	/**
	 * Writes a message with an Exception to the log file.
	 */
	private void log(Throwable e, String msg) {
		if(log != null) {
			log.println(new Date() + ": " + msg);
			e.printStackTrace(log);
		} else
			e.printStackTrace();
	}
	
	public void graphConstructionStarted(String projectName){
		synchronized(projectName){
			IJavaModel model = JavaCore.create(ResourcesPlugin.getWorkspace().getRoot());
	        
	        IJavaProject project = model.getJavaProject(projectName);
	        IPath dbPath = project.getResource().getLocation();
	        if(!(dbPath.append(projectName + ".properties").toFile().exists() || dbPath.append(projectName + ".log").toFile().exists() || dbPath.append(projectName + ".script").toFile().exists())) {
	        	try {
	        		System.out.println("started");
	        		StaticModelEmitter.getStaticModelEmitter().startDBCreation(project);
	        	} catch (Exception e) {
					e.printStackTrace();
					return;
				}
	        }
	        
	        DBConnectionPool pool = this.pools.get(projectName);
	        if(pool != null) {
	        	pool.getConnection();
			} else {
				pool = newConnectionPool(projectName);
			}
	        
	        pool.lockOnWrite(true);
		}
	}

	public void graphConstructionFinished(String projectName){
		DBConnectionPool pool = this.pools.get(projectName);
		
		if(pool != null) {
			pool.lockOnWrite(false);
		}
	}
	
	private void callUpdateCommand(String projectName) throws NotDefinedException, ParameterValuesException, ExecutionException, NotEnabledException, NotHandledException{
		ICommandService commandService = (ICommandService) PlatformUI.getWorkbench().getService(ICommandService.class);
 		IHandlerService handlerService = (IHandlerService) PlatformUI.getWorkbench().getService(IHandlerService.class);
 		Command updateCommand = commandService.getCommand("it.unisannio.rcost.callgraphanalyzer.diagram.updateOpenedDiagram");
 		IParameter viewIdParm = updateCommand.getParameter("it.unisannio.rcost.callgraphanalyzer.diagram.updateOpenedDiagram.projectName");
 
 		Parameterization parm = new Parameterization(viewIdParm, projectName);
 		ParameterizedCommand parmCommand = new ParameterizedCommand(
 				updateCommand, new Parameterization[] { parm });
 
 		handlerService.executeCommand(parmCommand, null);
	}
	
	public void dbConstructionStarted(String projectName) {
		System.out.println("DB construction started");
		synchronized(projectName){
			DBConnectionPool pool = this.pools.get(projectName);
			if(pool != null) {
				try {
					pool.getConnection().createStatement().execute("SHUTDOWN;");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				pool.waitForWrite();
			} else {
				pool = newConnectionPool(projectName);
			}
			
			pool.lockOnRead(true);
		}
	}
	
	public void dbConstructionFinished(String projectName) {
		System.out.println("DB construction finished");
		DBConnectionPool pool = this.pools.get(projectName);
		
		if(pool != null) {
			pool.lockOnRead(false);
			
			try {
				callUpdateCommand(projectName);
			} catch (NotDefinedException e) {
				e.printStackTrace();
			} catch (ParameterValuesException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			} catch (NotEnabledException e) {
				e.printStackTrace();
			} catch (NotHandledException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void dbConstructionFailed(String projectName) {
		System.err.println("DB Construction failed");
		dbConstructionFinished(projectName);
	}
	
	/**
	 * This inner class represents a connection pool. It creates new connections
	 * on demand, up to a max number if specified. It also makes sure a
	 * connection is still open before it is returned to a client.
	 */
	class DBConnectionPool {
		private boolean lockOnRead = false;
		private boolean lockOnWrite = false;
		private int checkedOut;
		private Vector<Connection> freeConnections = new Vector<Connection>();
		private int maxConn;
		private String name;
		private String password;
		private String URL;
		private String user;
		
		private Thread threadOnRead = null;
		private Thread threadOnWrite = null;

		/**
		 * Creates new connection pool.
		 * 
		 * @param name
		 *            The pool name
		 * @param URL
		 *            The JDBC URL for the database
		 * @param user
		 *            The database user, or null
		 * @param password
		 *            The database user password, or null
		 * @param maxConn
		 *            The maximal number of connections, or 0 for no limit
		 */
		public DBConnectionPool(String name, String URL, String user, String password, int maxConn) {
			this.name = name;
			this.URL = URL;
			this.user = user;
			this.password = password;
			this.maxConn = maxConn;
		}

		public synchronized void waitForWrite() {
			if(lockOnWrite)
				try {
					threadOnWrite = Thread.currentThread();
					threadOnWrite.wait();
				} catch (InterruptedException e) {
				}
		}

		/**
		 * Checks in a connection to the pool. Notify other Threads that may be
		 * waiting for a connection.
		 * 
		 * @param con
		 *            The connection to check in
		 */
		public synchronized void freeConnection(Connection con) {
			// Put the connection at the end of the Vector
			freeConnections.addElement(con);
			checkedOut--;
			notifyAll();
		}
		
		public synchronized void lockOnRead(boolean lock) {
			this.lockOnRead = lock;
//			System.err.println("Bloccato in lettura: " + lock);
			
			if(lock) {
				this.lockOnRead = true;
				
				release();
			} else {
				this.lockOnRead = false;
				
				if(threadOnRead != null) {
					threadOnRead.notify();
					
					threadOnRead = null;
				}
			}
		}
		
		public synchronized void lockOnWrite(boolean lock) {
			this.lockOnWrite = lock;
			
//			System.err.println("Bloccato in scrittura: " + lock);
			if(!lock && threadOnWrite != null) {
				threadOnWrite.notify();
				
				threadOnWrite = null;
			}
		}
		
		/**
		 * Checks out a connection from the pool. If no free connection is
		 * available, a new connection is created unless the max number of
		 * connections has been reached. If a free connection has been closed by
		 * the database, it's removed from the pool and this method is called
		 * again recursively.
		 */
		public synchronized Connection getConnection() {
			if(lockOnRead) {
				threadOnRead = Thread.currentThread();

				try {
					threadOnRead.wait();
				} catch (InterruptedException intExc) {
					intExc.printStackTrace();
				} catch (IllegalStateException illExc) {
					illExc.printStackTrace();
				}
			}
			
			Connection con = null;
			if (freeConnections.size() > 0) {
				// Pick the first Connection in the Vector
				// to get round-robin usage
				con = (Connection) freeConnections.firstElement();
				freeConnections.removeElementAt(0);
				try {
					if (con.isClosed()) {
						log("Removed bad connection from " + name);
						// Try again recursively
						con = getConnection();
					}
				} catch (SQLException e) {
					log("Removed bad connection from " + name);
					// Try again recursively
					con = getConnection();
				}
			} else if (maxConn == 0 || checkedOut < maxConn) {
				con = newConnection();
			}
			if (con != null) {
				checkedOut++;
			}
			
			return con;
		}

		/**
		 * Checks out a connection from the pool. If no free connection is
		 * available, a new connection is created unless the max number of
		 * connections has been reached. If a free connection has been closed by
		 * the database, it's removed from the pool and this method is called
		 * again recursively.
		 * <P>
		 * If no connection is available and the max number has been reached,
		 * this method waits the specified time for one to be checked in.
		 * 
		 * @param timeout
		 *            The timeout value in milliseconds
		 */
		public synchronized Connection getConnection(long timeout) {
			
			long startTime = new Date().getTime();
			Connection con;
			while ((con = getConnection()) == null) {
				try {
					wait(timeout);
				} catch (InterruptedException e) {
				}
				if ((new Date().getTime() - startTime) >= timeout) {
					// Timeout has expired
					return null;
				}
			}
			return con;
		}

		/**
		 * Closes all available connections.
		 */
		public synchronized void release() {
			Enumeration allConnections = freeConnections.elements();
			while (allConnections.hasMoreElements()) {
				Connection con = (Connection) allConnections.nextElement();
				try {
					con.close();
					log("Closed connection for pool " + name);
				} catch (SQLException e) {
					log(e, "Can't close connection for pool " + name);
				}
			}
			freeConnections.removeAllElements();
		}

		/**
		 * Creates a new connection, using a userid and password if specified.
		 */
		private Connection newConnection() {
			Connection con = null;
			try {
				if (user == null) {
					con = DriverManager.getConnection(URL);
				} else {
					con = DriverManager.getConnection(URL, user, password);
				}
				log("Created a new connection in pool " + name);
			} catch (SQLException e) {
				log(e, "Can't create a new connection for " + URL);
				return null;
			}
			return con;
		}
	}
}