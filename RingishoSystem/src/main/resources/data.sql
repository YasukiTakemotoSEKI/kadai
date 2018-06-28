DROP TABLE employee;
DROP TABLE app;
DROP TABLE price;

create table IF NOT EXISTS employee (
    employee_id INTEGER primary key auto_increment,
    department_id INTEGER,
    division_id INTEGER,
    position_id INTEGER,
    employee_no INTEGER,
    employee_name varchar(200),
    employee_password varchar(200)
);

insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (1,0,3,1131,'butyou@eigyou','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');
insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (1,1,2,1122,'katyoua@eigyou1','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');
insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (1,1,1,1114,'hiraa@eigyou1','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');
insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (1,1,1,1115,'hirab@eigyou1','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');
insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (1,1,1,1116,'hirac@eigyou1','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');
insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (1,2,2,1222,'katyoub@eigyou2','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');
insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (1,2,1,1214,'hiraa@eigyou2','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');
insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (1,2,1,1215,'hirab@eigyou2','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');
insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (1,2,1,1216,'hirac@eigyou2','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');
insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (2,0,3,2131,'butyou@soumu','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');
insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (2,1,2,2122,'katyoua@soumu1','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');
insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (2,1,1,2114,'hiraa@soumu1','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');
insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (2,1,1,2115,'hirab@soumu1','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');
insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (2,1,1,2116,'hirac@soumu1','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');
insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (2,2,2,2222,'katyoub@soumu2','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');
insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (2,2,1,2214,'hiraa@soumu2','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');
insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (2,2,1,2215,'hirab@soumu2','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');
insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (2,2,1,2216,'hirac@soumu2','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');
insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (3,0,2,3121,'butyou@seizou','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');
insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (3,1,3,3132,'katyoua@seizou1','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');
insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (3,1,2,3124,'hiraa@seizou1','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');
insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (3,1,1,3115,'hirab@seizou1','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');
insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (3,1,1,3116,'hirac@seizou1','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');
insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (3,2,2,3222,'katyoub@seizou2','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');
insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (3,2,1,3214,'hiraa@seizou2','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');
insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (3,2,1,3215,'hirab@seizou2','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');
insert into employee (department_id, division_id, position_id, employee_no, employee_name, employee_password) values (3,2,1,3216,'hirac@seizou2','$2a$10$1QoSumU.HAfvLUCFt2DZres3k8Xr7Y5PE23maWzkhh9CYPl/lZzpe');

create table IF NOT EXISTS position (
    position_id INTEGER primary key auto_increment,
    position_name varchar(200)
);

insert into position (position_id, position_name) values (1,'社員');
insert into position (position_id, position_name) values (2,'課長');
insert into position (position_id, position_name) values (3,'部長');


create table IF NOT EXISTS department (
    department_id INTEGER primary key auto_increment,
    department_name varchar(200)
);

insert into department (department_id, department_name) values (1,'営業部');
insert into department (department_id, department_name) values (2,'総務部');
insert into department (department_id, department_name) values (3,'製造部');


create table IF NOT EXISTS division (
    division_id INTEGER primary key auto_increment,
    division_name varchar(200)
);

insert into division (division_id, division_name) values (1,'一課');
insert into division (division_id, division_name) values (2,'二課');


create table IF NOT EXISTS flow (
    flow_id INTEGER primary key auto_increment,
    price_id INTEGER,
    position_id INTEGER,
    flow_order INTEGER
    
);

insert into flow (flow_id, price_id,position_id,flow_order) values (1,1,2,0);
insert into flow (flow_id, price_id,position_id,flow_order) values (2,2,2,0);
insert into flow (flow_id, price_id,position_id,flow_order) values (3,2,3,1);


create table IF NOT EXISTS price (
    price_id INTEGER primary key auto_increment,
    price_value INTEGER
);

insert into price (price_id, price_value) values (1,9999);
insert into price (price_id, price_value) values (2,1000000000);

create table IF NOT EXISTS app (
    app_id INTEGER primary key auto_increment,
    employee_id INTEGER,
    department_id INTEGER,
    division_id INTEGER,
    price_id INTEGER,
    app_status ENUM('進行中','承認済','却下'),
    app_subject varchar(255),
    app_content CLOB,
    app_price INTEGER,
    app_attachment CLOB,
    app_comment CLOB,
    app_start_date varchar(255),
    app_end_date varchar(255)
);

