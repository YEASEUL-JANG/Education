create view test_v
as
select*from emp;

create or replace view test_v -- 이미 존재하는 뷰의 내용 수정
as
select*from emp;

create or replace view test_view
as
select empno, ename, e.deptno, dname
from emp e, dept d --조인대상 테이블
where e.deptno=d.deptno;

select * from user_views;

create or replace view emp_v
as
select empno, ename, hiredate, sal from emp;
insert into emp_v values (8000, 'kim', sysdate, 700);
select * from emp_v;
delete from emp_v where empno=8000;

drop view emp_v;

create or replace view emp_v
as
select empno, ename, hiredate, sal from emp
with read only; 

select rowid, empno, ename from emp; -- 행의 주소값 : rowid

create index c_emp_name_idx on c_emp(name);
drop index c_emp_name_idx;

select empno,ename from emp where empno=7900;
select empno,ename from emp -- 비용이 인덱스스캔때보다 3배늘어남
where ename='송기성';

create index emp_ename_idx on emp(ename);
drop index emp_ename_idx;

create table emp3 (
no number,
name varchar2(10),
sal number
);

--PL/SQL 오라클에서 제공해주는 제어문
declare 
i number := 1;
name varchar(20) := 'kim';
sal number := 0;
begin
while i < 1000000 loop
if i mod 2 = 0 then
name := 'kim' || to_char(i);
sal := 300;
elsif i mod 3 = 0 then
name := 'park' || to_char(i);
sal := 400;
elsif i mod 5 = 0 then
name := 'hong' || to_char(i);
sal := 500;
else
name := 'shin' || to_char(i);
sal := 250;
end if; 
insert into emp3 values (i,name,sal); 
i := i + 1; 
end loop; 
end;
/
commit;

select count(*) from emp3;

select * from emp3 where name='shin691' and sal > 200;
create index emp_name_idx on emp3(name,sal);

select * from user_indexes where table_name='EMP3';

drop index emp_name_idx;

create table emp4 (
no number primary key,
name varchar2(10),
sal number
);
select * from user_indexes where table_name='EMP4';
select * from emp3;
select * from emp3 where no>900000; 

alter table emp3 add constraint emp3_no_pk primary key(no);

 desc emp3;

select * from user_indexes where table_name='EMP3'; --인덱스 확인

alter table emp3 drop constraint emp3_no_pk;-- 제약조건을 지우면 인덱스도 지워진다.

create index emp_name_idx on emp3(name,sal); -- 결합인덱스 생성

create sequence c_emp_seq
increment by 1
start with 103
maxvalue 1000
nocache 
nocycle; --103부터 1씩 증가하는 시퀀스

select c_emp_seq.nextval from dual;--다음차수
select c_emp_seq.currval from dual;--현재차수

insert into c_emp values(c_emp_seq.nextval, 'aaa', 100,'3429-001',10);
insert into c_emp values( ( select nvl(max(id)+1,1) from c_emp ) , 'test', 300, '3429-0000', 10);

select nvl( max(id)+1, 1 ) from c_emp;

drop sequence c_emp_seq;

create sequence c_emp_seq
start with 1 -- 1부터 시작
increment by 1 -- 1씩 증가
maxvalue 100000
--nomaxvalue
nocache
nocycle;

select c_emp_seq.nextval from dual;
select * from c_emp;

insert into c_emp values
(c_emp_seq.nextval, 'kim',300,'3429-0000',10);

insert into c_emp values
(c_emp_seq.nextval, 'park',400,'3429-0001',10);
select * from c_emp;

insert into c_emp values
((select max(id)+1 from c_emp), 'kim7',300,'3429-0002',10);

delete from c_emp;-- 다지움

select max(id)+1 from c_emp;--null값이 나옴

select nvl(max(id)+1,1) from c_emp; -- null값 방지

insert into c_emp values
( (select nvl(max(id)+1,1) from c_emp), 'kim15', 400, '3429-0001',10);

delete from c_emp where name='kim15';

alter table c_emp drop constraint C_EMP_PHONE_CK;



문제1]
create table test_member(
id number(5),
name varchar(20),
pay number(10),
email varchar(50)
);

create sequence test_member_seq
start with 100 
increment by 1 
maxvalue 1000
nocache
nocycle;

insert into test_member values
(test_member_seq.nextval, 'kim', 450, 'kim@gmail.com');
insert into test_member values
(test_member_seq.nextval, 'lee', 500, 'lee@naver.com');
insert into test_member values
(test_member_seq.nextval,  'park', 600, 'park@daum.com');



