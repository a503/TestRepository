/*



*/
-- bno가 1~10사이에 있는 게시물을 가져오시오.
select * 
from board 
where bno>=1 AND bno<=10;

select * 
from board 
where bno between 1 and 10;

-- bwriter가 'W'를 포함하는 게시물의 bno, btitle, bwriter을 가져오시오
select bno, btitle, bwriter 
from board 
where bwriter LIKE '%W%';

-- 게시물의 제목중에 '자바'가 포함되어 있는 게시물의 bno, btitle, bwriter을 가져오시오

select bno, btitle, bwriter 
from board 
where btitle LIKE '%자바%';

-- 게시물의 제목, 내용 중에 '자바'가 포함되어 있는 게시물의 번호, 제목, 글쓴이를 가져오시오

select bno, btitle, bwriter, bcontent 
from board 
where btitle LIKE '%자바%' OR bcontent LIKE '%자바%';

-- 글쓴이가 '감자바', '김길동', '라즈베리' 인 게시물의 번호 제목 글쓴이를 가져오시오
select bno, btitle, bwriter
from board
where bwriter='감자바' OR bwriter='김길동' OR bwriter='라즈베리';

select bno, btitle, bwriter
from board
where bwriter IN('감자바', '김길동','라즈베리');

-- 첨부파일이 없는 게시물을 가져오시오
select *
from board
where bfilecontent is null;

select *
from board
where bfilecontent=null; -- null은 데이터가 아니기때문에 사용할수없다.

-- 첨부파일이 있는 게시물을 가져오시오
select *
from board
where bfilecontent is NOT null; -- 셤문제 가능!

select *
from board
where bfilecontent <> null; -- null은 데이터가 아니기때문에 사용할수없다. 값이 다르냐는 질문이므로 null은 값이 아니다.

--게시물을 작성한 사람의 이름을 가져오시오

select distinct bwriter
from board;


-- 게시글을 작성한 날짜가 2016년인 게시글을 가져오시오
select *
from board
where bdate >= '2016.01.01' AND bdate <= '2016.12.31';

select *
from board
where bdate between '2016.01.01' AND '2016.12.31';

-- bno -> 번호, btitle ->제목, bwriter-> 글쓴이로 컬럼의 이름을 변경해서 가져오시오 // as 생략가능
select bno as 번호, btitle as 제목, bwriter as 글쓴이
from board;

-- -- 정렬
-- 게시물 번호를 기준으로 올림차순으로 가져오시오

select *
from board
ORDER BY bno asc;--desc

-- 2017년동에 작성한 게시물의 번호를 기준으로 내림차순으로 가져오시오

select *
from board
where bdate between '2017.01.01' AND '2017.12.31'
ORDER BY bno desc;

-- 글쓴이를 기준으로 1차 정렬(올림차순)하고 쓴날짜를 기준으로 2차 정렬(내림차순) 하시오.
select *
from board
order by bwriter asc, bdate desc;

-- 페이징 처리
-- row number

-- 저장되어 있는 순서대로 행 번호 매기기
select rownum,bno, btitle, bwriter, bdate, bhitcount
from board;

-- 정렬 후 행 번호 매기기
select rownum, bno, btitle, bwriter, bdate, bhitcount
from (select bno, btitle, bwriter, bdate, bhitcount from board order by bno desc); -- sub query ()로 표시, 최신글이 가장 먼저 나와야 하니 정렬을 한후해 rownum을 붙인다.

-- 특정 행번호 이하만 가져오기(Top N을 가져오기)

select rownum, bno, btitle, bwriter, bdate, bhitcount
from (select bno, btitle, bwriter, bdate, bhitcount from board order by bno desc)
where rownum<=10; -- rownum 은 Result Set을 만들며 한행이 만들어질때마다 부여된다.

-- 시작 행번호와 끝 행번호 사이의 게시물을 가져오기
-- rowsPerPage = 10
-- 시작행번호 = (PageNo -1)*rPP + 1
-- 끝행 번호 = PageNO * rPP


select r, bno, btitle, bwriter, bdate, bhitcount 
from
(
    select rownum as r, bno, btitle, bwriter, bdate, bhitcount
    from (
        select bno, btitle, bwriter, bdate, bhitcount from board order by bno desc
    )
    where rownum<=(2 * 15)
    --where rownum<=(pageNo*rowsPerPage)
)
where r>=((2-1)*15+1);
--where r>=((pageNo-1)*rowsPerPage + 1);

-- 전체 행수 구하기
select count(*) as count from board;

select count(bno) from board;

select count(boriginalfilename) from board;

-- 특정 조건에 맞는 행수 구하기

select count(*) as count from board
where bwriter <> 'Writer';


