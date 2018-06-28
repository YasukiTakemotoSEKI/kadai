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

insert into app ( app_id, employee_id, department_id, division_id, price_id, app_status, app_subject, app_content, app_price, app_attachment, app_comment, app_start_date, app_end_date) values (1,3,1,1,2,'進行中','営業課パソコン増設について','営業課では、営業事務課の顧客データを課の3台のパソコンで開き、日々の営業活動に活用しているが、現在、他の目的でのパソコン利用頻度も高くなってきたため、順番待ちで資料が遅れるなどの支障が発生しており、早急に解決が望まれる。この機会に事務部門と同様、1人1台体制になるよう、パソコンの増設をご承認いただきたい。',175000,'ＰＦＭ310カタログ','','2018/06/28 16:06:45','null');
insert into app ( app_id, employee_id, department_id, division_id, price_id, app_status, app_subject, app_content, app_price, app_attachment, app_comment, app_start_date, app_end_date) values (2,3,1,1,2,'進行中','テスト稟議書','テスト稟議書',1000000,'テストサンプル添付','テストコメント','2018/06/28 16:07:39','null');
insert into app ( app_id, employee_id, department_id, division_id, price_id, app_status, app_subject, app_content, app_price, app_attachment, app_comment, app_start_date, app_end_date) values (3,3,1,1,2,'進行中','テストサンプル件名','テスト内容',5000000,'サンプル添付','テストコメント','2018/06/28 16:08:07','null');
insert into app ( app_id, employee_id, department_id, division_id, price_id, app_status, app_subject, app_content, app_price, app_attachment, app_comment, app_start_date, app_end_date) values (4,3,1,1,1,'進行中','サンプル稟議書','テスト',9999,'添付サンプル','サンプルコメント','2018/06/28 16:08:41','null');
insert into app ( app_id, employee_id, department_id, division_id, price_id, app_status, app_subject, app_content, app_price, app_attachment, app_comment, app_start_date, app_end_date) values (5,7,1,2,1,'進行中','サンプル稟議書9999','サンプル内容',9999,'サンプル添付','サンプルコメント','2018/06/28 16:09:31','null');
insert into app ( app_id, employee_id, department_id, division_id, price_id, app_status, app_subject, app_content, app_price, app_attachment, app_comment, app_start_date, app_end_date) values (6,7,1,2,2,'進行中','サンプル稟議書10000','サンプル内容',10000,'サンプル添付','サンプルコメント','2018/06/28 16:09:54','null');
insert into app ( app_id, employee_id, department_id, division_id, price_id, app_status, app_subject, app_content, app_price, app_attachment, app_comment, app_start_date, app_end_date) values (7,12,2,1,1,'進行中','サンプル件名9999','サンプル内容',9999,'サンプル添付','サンプルコメント','2018/06/28 16:10:48','null');
insert into app ( app_id, employee_id, department_id, division_id, price_id, app_status, app_subject, app_content, app_price, app_attachment, app_comment, app_start_date, app_end_date) values (8,12,2,1,2,'進行中','サンプル10000','サンプル内容',10000,'添付書類','コメント','2018/06/28 16:11:14','null');


create table IF NOT EXISTS appflow (
    appflow_id INTEGER primary key auto_increment,
    app_id INTEGER,
    flow_id INTEGER,
    position_id INTEGER,
    appflow_flg BOOLEAN,
    appflow_order INTEGER
);

INSERT INTO appflow (appflow_id, app_id, appflow_flg, appflow_order, flow_id, position_id) values (1,1,TRUE,0,2,2);
INSERT INTO appflow (appflow_id, app_id, appflow_flg, appflow_order, flow_id, position_id) values (2,1,TRUE,1,3,3);
INSERT INTO appflow (appflow_id, app_id, appflow_flg, appflow_order, flow_id, position_id) values (3,2,TRUE,0,2,2);
INSERT INTO appflow (appflow_id, app_id, appflow_flg, appflow_order, flow_id, position_id) values (4,2,TRUE,1,3,3);
INSERT INTO appflow (appflow_id, app_id, appflow_flg, appflow_order, flow_id, position_id) values (5,3,TRUE,0,2,2);
INSERT INTO appflow (appflow_id, app_id, appflow_flg, appflow_order, flow_id, position_id) values (6,3,TRUE,1,3,3);
INSERT INTO appflow (appflow_id, app_id, appflow_flg, appflow_order, flow_id, position_id) values (7,4,TRUE,0,1,2);
INSERT INTO appflow (appflow_id, app_id, appflow_flg, appflow_order, flow_id, position_id) values (8,5,TRUE,0,1,2);
INSERT INTO appflow (appflow_id, app_id, appflow_flg, appflow_order, flow_id, position_id) values (9,6,TRUE,0,2,2);
INSERT INTO appflow (appflow_id, app_id, appflow_flg, appflow_order, flow_id, position_id) values (10,6,TRUE,1,3,3);
INSERT INTO appflow (appflow_id, app_id, appflow_flg, appflow_order, flow_id, position_id) values (11,7,TRUE,0,1,2);
INSERT INTO appflow (appflow_id, app_id, appflow_flg, appflow_order, flow_id, position_id) values (12,8,TRUE,0,2,2);
INSERT INTO appflow (appflow_id, app_id, appflow_flg, appflow_order, flow_id, position_id) values (13,8,TRUE,1,3,3);