문제2]
create table test_sub(
id number(5),
name varchar(20),
pay number(10),
email varchar(50)
);

insert into test_sub values
( (select nvl(max(id)+1,1) from test_sub), 'kim', 450, 'kim@gmail.com');
insert into test_sub values
( (select nvl(max(id)+1,1) from test_sub), 'lee', 500, 'lee@naver.com');
insert into test_sub values
( (select nvl(max(id)+1,1) from test_sub), 'park', 600, 'park@daum.com');

------------------------------------------------------------------------------------------------
select ename, job, sal, comm, sal * 0.03 커미션
from emp
where comm is null;

select ename, job, sal, comm, nvl(comm,sal * 0.03) 커미션
from emp;

-- 형식 : nvl2(A,B,C) A가null이 아니면 B, null이면 C
-- *nvl2(comm,0.05,0.03) 커미션이 있었으면 5%, 없는직원은 3% 특별보너스 적용

select ename, deptno, sal, comm, sal*nvl2(comm,0.05,0.03) 특별보너스
from emp;

-- 형식 : nullif(비교값1, 비교값2) : 두값이 같으면 null 다르면 비교값1을 반환
select ename, sal from emp order by sal desc;
select ename, sal, nullif(sal, 325) from emp order by sal desc;

-- 형식 : coalesce(값1, 값2, 값3, ...) null이 아닌 첫번째 값
select empno, ename, comm, sal, coalesce(comm, sal, 20) 치환값
from emp;

update emp set sal=null where empno=7788;

select ename, sal, trunc(nvl(sal,0)/100)
,decode(trunc(nvl(sal,0)/100), 
0, 'E',
1, 'D',
2, 'C',
3, 'B',
'A') 급여등급 from emp
order by 급여등급;

update emp set sal=80 where ename='황인태';

create table score (
student_no varchar2(20) primary key,
name varchar2(20) not null,
kor number(3) default 0,
eng number(3) default 0,
mat number(3) default 0
);
insert into score values ('1','kim',90,80,70);
insert into score values ('2','park',88,85,75);
insert into score values ('3','hong',99,89,79);

select name, kor, eng, mat, (kor+eng+mat) 총점
, ( round((kor+eng+mat)/3,2) ) 평균
,decode( trunc(((kor+eng+mat)/3)/10)
,10,'A', 9, 'A', 8, 'B', 7,'C',6,'D','F') 등급
from score;

insert into score values ('4','choi',100,100,100);

select name, position,
case when position = '정교수' then (pay+nvl(bonus,0))*1.1
when position = '조교수' then (pay+nvl(bonus,0))*1.07
when position = '전임강사' then (pay+nvl(bonus,0))*1.05
else pay+nvl(bonus,0)
end 급여
from professor
order by 급여 desc;

select empno, ename, deptno, 
 case when deptno=10 then '경리부'
        when deptno=20 then '인사과'
        when deptno=30 then '영업부'
        else '미배정'
        end 부서명
        from emp;

select deptno, ename, sal,
rank() over(order by nvl(sal,0) desc) "급여 순위"
from emp;

select deptno, ename, sal,
rank() over(order by nvl(sal,0) desc) "급여 순위1",
dense_rank() over(order by nvl(sal,0) desc) "급여 순위2",
row_number() over(order by nvl(sal,0) desc) "급여 순위3"
from emp;

select deptno, ename, sal,
rank() over(partition by deptno order by nvl(sal,0) desc) "부서내
급여 순위"
from emp;


문제3]
create table mart(
id varchar2(20) primary key,
pname varchar2(20) not null,
price number(10) default 0,
count number(4) default 0,
company varchar2(10)
);

insert into mart values('1','라면',1000,10,'삼양');
insert into mart values('2','과자',1500,3,'오리온');
insert into mart values('3','아이스크림',2000,8,'빙그레');
insert into mart values('4','건빵',1800,5,'크라운');
insert into mart values('5','맥주',3000,4,'하이트');
insert into mart values('6','도시락',5000,5,'CJ');

SELECT*FROM MART;

3-1)
select pname 제품이름, price 단가, count 수량, company 제조회사, 
price*count 판매금액,
decode(TRUNC((price*count)/10000,0), 1,'C',2,'B',3,'A','D') 등급,
rank() over(order by price*count) 순위
from mart;

3-2)
select pname 제품이름, price 단가, count 수량, company 제조회사, 
price*count 판매금액,
case when (price*count) >=30000 then 'A'
       when (price*count) >=20000 then 'B'
       when (price*count) >=10000 then 'C'
       else 'D'
       END 등급,
rank() over(order by price*count) 순위
from mart;

