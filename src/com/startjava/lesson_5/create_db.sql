-- \i 'C:/Users/aatokarev.MSC/Documents/java/src/com/startjava/lesson_5/create_db.sql'
-- \! chcp 1251
-- CREATE DATABASE
DROP DATABASE IF EXISTS jaeger;
CREATE DATABASE jaeger;

-- CONNECT TO DATABASE
\connect jaeger;

-- CREATE TABLE
DROP TABLE IF EXISTS Jaeger;
CREATE TABLE jaeger (
	id SERIAL PRIMARY KEY,
	modelName TEXT,
	mark CHAR(7),	
	height FLOAT(6),
	weight INTEGER,
	status CHAR(10),
	origin TEXT,
	launch INTEGER,
	kaijuKill INTEGER);
	
-- Load next file
\ir 'init_db.sql'