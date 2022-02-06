-고양이와 개는 몇 마리 있을까-
SELECT ANIMAL_TYPE, count(*) as count
FROM ANIMAL_INS 
GROUP BY ANIMAL_TYPE
ORDER BY ANIMAL_TYPE;
    
-루시와 엘라 찾기-
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE 
FROM ANIMAL_INS
WHERE NAME IN ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')
ORDER BY ANIMAL_ID;
    
-최솟값 구하기-
SELECT DATETIME FROM
    (SELECT * FROM ANIMAL_INS ORDER BY DATETIME)
WHERE ROWNUM = 1;

SELECT MIN(DATETIME) AS 시간 FROM ANIMAL_INS;

-동명 동물 수 찾기-
SELECT NAME, count(NAME) as COUNT 
FROM ANIMAL_INS
	GROUP BY NAME
	HAVING count(NAME)>1
ORDER BY NAME;
    
-이름에 EL이 들어가는 동물 찾기-
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE UPPER(NAME) LIKE '%EL%' AND ANIMAL_TYPE = 'Dog'
ORDER BY NAME;
    
-동물 수 구하기-
SELECT count(*) as count FROM ANIMAL_INS;

-입양 시각 구하기(1)-
SELECT TO_CHAR(DATETIME, 'HH24') AS HOUR, count(DATETIME)
FROM ANIMAL_OUTS
	GROUP BY TO_CHAR(DATETIME, 'HH24')
	HAVING TO_CHAR(DATETIME, 'HH24') BETWEEN 9 AND 19
ORDER BY 1;
    
-NULL 처리하기-
SELECT ANIMAL_TYPE, NVL(NAME, 'No name'), SEX_UPON_INTAKE
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;
    
-중성화 여부 파악하기-
SELECT ANIMAL_ID, NAME, 
        CASE WHEN SEX_UPON_INTAKE LIKE '%Neutered%' THEN 'O'
             WHEN SEX_UPON_INTAKE LIKE '%Spayed%' THEN 'O'
        ELSE 'X'
        END
        AS 중성화
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;

-중복 제거하기-
SELECT count(*) 
FROM(SELECT NAME FROM ANIMAL_INS
    WHERE NAME IS NOT NULL
    GROUP BY NAME);
    
-DATETIME에서 DATE로 형 변환-
SELECT ANIMAL_ID, NAME, 
    TO_CHAR(DATETIME, 'YYYY-MM-DD') AS 날짜
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;


    


