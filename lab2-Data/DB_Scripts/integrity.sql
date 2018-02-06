ALTER TABLE Object_types 
    ADD CONSTRAINT object_type_id_pk 
    PRIMARY KEY (object_type_id);
ALTER TABLE Object_types 
    ADD CONSTRAINT fk_object_types_parent_id 
    FOREIGN KEY (parent_id) 
    REFERENCES Object_types 
    ON DELETE CASCADE;

ALTER TABLE Objects 
    ADD CONSTRAINT object_id_pk 
    PRIMARY KEY (object_id);
ALTER TABLE Objects 
    ADD CONSTRAINT fk_objects_parent_id 
    FOREIGN KEY (parent_id) 
    REFERENCES Objects
    ON DELETE CASCADE;
ALTER TABLE Objects 
    ADD CONSTRAINT fk_objects_object_types 
    FOREIGN KEY (object_type_id) 
    REFERENCES Object_types(object_type_id) 
    ON DELETE CASCADE;

ALTER TABLE Attr 
    ADD CONSTRAINT attr_id_pk 
    PRIMARY KEY (attr_id);
ALTER TABLE Attr 
    ADD CONSTRAINT fk_attr_object_types 
    FOREIGN KEY (object_type_id)
    REFERENCES Object_types(object_type_id) 
    ON DELETE CASCADE;
    
ALTER TABLE Params
    ADD CONSTRAINT fk_params_attr 
    FOREIGN KEY (attr_id) 
    REFERENCES Attr(attr_id) 
    ON DELETE CASCADE;
ALTER TABLE Params
    ADD CONSTRAINT fk_params_object_id 
    FOREIGN KEY (object_id) 
    REFERENCES Objects(object_id) 
    ON DELETE CASCADE;
    
ALTER TABLE Object_types_permissions 
    ADD CONSTRAINT fk_permissions_object_types 
    FOREIGN KEY (subject_id) 
    REFERENCES Object_types(object_type_id) 
    ON DELETE CASCADE;
    
ALTER TABLE Objects_permissions 
    ADD CONSTRAINT fk_permissions_objects 
    FOREIGN KEY (subject_id) 
    REFERENCES Objects(object_id) 
    ON DELETE CASCADE;
    
ALTER TABLE Attr_permissions 
    ADD CONSTRAINT fk_permissions_attr 
    FOREIGN KEY (subject_id) 
    REFERENCES Attr(attr_id) 
    ON DELETE CASCADE;
    
    