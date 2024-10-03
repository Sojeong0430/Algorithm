-- 코드를 입력하세요
select B.TITLE,B.BOARD_ID,REPLY_ID,R.WRITER_ID,R.CONTENTS,
DATE_FORMAT(R.CREATED_DATE,'%Y-%m-%d')
from USED_GOODS_BOARD as B 
join USED_GOODS_REPLY as R
on B.board_id = R.board_id
where date_format(B.created_date,'%Y-%m') = '2022-10'
order by R.created_date asc , B.title asc;
