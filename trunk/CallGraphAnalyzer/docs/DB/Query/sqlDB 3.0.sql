SET WRITE_DELAY 0 MILLIS

CREATE TABLE project (
                name VARCHAR(255) NOT NULL,
                PRIMARY KEY (name)
);

CREATE TABLE package (
                name VARCHAR(255) NOT NULL,
                projectname VARCHAR(255) NOT NULL,
                parentpackagename VARCHAR(255) NULL,
                parentpackageprojectname VARCHAR(255) NULL,
                PRIMARY KEY (name, projectname)
);

CREATE TABLE type_table (
                name VARCHAR(255) NOT NULL,
                packagename VARCHAR(255) NOT NULL,
                projectname VARCHAR(255) NOT NULL,
                compilationunit VARCHAR(255) NOT NULL,
                kind VARCHAR(9) NOT NULL,
                scopemodifier VARCHAR(9) NOT NULL,
                flagsmodifier VARCHAR(8) NULL,
                isstrictfp BOOLEAN NOT NULL,
                isstatic BOOLEAN NOT NULL,
                supertypename VARCHAR(255) NULL,
                supertypepackagename VARCHAR(255) NULL,
                supertypeprojectname VARCHAR(255) NULL,
                outertypename VARCHAR(255) NULL,
                outertypepackagename VARCHAR(255) NULL,
                outertypeprojectname VARCHAR(255) NULL,
                PRIMARY KEY (name, packagename, projectname)
);

CREATE TABLE typeinterfacerelation (
                typename VARCHAR(255) NOT NULL,
                typepackagename VARCHAR(255) NOT NULL,
                typeprojectname VARCHAR(255) NOT NULL,
                interfacename VARCHAR(255) NOT NULL,
                interfacepackagename VARCHAR(255) NOT NULL,
                interfaceprojectname VARCHAR(255) NOT NULL,
                relationkind VARCHAR(14) NOT NULL,
                PRIMARY KEY (typename, typepackagename, typeprojectname, interfacename, interfacepackagename, interfaceprojectname)
);

CREATE TABLE field (
                autoincrementcounter IDENTITY NOT NULL,
                name VARCHAR(255) NOT NULL,
                ownername VARCHAR(255) NOT NULL,
                ownerpackagename VARCHAR(255) NOT NULL,
                ownerprojectname VARCHAR(255) NOT NULL,
                scopemodifier VARCHAR(9) NOT NULL,
                signature VARCHAR(255) NOT NULL,
                isfinal BOOLEAN DEFAULT false NOT NULL,
                isstatic BOOLEAN DEFAULT false NOT NULL,
                isvolatile BOOLEAN DEFAULT false NOT NULL,
                istransient BOOLEAN DEFAULT false NOT NULL,
                PRIMARY KEY (autoincrementcounter)
);

CREATE TABLE method (
                autoincrementcounter IDENTITY NOT NULL,
                name VARCHAR(255) NOT NULL,
                typename VARCHAR(255) NOT NULL,
                typepackagename VARCHAR(255) NOT NULL,
                typeprojectname VARCHAR(255) NOT NULL,
                signature VARCHAR(255) NOT NULL,
                scopemodifier VARCHAR(9) NOT NULL,
                flagsmodifier VARCHAR(8) NULL,
                isstatic BOOLEAN DEFAULT false NOT NULL,
                isnative BOOLEAN DEFAULT false NOT NULL,
                isstrictfp BOOLEAN DEFAULT false NOT NULL,
                issynchronized BOOLEAN DEFAULT false NOT NULL,
                PRIMARY KEY (autoincrementcounter)
);

CREATE TABLE advice (
                autoincrementcounter IDENTITY NOT NULL,
                localid INTEGER NOT NULL,
                aspectname VARCHAR(255) NOT NULL,
                aspectpackagename VARCHAR(255) NOT NULL,
                aspectprojectname VARCHAR(255) NOT NULL,
                advicekind VARCHAR(6) NOT NULL,
                signature VARCHAR(255) NOT NULL,
                pointcutexpression VARCHAR(255) NOT NULL,
                isstrictfp BOOLEAN DEFAULT false NOT NULL,
                PRIMARY KEY (autoincrementcounter)
);

CREATE TABLE pointcut (
                pointcutname VARCHAR(255) NOT NULL,
                aspectprojectname VARCHAR(255) NOT NULL,
                aspectpackagename VARCHAR(255) NOT NULL,
                aspectname VARCHAR(255) NOT NULL,
                scopemodifier VARCHAR(9) NOT NULL,
                PRIMARY KEY (pointcutname)
);

CREATE TABLE implicitcallmethodtoadvice (
                autoincrementcounter IDENTITY NOT NULL,
                methodautoincrementcounter INTEGER NOT NULL,
                adviceautoincrementcounter INTEGER NOT NULL,
                joinpointshadowtype VARCHAR(10) NOT NULL,
                targetid INTEGER NOT NULL,
                targettype VARCHAR(6) NOT NULL,
                PRIMARY KEY (autoincrementcounter)
);

