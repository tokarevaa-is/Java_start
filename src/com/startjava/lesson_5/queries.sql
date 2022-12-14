-- \i 'C:/Users/aatokarev.MSC/Documents/java/src/com/startjava/lesson_5/queries.sql'
\echo '������� ��� �������'
SELECT * FROM Jaeger;

\echo '���������� ������ �� ������������ �������'
SELECT * FROM Jaeger WHERE status != 'Destroyed';

\echo '���������� ������� ���������� �����: Mark-1 � Mark-4'
SELECT * FROM Jaeger WHERE mark IN ('Mark-1', 'Mark-4');

\echo '���������� ���� �������, ����� Mark-1 � Mark-4'
SELECT * FROM Jaeger WHERE mark NOT IN ('Mark-1', 'Mark-4');

\echo '������������ ������� �� �������� �� ������� mark'
SELECT * FROM Jaeger ORDER BY mark DESC;

\echo '���������� ���������� � ����� ������ ������'
SELECT * FROM Jaeger WHERE launch = (SELECT MIN(launch) FROM Jaeger); 

\echo '���������� �������, ������� ���������� ������ ���� kaiju'
SELECT * FROM Jaeger WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaeger); 

\echo '���������� ������� ��� �������'
SELECT AVG(weight) FROM Jaeger;

\echo '��������� �� ������� ���������� ������������ kaiju � �������, ������� �� ��� ��� �� ���������'
WITH undestroyed AS (
	UPDATE Jaeger SET kaijuKill = kaijuKill + 1
	RETURNING *
)
SELECT * FROM undestroyed WHERE status != 'Destroyed';

\echo '������� ������������ �������'
DELETE FROM Jaeger WHERE status = 'Destroyed';
\echo '������� ��� �������'
SELECT * FROM Jaeger;