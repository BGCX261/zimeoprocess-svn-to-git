DROP TABLE Field;
DROP TABLE AdviceAdviceImplicitCall;
DROP TABLE MethodAdviceImplicitCall;
DROP TABLE AdviceMethodExplicitCall;
DROP TABLE MethodMethodExplicitCall;
DROP TABLE Advice;
DROP TABLE Method;
DROP TABLE AspectInterfaceImplementation;
DROP TABLE InterfaceInterfaceExtension;
DROP TABLE ClassInterfaceImplementation;
DROP TABLE Interface;
DROP TABLE Pointcut;
DROP TABLE Aspect;
DROP TABLE Class;
DROP TABLE Package;
DROP TABLE Project;

CREATE TABLE Project (
                ProjectName VARCHAR(256) NOT NULL,
                Author VARCHAR(256) NOT NULL,
                CONSTRAINT Project_pk PRIMARY KEY (ProjectName)
);

CREATE TABLE Package (
                PackageName VARCHAR(256) NOT NULL,
                ParentPackageName VARCHAR(256) NULL,
                CONSTRAINT Package_pk PRIMARY KEY (PackageName)
);

CREATE TABLE Interface (
                InterfaceName VARCHAR(256) NOT NULL,
                InterfacePackageName VARCHAR(256) NOT NULL,
                InterfaceModifier VARCHAR(256) NOT NULL,
                CONSTRAINT Interface_pk PRIMARY KEY (InterfaceName, InterfacePackageName)
);

CREATE TABLE Class (
                ClassName VARCHAR(256) NOT NULL,
                ClassPackageName VARCHAR(256) NOT NULL,
                SuperclassName VARCHAR(256) NULL,
                SuperclassPackageName VARCHAR(256) NOT NULL,
                ClassModifier VARCHAR(256) NOT NULL,
                CONSTRAINT Class_pk PRIMARY KEY (ClassName, ClassPackageName)
);

CREATE TABLE ClassInterfaceImplementation (
                InterfacePackageName VARCHAR(256) NOT NULL,
                InterfaceName VARCHAR(256) NOT NULL,
                ClassPackageName VARCHAR(256) NOT NULL,
                ClassName VARCHAR(256) NOT NULL,
                CONSTRAINT ClassInterfaceImplementation_pk PRIMARY KEY (InterfacePackageName, InterfaceName, ClassPackageName, ClassName)
);

CREATE TABLE InterfaceInterfaceExtension (
                ExtendingInterfacePackageName VARCHAR(256) NOT NULL,
                ExtendingInterfaceName VARCHAR(256) NOT NULL,
                ExtendedInterfacePackageName VARCHAR(256) NOT NULL,
                ExtendedInterfaceName VARCHAR(256) NOT NULL,
                CONSTRAINT InterfaceInterfaceExtension_pk PRIMARY KEY (ExtendingInterfacePackageName, ExtendingInterfaceName, ExtendedInterfacePackageName, ExtendedInterfaceName)
);

CREATE TABLE Field (
                FieldName VARCHAR(256) NOT NULL,
                FieldClassName VARCHAR(256) NOT NULL,
                FieldClassPackageName VARCHAR(256) NOT NULL,
                TypeSignature VARCHAR(256) NOT NULL,
                FieldModifier VARCHAR(256) NOT NULL,
                CONSTRAINT Field_pk PRIMARY KEY (FieldName, FieldClassName, FieldClassPackageName)
);

CREATE TABLE Method (
                MethodSignature VARCHAR(256) NOT NULL,
                MethodName VARCHAR(256) NOT NULL,
                MethodClassName VARCHAR(256) NOT NULL,
                MethodClassPackageName VARCHAR(256) NOT NULL,
                MethodModifier VARCHAR(256) NOT NULL,
                CONSTRAINT Method_pk PRIMARY KEY (MethodSignature, MethodName, MethodClassName, MethodClassPackageName)
);

