create database wine;

use wine;

CREATE TABLE test_table (
    `id` int auto_increment,
    `name` varchar(20) not null,
    PRIMARY KEY (id)
);

create table user (
id int primary key auto_increment,
user_id varchar(100) not null,
password varchar(1000) not null,
is_activate tinyint,
reg_dt date
);

create table authority (
name varchar(50) primary key
);