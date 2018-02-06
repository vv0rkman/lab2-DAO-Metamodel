DROP TABLE Params;
DROP TABLE Attr;
DROP TABLE Objects;
DROP TABLE Object_types;

CREATE TABLE Object_types(
	object_type_id Integer NOT NULL,
    parent_id Integer,
	object_type_name Varchar2(20) NOT NULL
);

CREATE TABLE Objects(
    object_id Integer NOT NULL,
    parent_id Integer,
    object_name Varchar2(20) NOT NULL,
    object_type_id Integer NOT NULL
);

CREATE TABLE Attr(
    attr_id Integer NOT NULL,
    attr_name Varchar2(20) NOT NULL,
    object_type_id Integer NOT NULL
);

CREATE TABLE Params(
    text_value Varchar2(200),
    number_value Integer,
    date_value Date,
    attr_id Integer NOT NULL,
    object_id Integer NOT NULL
);

CREATE TABLE Objects_permissions(
    role_name Varchar2(40),
    subject_id Integer NOT NULL,
    permission Varchar2(2)
);

CREATE TABLE Object_types_permissions(
    role_name Varchar2(40),
    subject_id Integer NOT NULL,
    permission Varchar2(2)
);

CREATE TABLE Attr_permissions(
    role_name Varchar2(40),
    subject_id Integer NOT NULL,
    permission Varchar2(2)
);