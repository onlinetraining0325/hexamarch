select * from Employ
INTO OUTFILE 'c:/logs/employ.csv'
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n';

SELECT * 
FROM Employ
INTO OUTFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/employ.csv'
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n';