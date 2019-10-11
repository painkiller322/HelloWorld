drop table user_login purge;

create table user_login(id varchar2(10), passwd varchar2(30), name varchar2(50));

create table boards(board_no number not null,
			title varchar2(100) not null,
			content varchar2(300) not null,
			writer varchar2(10) not null,
			creation_date date,
			orig_no number);

alter table user_login add constraint user_login_pk primary key(id);
      
alter table boards add constraint board_pk primary key(board_no);
      
insert into user_login values ('user1', '1234', 'cahngho');
insert into user_login values ('user2', '1234', 'user2');
insert into user_login values ('user3', '1234', 'admin');

select * from user_login;

select name from user_login
where id='user1' and passwd='1234';

insert into boards values (1, 'title1', 'content1', 'user1', sysdate, null);
insert into boards values (2, 'title1', 'content1', 'user1', sysdate, null);
insert into boards values (3, 'title1', 'content1', 'user1', sysdate, 1);
insert into boards values (4, 'title1', 'content1', 'user1', sysdate, 2);
insert into boards values (5, 'title1', 'content1', 'user1', sysdate, 1);
insert into boards values (6, 'title1', 'content1', 'user1', sysdate, 2);
insert into boards values ((select max(board_no)+1 from boards), 'title1', 'contetn1', 'user1', sysdate, null);

select nvl(max(board_no), 0)+1 from boards;

create sequence board_seq;
select board_seq.nextval from dual;

select * from boards;

/*
1번 원본글(select * from boards where board_no=1)
댓글(select * from boards where orig_no=1;)
*/