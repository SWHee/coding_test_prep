WITH FISH_BEFORE AS (
    SELECT FISH_TYPE
            , (CASE
                WHEN LENGTH IS NULL THEN 10
                WHEN LENGTH <= 10 THEN 10
                ELSE LENGTH
              END) AS LENGTH
    FROM FISH_INFO
)


SELECT COUNT(*) AS FISH_COUNT
        , MAX(B.LENGTH) AS MAX_LENGTH
        , B.FISH_TYPE
FROM FISH_BEFORE B
GROUP BY B.FISH_TYPE
HAVING AVG(B.LENGTH) >= 33
ORDER BY B.FISH_TYPE ASC;

-- 평균 길이가 33cm 이상인 물고기들을 종류별로 분류하여
-- 잡은 수, 최대 길이, 물고기의 종류를 출력하는 SQL
-- 10cm이하의 물고기들은 10cm로 취급