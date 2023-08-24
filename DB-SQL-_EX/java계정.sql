show parameter undo;
alter system set undo_retention=1500;

select * from tab;
select * from member;
--레코드 삭제
delete from member 
where userid='kim';

-- 삭제된 레코드 확인
select*from member as of
TIMESTAMP(systimestamp-interval '15'minute)
where userid='kim';

--삭제된 레코드 복구
insert into member select*from member as of
TIMESTAMP(systimestamp-interval '15'minute)
where userid='kim';

select * from member;



