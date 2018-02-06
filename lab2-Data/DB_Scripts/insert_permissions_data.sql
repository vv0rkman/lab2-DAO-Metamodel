INSERT ALL 
    INTO Object_types_permissions (role_name, subject_id, permission) VALUES ('CEO', 1, 'rw')
    INTO Object_types_permissions (role_name, subject_id, permission) VALUES ('CEO', 6, 'rw')
    INTO Object_types_permissions (role_name, subject_id, permission) VALUES ('Marketing', 2, 'r')
    INTO Object_types_permissions (role_name, subject_id, permission) VALUES ('Marketing', 3, '-')
    INTO Object_types_permissions (role_name, subject_id, permission) VALUES ('Production', 2, 'r')
    INTO Object_types_permissions (role_name, subject_id, permission) VALUES ('Production Manager', 3, 'rw')
    INTO Object_types_permissions (role_name, subject_id, permission) VALUES ('Finance', 6, 'r')    
    INTO Object_types_permissions (role_name, subject_id, permission) VALUES ('Developers', 4, 'r')    
SELECT DUMMY FROM dual;

INSERT ALL 
    INTO Attr_permissions (role_name, subject_id, permission) VALUES ('Finance', 15, 'rw')       
SELECT DUMMY FROM dual;

INSERT ALL 
    INTO Objects_permissions (role_name, subject_id, permission) VALUES ('CEO', 55, 'rw')       
SELECT DUMMY FROM dual;