CREATE TABLE MethodMethodExplicitCall (
                CallerMethodSignature VARCHAR(256) NOT NULL,
                CallerMethodName VARCHAR(256) NOT NULL,
                CallerClassName VARCHAR(256) NOT NULL,
                CallerClassPackageName VARCHAR(256) NOT NULL,
                CalleeMethodSignature VARCHAR(256) NOT NULL,
                CalleeMethodName VARCHAR(256) NOT NULL,
                CalleeClassName VARCHAR(256) NOT NULL,
                CalleeClassPackageName VARCHAR(256) NOT NULL,
                CONSTRAINT MethodMethodExplicitCall_pk PRIMARY KEY (CallerMethodSignature, CallerMethodName, CallerClassName, CallerClassPackageName, CalleeMethodSignature, CalleeMethodName, CalleeClassName, CalleeClassPackageName)
);

CREATE TABLE Aspect (
                AspectName VARCHAR(256) NOT NULL,
                AspectPackageName VARCHAR(256) NOT NULL,
                SuperAspectName VARCHAR(256) NOT NULL,
                SuperAspectPackageName VARCHAR(256) NOT NULL,
                SuperClassName VARCHAR(256) NOT NULL,
                SuperClassPackageName VARCHAR(256) NOT NULL,
                CONSTRAINT Aspect_pk PRIMARY KEY (AspectName, AspectPackageName)
);

CREATE TABLE AspectInterfaceImplementation (
                AspectName VARCHAR(256) NOT NULL,
                AspectPackageName VARCHAR(256) NOT NULL,
                InterfaceName VARCHAR(256) NOT NULL,
                InterfacePackageName VARCHAR(256) NOT NULL,
                CONSTRAINT AspectInterfaceImplementation_pk PRIMARY KEY (AspectName, AspectPackageName, InterfaceName, InterfacePackageName)
);

CREATE TABLE Pointcut (
                PointcutName VARCHAR(256) NOT NULL,
                PointcutAspectName VARCHAR(256) NOT NULL,
                PointcutPackageName VARCHAR(256) NOT NULL,
                PointcutSignature VARCHAR(256) NOT NULL,
                CONSTRAINT Pointcut_pk PRIMARY KEY (PointcutName, PointcutAspectName, PointcutPackageName)
);

CREATE TABLE Advice (
                AdviceAspectName VARCHAR(256) NOT NULL,
                AdviceAspectPackageName VARCHAR(256) NOT NULL,
                AdviceLocalID INTEGER NOT NULL,
                PointcutPackageName VARCHAR(256) NOT NULL,
                PointcutAspectName VARCHAR(256) NOT NULL,
                PointcutName VARCHAR(256) NOT NULL,
                AdviceSignature VARCHAR(256) NOT NULL,
                CONSTRAINT Advice_pk PRIMARY KEY (AdviceAspectName, AdviceAspectPackageName, AdviceLocalID)
);

CREATE TABLE MethodAdviceImplicitCall (
                MethodSignature VARCHAR(256) NOT NULL,
                MethodName VARCHAR(256) NOT NULL,
                MethodClassName VARCHAR(256) NOT NULL,
                MethodClassPackageName VARCHAR(256) NOT NULL,
                AdviceAspectName VARCHAR(256) NOT NULL,
                AdviceAspectPackageName VARCHAR(256) NOT NULL,
                AdviceLocalID INTEGER NOT NULL,
                CONSTRAINT MethodAdviceImplicitCall_pk PRIMARY KEY (MethodSignature, MethodName, MethodClassName, MethodClassPackageName, AdviceAspectName, AdviceAspectPackageName, AdviceLocalID)
);

CREATE TABLE AdviceMethodExplicitCall (
                MethodSignature VARCHAR(256) NOT NULL,
                MethodName VARCHAR(256) NOT NULL,
                MethodClassName VARCHAR(256) NOT NULL,
                MethodClassPackageName VARCHAR(256) NOT NULL,
                AdviceAspectName VARCHAR(256) NOT NULL,
                AdviceAspectPackageName VARCHAR(256) NOT NULL,
                AdviceLocalID INTEGER NOT NULL,
                CONSTRAINT AdviceMethodExplicitCall_pk PRIMARY KEY (MethodSignature, MethodName, MethodClassName, MethodClassPackageName, AdviceAspectName, AdviceAspectPackageName, AdviceLocalID)
);

