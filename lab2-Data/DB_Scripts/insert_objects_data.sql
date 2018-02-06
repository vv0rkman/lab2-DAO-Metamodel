INSERT ALL
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (11, null, 'ATT',1)    
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (12, null, 'Cricket',1)    
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (13, null, 'O2',1)    
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (14, null, 'Rostelecom',1)    
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (15, null, 'T-Mobile',1)    
SELECT DUMMY FROM dual;    

INSERT ALL
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (21, 11, 'Project for ATT',2)    
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (22, 12, 'Project for Cricket',2)    
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (23, 13, 'Project for O2',2)    
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (24, 15, 'Project for T-Mobile',2)    
SELECT DUMMY FROM dual;    

INSERT ALL
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (31, 21, 'Sprint 1.21',3)    
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (32, 21, 'Sprint 2.21',3)    
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (33, 22, 'Sprint 1.22',3)    
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (34, 23, 'Sprint 1.23',3)    
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (35, 24, 'Sprint 1.24',3)    
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (36, 21, 'Sprint 3.21',3)    
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (37, 22, 'Sprint 2.22',3)    
SELECT DUMMY FROM dual;    

INSERT ALL
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (41, 31, 'Task 1.1.21',4)    
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (42, 31, 'Task 2.1.21',4)    
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (43, 31, 'Task 3.1.21',4)    
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (44, 33, 'Task 1.1.22',4)    
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (45, 32, 'Task 1.2.21',4)    
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (46, 36, 'Task 1.3.21',4)
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (47, 34, 'Task 1.1.23',4)
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (48, 35, 'Task 1.2.23',4)
SELECT DUMMY FROM dual;    

INSERT ALL
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (51, 62, 'Smith',5)    
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (52, 63, 'Allen',5)    
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (53, 64, 'Ward',5)    
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (54, 61, 'Jones',5)    
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (55, 61, 'Scott',5)    
SELECT DUMMY FROM dual;    

INSERT ALL
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (61, null, 'Management',6)    
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (62, null, 'IT',6)    
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (63, null, 'Marketing',6)    
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (64, null, 'Sales',6)    
    INTO Objects (object_id, parent_id, object_name, object_type_id) VALUES (65, null, 'Accounting',6)    
SELECT DUMMY FROM dual;    