insert into app ( app_id, employee_id, department_id, division_id, price_id, app_status, app_subject, app_content, app_price, app_attachment, app_comment, app_start_date, app_end_date) values (1,4,1,1,2,'進行中','テスト件名','テスト内容',50000,'テスト添付書類','テストコメント','2018/6/26 17:08','null');
insert into app ( app_id, employee_id, department_id, division_id, price_id, app_status, app_subject, app_content, app_price, app_attachment, app_comment, app_start_date, app_end_date) values (2,4,1,1,2,'却下','テスト件名２','テスト内容２',20000000,'テスト添付書類','テストコメント','2018/6/26 17:09','null');
insert into app ( app_id, employee_id, department_id, division_id, price_id, app_status, app_subject, app_content, app_price, app_attachment, app_comment, app_start_date, app_end_date) values (3,5,1,1,2,'承認済','テスト件名３','テスト内容',500000,'テスト添付書類','テストコメント','2018/6/26 17:09','null');
insert into app ( app_id, employee_id, department_id, division_id, price_id, app_status, app_subject, app_content, app_price, app_attachment, app_comment, app_start_date, app_end_date) values (4,5,1,1,2,'進行中','テストデータ１','テスト内容',500000,'テスト添付','テストコメント','2018/06/26 17:28:59','null');
insert into app ( app_id, employee_id, department_id, division_id, price_id, app_status, app_subject, app_content, app_price, app_attachment, app_comment, app_start_date, app_end_date) values (5,5,1,1,2,'却下','テストデータ２','テスト内容',9999,'テスト添付書類','テストコメント','2018/06/26 17:29:24','null');
insert into app ( app_id, employee_id, department_id, division_id, price_id, app_status, app_subject, app_content, app_price, app_attachment, app_comment, app_start_date, app_end_date) values (6,5,1,1,2,'進行中','テストデータ３','テスト内容',500000000,'テスト添付書類','テストコメント','2018/06/26 17:29:43','null');

create table IF NOT EXISTS appflow (
    appflow_id INTEGER primary key auto_increment,
    app_id INTEGER,
    flow_id INTEGER,
    position_id INTEGER,
    appflow_flg BOOLEAN,
    appflow_order INTEGER
);

INSERT INTO appflow (appflow_id, app_id, flow_id, position_id, appflow_flg, appflow_order) values (1,1,2,2,TRUE,0);
INSERT INTO appflow (appflow_id, app_id, flow_id, position_id, appflow_flg, appflow_order) values (2,1,3,3,TRUE,1);

INSERT INTO appflow (appflow_id, app_id, flow_id, position_id, appflow_flg, appflow_order) values (3,2,2,2,FALSE,0);
INSERT INTO appflow (appflow_id, app_id, flow_id, position_id, appflow_flg, appflow_order) values (4,2,3,3,TRUE,1);

INSERT INTO appflow (appflow_id, app_id, flow_id, position_id, appflow_flg, appflow_order) values (5,3,2,2,FALSE,0);
INSERT INTO appflow (appflow_id, app_id, flow_id, position_id, appflow_flg, appflow_order) values (6,3,3,3,FALSE,1);

INSERT INTO appflow (appflow_id, app_id, flow_id, position_id, appflow_flg, appflow_order) values (7,4,2,2,TRUE,0);
INSERT INTO appflow (appflow_id, app_id, flow_id, position_id, appflow_flg, appflow_order) values (8,4,3,3,TRUE,1);

INSERT INTO appflow (appflow_id, app_id, flow_id, position_id, appflow_flg, appflow_order) values (9,5,2,2,TRUE,0);
INSERT INTO appflow (appflow_id, app_id, flow_id, position_id, appflow_flg, appflow_order) values (10,5,3,3,TRUE,1);

INSERT INTO appflow (appflow_id, app_id, flow_id, position_id, appflow_flg, appflow_order) values (11,6,2,2,FALSE,0);
INSERT INTO appflow (appflow_id, app_id, flow_id, position_id, appflow_flg, appflow_order) values (12,6,3,3,TRUE,1);




