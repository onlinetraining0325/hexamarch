CREATE TABLE EmployDup AS
SELECT * FROM Employ;

truncate table EmployDup;

select * from EmployDup;

alter table EmployDup add primary key(empno);