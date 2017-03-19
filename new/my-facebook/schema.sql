
create database myfacebook;
use myfacebook;

create table POSTS(
id int primary key auto_increment,
email varchar(100),
message varchar(256)
);