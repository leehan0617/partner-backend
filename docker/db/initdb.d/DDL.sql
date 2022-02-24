create database wine;

use wine;

create table tb_member (
    id int primary key auto_increment,
    user_id varchar(200),
    password varchar(2000),
    reg_dt date
);

create table authority (
    id int primary key auto_increment,
    member_id int not null,
    role varchar(45)
);

create table member_detail (
    id int primary key auto_increment,
    member_id int,
    name varchar(200),
    region varchar(100),
    phone_number varchar(100),
    address varchar(500),
    detail_address varchar(500),
    zip_code varchar(20),
    operating_time varchar(300),
    pickup_time varchar(300),
    holiday varchar(300),
    temp_holiday varchar(300),
    bank_name varchar(50),
    account_name varchar(100),
    account_number varchar(100)
);

create table subscribe_certification (
    id int primary key auto_increment,
    member_id int,
    customer_info varchar(200),
    reg_dt date
);

create table tb_order (
    id varchar(200) primary key,
    member_id int,
    settlement_id int,
    order_type varchar(50),
    customer_name varchar(100),
    customer_birth varchar(50),
    customer_phone varchar(100),
    wine_name varchar(200),
    per_price int,
    supply_price int,
    amount int,
    reg_dt_str varchar(10),
    reg_dt date
);

create table settlement (
    id int primary key auto_increment,
    order_date date,
    year int,
    month int,
    day int
);

create table order_status (
    id int primary key auto_increment,
    order_id varchar(200),
    status_code varchar(45),
    agent_name varchar(45),
    agent_birth varchar(45)
);