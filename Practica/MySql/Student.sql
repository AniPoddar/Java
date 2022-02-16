Create database Aniruddha;

Use Aniruddha;

Create table Student(
id int primary key not null, 
name varchar(30) not null,
address varchar(40) not null
);

select * from Student;

insert into Student values(1, 'Aniruddha', '4/108, Nelinagar');

insert into Student values(2, 'Koushik', '6/11, Kolkata');

insert into Student values(3, 'Utkarsha', '3/18, Maharastra'); 

Create table Worker(
WORKER_ID int primary key not null,
FIRST_NAME varchar(30) not null,
LAST_NAME varchar(30) not null,
SALARY int not null,
JOINING_DATE datetime,
 DEPARTMENT varchar(20)
 );
 
insert into Worker values(001, 'Monika', 'Arora', 100000, '2014-02-20 09:00:00', 'HR');
insert into Worker values(002, 'Niharika', 'Verma', 80000, '2014-06-11 09:00:00', 'Admin');
insert into Worker values(003, 'Vishal', 'Singhal',	300000, '2014-02-20 09:00:00', 'HR');
insert into Worker values(004, 'Amitabh', 'Singh', 500000, '2014-02-20 09:00:00', 'Admin');
insert into Worker values(005, 'Vivek', 'Bhati', 500000, '2014-06-11 09:00:00', 'Admin');
insert into Worker values(006, 'Vipul', 'Diwan', 200000, '2014-06-11 09:00:00', 'Account');
insert into Worker values(007, 'Satish', 'Kumar', 75000, '2014-01-20 09:00:00', 'Account');
insert into Worker values(008, 'Geetika', 'Chauhan', 90000, '2014-04-11 09:00:00', 'Admin');

 Select * from Worker;

Create table Bonus(
WORKER_REF_ID int not null,
BONUS_DATE datetime,
BONUS_AMOUNT int not null
);

Select * from Bonus;

insert into Bonus values(1, '2016-02-20 00:00:00', 5000);
insert into Bonus values(2, '2016-06-11 00:00:00', 3000);
insert into Bonus values(3, '2016-02-20 00:00:00', 4000);
insert into Bonus values(1, '2016-02-20 00:00:00', 4500);
insert into Bonus values(2, '2016-06-11 00:00:00', 3500);


Create table Title(
WORKER_REF_ID int primary key not null,
WORKER_TITLE varchar(20) not null,
AFFECTED_FROM date
);

Select * from Title;


insert into Title values(1, 'Manager', '2016-02-20 00:00:00');
insert into Title values(2, 'Executive', '2016-06-11 00:00:00');
insert into Title values(8, 'Executive', '2016-06-11 00:00:00');
insert into Title values(5, 'Manager', '2016-06-11 00:00:00');
insert into Title values(4, 'Asst.Manager', '2016-06-11 00:00:00');
insert into Title values(7, 'Executive', '2016-06-11 00:00:00');
insert into Title values(6, 'Lead', '2016-06-11 00:00:00');
insert into Title values(3, 'Lead', '2016-06-11 00:00:00');
         

 







   




