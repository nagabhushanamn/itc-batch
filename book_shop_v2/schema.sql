
create table BOOKS(
isbn varchar(10) primary key,
name varchar(100),
price double,
author varchar(20)
);



create table CHAPTERS(
idx int,
title varchar(100),
isbn varchar(10) references BOOKS(isbn),
primary key (idx,isbn)
);

drop table CHAPTERS;

insert into BOOKS values('12345','JAVA',500.00,'NAG');

insert into CHAPTERS values(1,'INTRODUCTION','12345');
insert into CHAPTERS values(2,'ADVANCED','12345');









