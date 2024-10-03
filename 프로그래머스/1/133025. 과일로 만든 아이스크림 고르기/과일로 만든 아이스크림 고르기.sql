-- 코드를 입력하세요
SELECT fh.flavor
FROM FIRST_HALF as fh join ICECREAM_INFO as info on fh.FLAVOR = info.FLAVOR
WHERE TOTAL_ORDER > 3000 and INGREDIENT_TYPE='fruit_based'
order by TOTAL_ORDER DESC;