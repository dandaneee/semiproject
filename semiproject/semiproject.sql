create table stsboard(
bd_no number primary key,
bd_name varchar2(100) not null,
bd_title varchar2(200) not null,
bd_content varchar2(4000) not null,
bd_date date not null)

create sequence stsbd_seq nocache

insert into stsboard values(stsbd_seq.nextval, '시험용', '스프링mvc게시판', 'jsp servlet', sysdate)

select * from stsboard

---------------------

create table BDMEMBER(
bm_no number not null,
bm_id varchar2(500) not null,
bm_pw varchar2(500) not null,
bm_name varchar2(1000) not null,
bm_addr varchar2(4000) not null,
bm_phone varchar2(4000) not null,
bm_email varchar2(100) not null,
constraint bdmember_pk primary key(bm_no),
constraint bdmember_uq_id unique (bm_id),
constraint bdmember_uq_phone unique(bm_phone),
constraint bdmember_uq_email unique(bm_email),

create sequence bdno_seq nocache

insert into BDMEMBER values (1, 'admin' , 'admin0' , '관리자' , '인천광역시' , '010-0000-0000' , 'bd_admin@member.com' , 'y' , 'admin' )

insert into BDMEMBER values (bdno_seq.nextval, 'user1' , '1111' , '회원1' , '서울특별시' , '010-1111-1111' , 'user1@hi.hello' , 'y' , 'user' )