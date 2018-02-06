INSERT ALL 
    INTO Object_types (object_type_id, object_type_name, parent_id) VALUES (1, 'Customer', null)
    INTO Object_types (object_type_id, object_type_name, parent_id) VALUES (2, 'Project', 1)
    INTO Object_types (object_type_id, object_type_name, parent_id) VALUES (3, 'Sprint', 2)
    INTO Object_types (object_type_id, object_type_name, parent_id) VALUES (4, 'Task', 3)
    INTO Object_types (object_type_id, object_type_name, parent_id) VALUES (6, 'Department', null)
    INTO Object_types (object_type_id, object_type_name, parent_id) VALUES (5, 'Employee', 6)    
SELECT DUMMY FROM dual;