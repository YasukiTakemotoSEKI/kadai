create table IF NOT EXISTS employee (
    employee_id INTEGER primary key auto_increment,
    department_id INTEGER,
    division_id INTEGER,
    class_id INTEGER,
    employee_no INTEGER,
    employee_name varchar(200),
    employee_password varchar(200)
);

insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (1,1,3,1131,'1課 営業 部長さん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (1,1,2,1122,'1課 営業 課長Aさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (1,1,2,1123,'1課 営業 課長Bさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (1,1,1,1114,'1課 営業 ヒラAさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (1,1,1,1115,'1課 営業 ヒラBさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (1,1,1,1116,'1課 営業 ヒラCさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (1,2,3,1231,'1課 営業 部長さん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (1,2,2,1222,'1課 営業 課長Aさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (1,2,2,1223,'1課 営業 課長Bさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (1,2,1,1214,'1課 営業 ヒラAさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (1,2,1,1215,'1課 営業 ヒラBさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (1,2,1,1216,'1課 営業 ヒラCさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (2,1,3,2131,'2課 総務 部長さん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (2,1,2,2122,'2課 総務 課長Aさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (2,1,2,2123,'2課 総務 課長Bさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (2,1,1,2114,'2課 総務 ヒラAさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (2,1,1,2115,'2課 総務 ヒラBさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (2,1,1,2116,'2課 総務 ヒラCさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (2,2,3,2231,'2課 総務 部長さん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (2,2,2,2222,'2課 総務 課長Aさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (2,2,2,2223,'2課 総務 課長Bさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (2,2,1,2214,'2課 総務 ヒラAさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (2,2,1,2215,'2課 総務 ヒラBさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (2,2,1,2216,'2課 総務 ヒラCさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (3,1,2,3121,'3課 製造 部長さん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (3,1,3,3132,'3課 製造 課長Aさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (3,1,2,3123,'3課 製造 課長Bさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (3,1,2,3124,'3課 製造 ヒラAさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (3,1,1,3115,'3課 製造 ヒラBさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (3,1,1,3116,'3課 製造 ヒラCさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (3,2,3,3231,'3課 製造 部長さん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (3,2,2,3222,'3課 製造 課長Aさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (3,2,2,3223,'3課 製造 課長Bさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (3,2,1,3214,'3課 製造 ヒラAさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (3,2,1,3215,'3課 製造 ヒラBさん','123');
insert into employee (department_id, division_id, class_id, employee_no, employee_name, employee_password) values (3,2,1,3216,'3課 製造 ヒラCさん','123');



create table IF NOT EXISTS app (
    app_id INTEGER primary key,
    employee_id INTEGER,
    department_id INTEGER,
    division_id INTEGER,
    price_id INTEGER,
    app_flg BOOLEAN,
    app_subject varchar(255),
    app_content CLOB,
    app_attachment CLOB,
    app_comment CLOB,
    app_start_date DATE,
    app_end_date DATE
);

insert into app (app_id, employee_id,department_id,division_id,price_id,app_flg,app_subject,app_content,app_attachment,app_comment,app_start_date,app_end_date) values (1,1,1,1,1,false,'稟議システムの決済について','稟議書システムの決済をお願いいたします。','http://tenpusiryooo','とにかくお願いします。',DATE'2018-06-28',null);


create table IF NOT EXISTS appflow (
    appflow_id INTEGER primary key,
    app_id INTEGER,
    flow_id INTEGER,
    employee_id INTEGER,
    appflow_flg BOOLEAN,
    appflow_order INTEGER
);

insert into appflow (appflow_id, app_id,flow_id,employee_id,appflow_flg,appflow_order) values (1,1,1,1,true,0);


create table IF NOT EXISTS class (
    class_id INTEGER primary key,
    class_name varchar(200)
);

insert into class (class_id, class_name) values (1,'社員');
insert into class (class_id, class_name) values (2,'課長');
insert into class (class_id, class_name) values (3,'部長');


create table IF NOT EXISTS department (
    department_id INTEGER primary key,
    department_name varchar(200)
);

insert into department (department_id, department_name) values (1,'営業部');
insert into department (department_id, department_name) values (2,'総務部');
insert into department (department_id, department_name) values (3,'製造部');


create table IF NOT EXISTS division (
    division_id INTEGER primary key,
    division_name varchar(200)
);

insert into division (division_id, division_name) values (1,'一課');
insert into division (division_id, division_name) values (2,'二課');


create table IF NOT EXISTS flow (
    flow_id INTEGER primary key,
    price_id INTEGER,
    class_id INTEGER,
    flow_order INTEGER
    
);

insert into flow (flow_id, price_id,class_id,flow_order) values (1,1,1,0);
insert into flow (flow_id, price_id,class_id,flow_order) values (2,1,2,1);
insert into flow (flow_id, price_id,class_id,flow_order) values (3,2,1,0);
insert into flow (flow_id, price_id,class_id,flow_order) values (4,2,2,1);
insert into flow (flow_id, price_id,class_id,flow_order) values (5,2,3,2);


create table IF NOT EXISTS price (
    price_id INTEGER primary key,
    price_value INTEGER
);

insert into price (price_id, price_value) values (1,9999);
insert into price (price_id, price_value) values (2,10000);
