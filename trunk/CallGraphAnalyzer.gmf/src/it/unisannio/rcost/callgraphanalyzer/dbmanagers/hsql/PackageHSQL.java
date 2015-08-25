package it.unisannio.rcost.callgraphanalyzer.dbmanagers.hsql;

import it.unisannio.rcost.callgraphanalyzer.Aspect;
import it.unisannio.rcost.callgraphanalyzer.CallGraphFactory;
import it.unisannio.rcost.callgraphanalyzer.Class;
import it.unisannio.rcost.callgraphanalyzer.Interface;
import it.unisannio.rcost.callgraphanalyzer.Package;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.AspectFacade;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.ClassFacade;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.DBConnectionManager;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.InterfaceFacade;
import it.unisannio.rcost.callgraphanalyzer.dbmanagers.dao.PackageDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PackageHSQL implements PackageDAO {
	private static final DBConnectionManager manager = DBConnectionManager.getInstance();
	
	public Package fillAllAttribute(String projectName, Package emptyElement) {
		return emptyElement;
	}
	
	public Interface[] getInnerModules(String projectName, Package owner) {
		return InterfaceFacade.facade.getModulesByPackage(projectName, owner);
	}
	
	public Aspect[] getInnerAspects(String projectName, Package owner) {
		return AspectFacade.facade.getAspectsByPackage(projectName, owner);
	}

	public Class[] getInnerClasses(String projectName, Package owner) {
		return ClassFacade.facade.getClassesByPackage(projectName, owner);
	}

	public Interface[] getInnerInterfaces(String projectName, Package owner) {
		return InterfaceFacade.facade.getInterfacesByPackage(projectName, owner);
	}

	public Package[] getInnerPackages(String projectName, Package owner) {
		List<Package> packages = new ArrayList<Package>();
		Connection conn = manager.getConnection(projectName);
		try {
			PreparedStatement statement = conn.prepareStatement(
							"SELECT * FROM Package as pack WHERE parentPackageId = (SELECT id as parentId FROM Package WHERE name = ?);");
			statement.setString(1, owner.getName());
			
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				Package converted = resultSet2Package(rs);
				converted.setPackageName(owner.getName());
				if (converted != null){
					packages.add(converted);
				}
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		} finally {
			manager.freeConnection(projectName, conn);
		}

		return toArray(packages);
	}

	public Package[] getRootPackages(String projectName) {
		List<Package> packages = new ArrayList<Package>();
		Connection conn = manager.getConnection(projectName);
		try {
			PreparedStatement statement = conn.prepareStatement("SELECT * FROM Package WHERE parentPackageId IS NULL;");
			
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				Package converted = resultSet2Package(rs);
				converted.setPackageName("");
				if (converted != null)
					packages.add(converted);
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		} finally {
			manager.freeConnection(projectName, conn);
		}

		return toArray(packages);
	}
	
	private Package[] toArray(List<Package> packages) {
		if (packages != null)
			return packages.toArray(new Package[packages.size()]);
		else
			return new Package[0];
	}
    
    private Package resultSet2Package(ResultSet rs) throws SQLException {
		Package package_ = CallGraphFactory.eINSTANCE.createPackage();
//		package_.setPackageName(rs.getString("parentPackageName"));
		package_.setName(rs.getString("name"));
		package_.setId(rs.getInt("id"));
		
		return package_;
	}
}
