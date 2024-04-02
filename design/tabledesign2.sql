create database pr;
show databases;
use pr;

create table traffic(tno int primary key,
ttype varchar(20) not null, 
no varchar(6) not null, 
route varchar(50), 
comment varchar(1000)
);

select * from traffic;

create table guide(pcode int primary key,
pname varchar(100) not null,
ptype varchar(4) not null,
paddress varchar(200) not null,
ptel varchar(30),
pgps varchar(30),
pcomment varchar(1000),
premark varchar(500));

create table notice(no int primary key,
title varchar(100) not null,
contents varchar(1000) not null,
resdate varchar(30) not null,
author varchar(20) not null,
visited int (10) default 0);



create table qna(no int primary key,
title varchar(100) not null, 
plevel varchar(10) not null,
pano int,
contents varchar(1000) not null,
resdate varchar(30) not null,
author varchar(20) not null,
mno int,
visited int(10) default 0);

ALTER TABLE qna
ADD CONSTRAINT fk_qna_member
FOREIGN KEY (mno) REFERENCES member(mno);


create table member(mno int primary key,
name varchar(30) not null,
id varchar(30) not null,
pw varchar(30) not null,
birth int not null,
adress varchar(200));

create table DATA(no int primary key,
    title varchar(100) not null,
    contents varchar(1000) not null,
    resdate varchar(30) not null,
    visited int(10) default 0,
    file varchar(200)
);