-- \i 'C:/Users/aatokarev.MSC/Documents/java/src/com/startjava/lesson_5/init_db.sql'
INSERT INTO Jaeger(modelName, mark, height, weight, status, origin, launch, kaijuKill)
VALUES
	('Hunter Vertigo',	'Mark-6',	'56.74',	'2190',	'Abandoned',	'Unknown',	'2009',	'3'),
	('Lucky Seven',		'Mark-7',	'94.30',	'2301',	'Destroyed',	'Unknown',	'2010',	'1'),
	('Cherno Alpha',	'Mark-1',	'85.34',	'2412',	'Destroyed',	'Russia',	'2015',	'4'),
	('Gipsy Danger',	'Mark-3',	'79.25',	'1980',	'Destroyed',	'USA',		'2017',	'9'),
	('Titan Redeemer',	'Mark-6',	'93.55',	'2091',	'Destroyed',	'UK',		'2018',	'2'),
	('Tacit Ronin',		'Mark-4',	'74.37',	'7450',	'Destroyed',	'Japan',	'2015',	'3'),
	('Romeo Blue',		'Mark-1',	'77.72',	'7775',	'Destroyed',	'USA',		'2015',	'2'),
	('Murder Witch',	'Mark-4',	'84.65',	'7561',	'Abandoned',	'China',	'2010',	'5'),
	('Guardian Bravo',	'Mark-6',	'73.21',	'1975',	'Active',		'Japan',	'2033',	'1'),
	('Bracer Phoenix',	'Mark-5',	'70.91',	'2128',	'Active',		'USA',		'2025',	'1');

-- Load next file
\ir 'queries.sql'