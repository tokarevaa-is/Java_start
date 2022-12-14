-- \i 'C:/Users/aatokarev.MSC/Documents/java/src/com/startjava/lesson_5/queries.sql'
\echo 'Вывести всю таблицу'
SELECT * FROM Jaeger;

\echo 'Отобразите только не уничтоженных роботов'
SELECT * FROM Jaeger WHERE status != 'Destroyed';

\echo 'Отобразите роботов нескольких серий: Mark-1 и Mark-4'
SELECT * FROM Jaeger WHERE mark IN ('Mark-1', 'Mark-4');

\echo 'Отобразите всех роботов, кроме Mark-1 и Mark-4'
SELECT * FROM Jaeger WHERE mark NOT IN ('Mark-1', 'Mark-4');

\echo 'Отсортируйте таблицу по убыванию по столбцу mark'
SELECT * FROM Jaeger ORDER BY mark DESC;

\echo 'Отобразите информацию о самом старом роботе'
SELECT * FROM Jaeger WHERE launch = (SELECT MIN(launch) FROM Jaeger); 

\echo 'Отобразите роботов, которые уничтожили больше всех kaiju'
SELECT * FROM Jaeger WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaeger); 

\echo 'Отобразите средний вес роботов'
SELECT AVG(weight) FROM Jaeger;

\echo 'Увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены'
WITH undestroyed AS (
	UPDATE Jaeger SET kaijuKill = kaijuKill + 1
	RETURNING *
)
SELECT * FROM undestroyed WHERE status != 'Destroyed';

\echo 'Удалите уничтоженных роботов'
DELETE FROM Jaeger WHERE status = 'Destroyed';
\echo 'Вывести всю таблицу'
SELECT * FROM Jaeger;