CREATE TABLE AdviceAdviceImplicitCall (
                AdvisedAspectName VARCHAR(256) NOT NULL,
                AdvisedAspectPackageName VARCHAR(256) NOT NULL,
                AdvisedAspectLocalID INTEGER NOT NULL,
                AdvisingAspectName VARCHAR(256) NOT NULL,
                AdvisingAspectPackageName VARCHAR(256) NOT NULL,
                AdvisingAspectLocalID INTEGER NOT NULL,
                CONSTRAINT AdviceAdviceImplicitCall_pk PRIMARY KEY (AdvisedAspectName, AdvisedAspectPackageName, AdvisedAspectLocalID, AdvisingAspectName, AdvisingAspectPackageName, AdvisingAspectLocalID)
);


ALTER TABLE Package ADD CONSTRAINT Package_Package_fk
FOREIGN KEY (ParentPackageName)
REFERENCES Package (PackageName)
;


ALTER TABLE Class ADD CONSTRAINT Package_Class_fk
FOREIGN KEY (ClassPackageName)
REFERENCES Package (PackageName)
;


ALTER TABLE Interface ADD CONSTRAINT Package_Interface_fk
FOREIGN KEY (InterfacePackageName)
REFERENCES Package (PackageName)
;


ALTER TABLE Aspect ADD CONSTRAINT Package_Aspect_fk
FOREIGN KEY (AspectPackageName)
REFERENCES Package (PackageName)
;


ALTER TABLE ClassInterfaceImplementation ADD CONSTRAINT Interface_ClassInterfaceRelationship_fk
FOREIGN KEY (InterfaceName, InterfacePackageName)
REFERENCES Interface (InterfaceName, InterfacePackageName)
;


ALTER TABLE InterfaceInterfaceExtension ADD CONSTRAINT Interface_InterfaceInterfaceExtension_fk_extended
FOREIGN KEY (ExtendedInterfaceName, ExtendedInterfacePackageName)
REFERENCES Interface (InterfaceName, InterfacePackageName)
;


ALTER TABLE InterfaceInterfaceExtension ADD CONSTRAINT Interface_InterfaceInterfaceExtension_fk_extending
FOREIGN KEY (ExtendingInterfaceName, ExtendingInterfacePackageName)
REFERENCES Interface (InterfaceName, InterfacePackageName)
;


ALTER TABLE AspectInterfaceImplementation ADD CONSTRAINT Interface_AspectInterfaceImplementation_fk
FOREIGN KEY (InterfaceName, InterfacePackageName)
REFERENCES Interface (InterfaceName, InterfacePackageName)
;


ALTER TABLE ClassInterfaceImplementation ADD CONSTRAINT Class_ClassInterfaceRelationship_fk
FOREIGN KEY (ClassName, ClassPackageName)
REFERENCES Class (ClassName, ClassPackageName)
;


ALTER TABLE Class ADD CONSTRAINT Class_Class_fk
FOREIGN KEY (SuperclassName, SuperclassPackageName)
REFERENCES Class (ClassName, ClassPackageName)
;


ALTER TABLE Field ADD CONSTRAINT Class_Field_fk
FOREIGN KEY (FieldClassName, FieldClassPackageName)
REFERENCES Class (ClassName, ClassPackageName)
;


ALTER TABLE Method ADD CONSTRAINT Class_Method_fk
FOREIGN KEY (MethodClassPackageName, MethodClassName)
REFERENCES Class (ClassName, ClassPackageName)
;


ALTER TABLE Aspect ADD CONSTRAINT Class_Aspect_fk
FOREIGN KEY (SuperClassName, SuperClassPackageName)
REFERENCES Class (ClassName, ClassPackageName)
;


