create table IF NOT EXISTS employee (
    employee_id INTEGER primary key auto_increment,
    department_id INTEGER,
    division_id INTEGER,
    class_id INTEGER,
    employee_no INTEGER,
    employee_name varchar(200),
    employee_password varchar(100)
);

insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (1,1,1,1,'テスト太郎','123');