SELECT C.CAR_ID,
       CASE
           WHEN EXISTS (
               SELECT 1
               FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY H
               WHERE H.CAR_ID = C.CAR_ID
                 AND H.START_DATE <= '2022-10-16'
                 AND H.END_DATE >= '2022-10-16'
           ) THEN '대여중'
           ELSE '대여 가능'
       END AS AVAILABILITY
FROM (
    SELECT DISTINCT CAR_ID
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
) C
ORDER BY C.CAR_ID DESC;