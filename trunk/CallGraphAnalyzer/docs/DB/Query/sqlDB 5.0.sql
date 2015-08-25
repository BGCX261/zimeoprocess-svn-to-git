SET WRITE_DELAY 0 MILLIS

CREATE TABLE project (
                id IDENTITY NOT NULL,
                name VARCHAR(255) NOT NULL,
                PRIMARY KEY (id)
);

CREATE TABLE package (
                id IDENTITY NOT NULL,
                name VARCHAR(255) NOT NULL,
                projectid INTEGER NOT NULL,
                parentpackageid INTEGER NULL,
                PRIMARY KEY (id)
);

CREATE TABLE type_table (
                id IDENTITY NOT NULL,
                name VARCHAR(255) NOT NULL,
                packageid INTEGER NOT NULL,
                compilationunit VARCHAR(255) NOT NULL,
                kind VARCHAR(9) NOT NULL,
                scopemodifier VARCHAR(9) NOT NULL,
                flagsmodifier VARCHAR(8) NULL,
                isstrictfp BOOLEAN NOT NULL,
                isstatic BOOLEAN NOT NULL,
                outertypeid INTEGER NULL,
                supertypeid INTEGER NULL,
                PRIMARY KEY (id)
);

CREATE TABLE typeinterfacerelation (
                id IDENTITY NOT NULL,
                typeid INTEGER NOT NULL,
                interfaceid INTEGER NOT NULL,
                relationkind VARCHAR(14) NOT NULL,
                PRIMARY KEY (id)
);

CREATE TABLE field (
                id IDENTITY NOT NULL,
                ownerid INTEGER NOT NULL,
                name VARCHAR(255) NOT NULL,
                scopemodifier VARCHAR(9) NOT NULL,
                signature VARCHAR(255) NOT NULL,
                isfinal BOOLEAN NOT NULL,
                isstatic BOOLEAN NOT NULL,
                isvolatile BOOLEAN NOT NULL,
                istransient BOOLEAN NOT NULL,
                PRIMARY KEY (id)
);

CREATE TABLE method (
                id IDENTITY NOT NULL,
                typeid INTEGER NOT NULL,
                name VARCHAR(255) NOT NULL,
                signature VARCHAR(255) NOT NULL,
                scopemodifier VARCHAR(9) NOT NULL,
                flagsmodifier VARCHAR(8) NULL,
                isstatic BOOLEAN NOT NULL,
                isnative BOOLEAN NOT NULL,
                isstrictfp BOOLEAN NOT NULL,
                issynchronized BOOLEAN NOT NULL,
                PRIMARY KEY (id)
);

CREATE TABLE advice (
                id IDENTITY NOT NULL,
                aspectid INTEGER NOT NULL,
                localid INTEGER NOT NULL,
                advicekind VARCHAR(6) NOT NULL,
                signature VARCHAR(256) NOT NULL,
                pointcutexpression VARCHAR(255) NOT NULL,
                isstrictfp BOOLEAN DEFAULT false NOT NULL,
                PRIMARY KEY (id)
);

CREATE TABLE implicitcallmethodtoadvice (
                id INTEGER NOT NULL,
                joinpointshadowtype VARCHAR(10) NOT NULL,
                targettype VARCHAR(6) NOT NULL,
                targetid INTEGER NOT NULL,
                methodid INTEGER NOT NULL,
                adviceid INTEGER NOT NULL,
                PRIMARY KEY (id)
);

CREATE TABLE implicitcalladvicetoadvice (
                id IDENTITY NOT NULL,
                joinpointshadowtype VARCHAR(10) NOT NULL,
                targettype VARCHAR(6) NOT NULL,
                targetid INTEGER NOT NULL,
                advisedadviceid INTEGER NOT NULL,
                advisingadviceid INTEGER NOT NULL,
                PRIMARY KEY (id)
);

CREATE TABLE explicitcallmethodtomethod (
                id IDENTITY NOT NULL,
                callerid INTEGER NOT NULL,
                calleeid INTEGER NOT NULL,
                callgroupid INTEGER NOT NULL,
                PRIMARY KEY (id)
);

