create database jwtexample;

use jwtexample;


SELECT * FROM jwtexample.userdata;

Create Table Employ
(
   eid int auto_increment primary key,
   name varchar(30),
   gender varchar(30),
   email varchar(30),
   password varchar(255),
   roles varchar(100)
);
