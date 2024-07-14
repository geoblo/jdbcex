select now();

# 테이블 생성
create table tbl_todo (
    tno int auto_increment primary key,
    title varchar(100) not null,
    dueDate date not null,
    finished tinyint default 0
);

# 추가
insert into tbl_todo (title, dueDate, finished)
values ('Test...', '2022-12-31', 1);

# 조회
select * from tbl_todo;

select * from tbl_todo where tno = 1;

select * from tbl_todo where tno >= 3;

# 수정
update tbl_todo set finished = 0, title = 'Not Yet...' where tno = 3;

# 삭제
# delete from tbl_todo;

delete from tbl_todo where tno > 5;