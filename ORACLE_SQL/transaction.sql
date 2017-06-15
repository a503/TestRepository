create table account(
  ano varchar(20) primary key,
  aowner varchar(10) not null,
  abalance number not null
);

drop table account;

insert into account values
('111-111', 'Hong', 1000000);

insert into account values
('222-222', 'Spring', 0);

select * from account;

rollback;

--  기능 단위의 트랜잭션 처리
update account set abalance=abalance-10000 where ano='111-111';
update account set abalance=abalance+10000 where ano='222-222';