CREATE TABLE explicitcalladvicetomethod (
                id IDENTITY NOT NULL,
                methodid INTEGER NOT NULL,
                adviceid INTEGER NOT NULL,
                callgroupid INTEGER NOT NULL,
                PRIMARY KEY (id)
);


ALTER TABLE package ADD CONSTRAINT project_package_fk
FOREIGN KEY (projectid)
REFERENCES project (id) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE package ADD CONSTRAINT package_unique_constraint
UNIQUE (name, projectid)
;


ALTER TABLE package ADD CONSTRAINT package_package_fk
FOREIGN KEY (parentpackageid)
REFERENCES package (id) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE type_table ADD CONSTRAINT package_type_table_fk
FOREIGN KEY (packageid)
REFERENCES package (id) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE type_table ADD CONSTRAINT type_table_unique_constraint
UNIQUE (name, packageid)
;


ALTER TABLE type_table ADD CONSTRAINT type_table_outertype_table_fk
FOREIGN KEY (outertypeid)
REFERENCES type_table (id) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE type_table ADD CONSTRAINT type_table_supertype_table_fk
FOREIGN KEY (supertypeid)
REFERENCES type_table (id) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE field ADD CONSTRAINT type_field_fk
FOREIGN KEY (ownerid)
REFERENCES type_table (id) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE field ADD CONSTRAINT field_unique_constraint
UNIQUE (name, ownerid)
;


ALTER TABLE method ADD CONSTRAINT type_method_fk
FOREIGN KEY (typeid)
REFERENCES type_table (id) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE method ADD CONSTRAINT method_unique_constraint
UNIQUE (name, typeid, signature)
;


ALTER TABLE advice ADD CONSTRAINT type_advice_fk
FOREIGN KEY (aspectid)
REFERENCES type_table (id) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE advice ADD CONSTRAINT advice_unique_constraint
UNIQUE (aspectid, localid, advicekind)
;


ALTER TABLE typeinterfacerelation ADD CONSTRAINT type_table_typeinterfacerelation_fk
FOREIGN KEY (typeid)
REFERENCES type_table (id) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE typeinterfacerelation ADD CONSTRAINT interface_typeinterfacerelation_fk
FOREIGN KEY (interfaceid)
REFERENCES type_table (id) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE explicitcalladvicetomethod ADD CONSTRAINT method_explicitcalladvicetomethod_fk
FOREIGN KEY (methodid)
REFERENCES method (id) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE implicitcallmethodtoadvice ADD CONSTRAINT method_implicitcallmethodtoadvice_fk
FOREIGN KEY (methodid)
REFERENCES method (id) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE explicitcallmethodtomethod ADD CONSTRAINT callermethod_explicitcallmethodtomethod_fk
FOREIGN KEY (callerid)
REFERENCES method (id) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE explicitcallmethodtomethod ADD CONSTRAINT calleemethod_explicitcallmethodtomethod_fk
FOREIGN KEY (calleeid)
REFERENCES method (id) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE implicitcalladvicetoadvice ADD CONSTRAINT advisingadvice_implicitcalladvicetoadvice_fk
FOREIGN KEY (advisingadviceid)
REFERENCES advice (id) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE implicitcalladvicetoadvice ADD CONSTRAINT advisedadvice_implicitcalladvicetoadvice_fk
FOREIGN KEY (advisedadviceid)
REFERENCES advice (id) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE explicitcalladvicetomethod ADD CONSTRAINT advice_explicitcalladvicetomethod_fk
FOREIGN KEY (adviceid)
REFERENCES advice (id) ON DELETE CASCADE ON UPDATE CASCADE
;


ALTER TABLE implicitcallmethodtoadvice ADD CONSTRAINT advice_implicitcallmethodtoadvice_fk
FOREIGN KEY (adviceid)
REFERENCES advice (id) ON DELETE CASCADE ON UPDATE CASCADE
;