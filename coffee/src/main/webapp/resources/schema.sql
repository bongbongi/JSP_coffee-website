--2022.12.09 
create table coffee_board (
bno int not null auto_increment,
title varchar(100) not null,
writer varchar(30) not null,
content text not null,
regdate datetime default now(),
read_count int default 0,
image_file text ,
primary key(bno)
);

create table coffee_member(
id varchar(100) not null,
password varchar(100) not null,
name varchar(30) not null,
brith_date datetime not null,
gender varchar(1) not null,
email varchar(100) not null,
mobile varchar(100) not null,
primary key(id)
);