SELECT T.TOTALSCORE AS SCORE,
        T.EMP_NO,
        E.EMP_NAME,
        E.POSITION,
        E.EMAIL
FROM HR_EMPLOYEES E JOIN (SELECT SUM(SCORE) AS TOTALSCORE, EMP_NO
                         FROM HR_GRADE
                         WHERE YEAR = 2022
                         GROUP BY EMP_NO) T
ON E.EMP_NO = T.EMP_NO
ORDER BY T.TOTALSCORE DESC
LIMIT 1;

-- D는 회사의 부서 정보를 담은 테이블
-- E는 회사의 사원 정보를 담은 테이블
-- G는 2022년 사원의 평가 정보를 담은 테이블
-- 2022년도 한해 평가 점수가 가장 높은 사원 정보를 조회