ALTER TABLE MethodMethodExplicitCall ADD CONSTRAINT Method_MethodMethodExplicitCall_fk_caller
FOREIGN KEY (CallerClassPackageName, CallerMethodName, CallerClassName, CallerMethodSignature)
REFERENCES Method (MethodSignature, MethodName, MethodClassName, MethodClassPackageName)
;


ALTER TABLE MethodMethodExplicitCall ADD CONSTRAINT Method_MethodMethodExplicitCall_fk_callee
FOREIGN KEY (CalleeClassPackageName, CalleeMethodName, CalleeClassName, CalleeMethodSignature)
REFERENCES Method (MethodSignature, MethodName, MethodClassName, MethodClassPackageName)
;


ALTER TABLE MethodAdviceImplicitCall ADD CONSTRAINT Method_MethodAdviceImplicitCall_fk
FOREIGN KEY (MethodSignature, MethodName, MethodClassName, MethodClassPackageName)
REFERENCES Method (MethodSignature, MethodName, MethodClassName, MethodClassPackageName)
;


ALTER TABLE AdviceMethodExplicitCall ADD CONSTRAINT Method_AdviceMethodExplicitCall_fk
FOREIGN KEY (MethodSignature, MethodName, MethodClassName, MethodClassPackageName)
REFERENCES Method (MethodSignature, MethodName, MethodClassName, MethodClassPackageName)
;


ALTER TABLE Aspect ADD CONSTRAINT Aspect_Aspect_fk
FOREIGN KEY (SuperAspectName, SuperAspectPackageName)
REFERENCES Aspect (AspectName, AspectPackageName)
;


ALTER TABLE AspectInterfaceImplementation ADD CONSTRAINT Aspect_AspectInterfaceImplementation_fk
FOREIGN KEY (AspectName, AspectPackageName)
REFERENCES Aspect (AspectName, AspectPackageName)
;


ALTER TABLE Pointcut ADD CONSTRAINT Aspect_Pointcut_fk
FOREIGN KEY (PointcutAspectName, PointcutPackageName)
REFERENCES Aspect (AspectName, AspectPackageName)
;


ALTER TABLE Advice ADD CONSTRAINT Aspect_Advice_fk
FOREIGN KEY (AdviceAspectName, AdviceAspectPackageName)
REFERENCES Aspect (AspectName, AspectPackageName)
;


ALTER TABLE Advice ADD CONSTRAINT Pointcut_Advice_fk
FOREIGN KEY (PointcutAspectName, PointcutName, PointcutPackageName)
REFERENCES Pointcut (PointcutName, PointcutAspectName, PointcutPackageName)
;


ALTER TABLE AdviceAdviceImplicitCall ADD CONSTRAINT Advice_AdviceAdviceImplicitCall_fk_advised
FOREIGN KEY (AdvisedAspectName, AdvisedAspectPackageName, AdvisedAspectLocalID)
REFERENCES Advice (AdviceAspectName, AdviceAspectPackageName, AdviceLocalID)
;


ALTER TABLE AdviceAdviceImplicitCall ADD CONSTRAINT Advice_AdviceAdviceImplicitCall_fk_advising
FOREIGN KEY (AdvisingAspectName, AdvisingAspectPackageName, AdvisingAspectLocalID)
REFERENCES Advice (AdviceAspectName, AdviceAspectPackageName, AdviceLocalID)
;


ALTER TABLE MethodAdviceImplicitCall ADD CONSTRAINT Advice_MethodAdviceImplicitCall_fk
FOREIGN KEY (AdviceAspectName, AdviceAspectPackageName, AdviceLocalID)
REFERENCES Advice (AdviceAspectName, AdviceAspectPackageName, AdviceLocalID)
;


ALTER TABLE AdviceMethodExplicitCall ADD CONSTRAINT Advice_AdviceMethodExplicitCall_fk
FOREIGN KEY (AdviceAspectName, AdviceAspectPackageName, AdviceLocalID)
REFERENCES Advice (AdviceAspectName, AdviceAspectPackageName, AdviceLocalID)
;