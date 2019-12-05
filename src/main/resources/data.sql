create table sessionStorage
(
id int primary key AUTO_INCREMENT,
uuid varchar(100) not null,
token varchar(3000) not null,
sign varchar(3000) not null
);