CREATE TABLE implicitcalladvicetoadvice (
                myautoincrementcounter IDENTITY NOT NULL,
                advisedadviceautoincrementcounter INTEGER NOT NULL,
                advisingadviceautoincrementcounter INTEGER NOT NULL,
                joinpointshadowtype VARCHAR(10) NOT NULL,
                targetid INTEGER NOT NULL,
                targettype VARCHAR(6) NOT NULL,
                PRIMARY KEY (myautoincrementcounter)
);

CREATE TABLE explicitcallmethodtomethod (
                autoincrementcounter IDENTITY NOT NULL,
                callerautoincrementcounter INTEGER NOT NULL,
                calleeautoincrementcounter INTEGER NOT NULL,
                PRIMARY KEY (autoincrementcounter)
);

CREATE TABLE explicitcalladvicetomethod (
                autoincrementcounter IDENTITY NOT NULL,
                adviceautoincrementcounter INTEGER NOT NULL,
                methodautoincrementcounter INTEGER NOT NULL,
                PRIMARY KEY (autoincrementcounter)
);


ALTER TABLE package ADD CONSTRAINT project_package_fk
FOREIGN KEY (projectname)
REFERENCES project (name) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE package ADD CONSTRAINT package_package_fk
FOREIGN KEY (parentpackagename, parentpackageprojectname)
REFERENCES package (name, projectname) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE type_table ADD CONSTRAINT package_topleveltype_fk
FOREIGN KEY (packagename, projectname)
REFERENCES package (name, projectname) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE type_table ADD CONSTRAINT topleveltype_topleveltype_fk
FOREIGN KEY (supertypename, supertypepackagename, supertypeprojectname)
REFERENCES type_table (name, packagename, projectname) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE type_table ADD CONSTRAINT type_type_fk
FOREIGN KEY (outertypename, outertypepackagename, outertypeprojectname)
REFERENCES type_table (name, packagename, projectname) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE typeinterfacerelation ADD CONSTRAINT type_typeinterfacerelation_fk
FOREIGN KEY (typename, typepackagename, typeprojectname)
REFERENCES type_table (name, packagename, projectname) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE typeinterfacerelation ADD CONSTRAINT interface_typeinterfacerelation_fk
FOREIGN KEY (interfacename, interfacepackagename, interfaceprojectname)
REFERENCES type_table (name, packagename, projectname) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE field ADD CONSTRAINT type_field_fk
FOREIGN KEY (ownername, ownerpackagename,  ownerprojectname)
REFERENCES type_table (name, packagename, projectname) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE method ADD CONSTRAINT type_method_fk
FOREIGN KEY (typename, typepackagename,  typeprojectname)
REFERENCES type_table (name, packagename, projectname) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE advice ADD CONSTRAINT type_advice_fk
FOREIGN KEY (aspectname, aspectpackagename, aspectprojectname)
REFERENCES type_table (name, packagename, projectname) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE pointcut ADD CONSTRAINT type_pointcut_fk
FOREIGN KEY (aspectname, aspectpackagename, aspectprojectname)
REFERENCES type_table ( name, packagename, projectname) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE explicitcallmethodtomethod ADD CONSTRAINT caller_explicitcallmethodtomethod_fk
FOREIGN KEY (callerautoincrementcounter)
REFERENCES method (autoincrementcounter) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE explicitcallmethodtomethod ADD CONSTRAINT callee_explicitcallmethodtomethod_fk
FOREIGN KEY (calleeautoincrementcounter)
REFERENCES method (autoincrementcounter) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE implicitcallmethodtoadvice ADD CONSTRAINT method_implicitcallmethodtoadvice_fk
FOREIGN KEY (methodautoincrementcounter)
REFERENCES method (autoincrementcounter) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE explicitcalladvicetomethod ADD CONSTRAINT method_explicitcalladvicetomethod_fk
FOREIGN KEY (methodautoincrementcounter)
REFERENCES method (autoincrementcounter) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE implicitcallmethodtoadvice ADD CONSTRAINT advice_implicitcallmethodtoadvice_fk
FOREIGN KEY (adviceautoincrementcounter)
REFERENCES advice (autoincrementcounter) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE explicitcalladvicetomethod ADD CONSTRAINT advice_explicitcalladvicetomethod_fk
FOREIGN KEY (adviceautoincrementcounter)
REFERENCES advice (autoincrementcounter) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE implicitcalladvicetoadvice ADD CONSTRAINT advisedadvice_implicitcalladvicetoadvice_fk
FOREIGN KEY (advisedadviceautoincrementcounter)
REFERENCES advice (autoincrementcounter) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE implicitcalladvicetoadvice ADD CONSTRAINT advisingadvice_implicitcalladvicetoadvice_fk
FOREIGN KEY (advisingadviceautoincrementcounter)
REFERENCES advice (autoincrementcounter) ON DELETE CASCADE ON UPDATE CASCADE
;