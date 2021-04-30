CREATE TABLE Company 
( Id INT NOT NULL,
  FirstName varchar2(45) NOT NULL,
  SecondName varchar2(45) NULL,
  LastName varchar2(45) NOT NULL,
  Gender varchar2(1) NULL,
  BirthDate DATE NOT NULL,
  Salary number(10) NOT NULL,
  DepartmentId number(10) NOT NULL,
  HireDate DATE NOT NULL,
  ReliveDate DATE NULL,
  Active1 number(2) NULL,
  CONSTRAINT company_pk PRIMARY KEY (Id)
  );

begin
	INSERT INTO Company VALUES (1,'Mary', null, 'Smith', 'W', '1985-12-18', 2000, 1, '2011-05-06', null, 1);
    INSERT INTO Company VALUES (2,'Paul', 'Gorge', 'Johnson', 'M', '1990-01-13', 1500, 3, '2011-10-29', null, 1);
    INSERT INTO Company VALUES (3,'Patricia', null, 'Wilson', 'W', '1995-05-28', 1000, 4, '2012-01-04', '2013-11-25', 0);
	INSERT INTO Company VALUES (4,'Linda', 'Lisa', 'Brown', 'W', '1983-07-11', 2700, 2, '2012-06-15', null, 1);
	INSERT INTO Company VALUES (5,'Johnatan', null, 'Davis', 'M', '1978-01-24', 1200, 1, '2013-01-15', null, 1);
    INSERT INTO Company VALUES (6,'John', null, 'Miller', null, '1993-10-20', 2000, 4, '2013-03-27', '2014-10-06', 0);
    INSERT INTO Company VALUES (7,'Elizabeth', 'Dorothy', 'Taylor', 'W', '1992-09-09', 2110, 1, '2013-05-01', null, 1);
    INSERT INTO Company VALUES (8,'James', null, 'Wilson', 'M', '1987-03-19', 1000, 3, '2013-10-09', '2014-03-01', 1);
    INSERT INTO Company VALUES (9,'Robert', null, 'Anderson', 'M', '1989-12-13', 2900, 2, '2013-12-20', '2014-05-05', 0);
    INSERT INTO Company VALUES (10,'John', 'Mark', 'Smith', 'M', '1990-05-24', 2500, 1, '2014-01-24', null, 1);
     end;
  /
    
SELECT * FROM Company;



begin
DBMS_OUTPUT.PUT_LINE('Karol Majewski Informatyka');
end;


declare
name varchar(40);
stud varchar(15);
begin
name := 'Karol Majewski';
stud := 'Informatyka';
DBMS_OUTPUT.PUT_LINE(name || ' ' || stud);
END;

declare
i NUMBER := 300;
j FLOAT := 36.6;
begin
DBMS_OUTPUT.PUT_LINE(i || ' ' || j);
END;

declare
i PLS_INTEGER := 13;
j PLS_INTEGER := 7;
begin
DBMS_OUTPUT.PUT_LINE(i+j);
DBMS_OUTPUT.PUT_LINE(i-j);
DBMS_OUTPUT.PUT_LINE(i*j);
DBMS_OUTPUT.PUT_LINE(i/j);
END;


declare
x varchar(10) :='jeden';
y varchar(10) :='drugi';
z varchar(10) :=CONCAT(x,y);
begin
    DBMS_OUTPUT.PUT_LINE(z);
end;

declare
x varchar(10) := 'jedna';
begin
DBMS_OUTPUT.PUT_LINE(UPPER(x));
DBMS_OUTPUT.PUT_LINE(LOWER(x));
DBMS_OUTPUT.PUT_LINE(INITCAP(x));
DBMS_OUTPUT.PUT_LINE(SUBSTR(x,0,2) || SUBSTR(x,LENGTH(x)-1,2));
DBMS_OUTPUT.PUT_LINE(INSTR(x,'a'));
DBMS_OUTPUT.PUT_LINE(REPLACE(UPPER(x),'E','X'));
DBMS_OUTPUT.PUT_LINE(REPLACE(REPLACE(UPPER(x),'E','Y'),'A','X'));
END;

DECLARE
i float := 334.231;
j float := 132.124;
BEGIN
DBMS_OUTPUT.PUT_LINE(ROUND(i) || ' ' || ROUND(j));
DBMS_OUTPUT.PUT_LINE(TRUNC(i) || ' ' || TRUNC(j));
DBMS_OUTPUT.PUT_LINE(ROUND(i,2) || ' ' || ROUND(j,1));
DBMS_OUTPUT.PUT_LINE(TRUNC(i,2) || ' ' || TRUNC(j,1));
DBMS_OUTPUT.PUT_LINE(FLOOR(i) || ' ' || FLOOR(j));
DBMS_OUTPUT.PUT_LINE(CEIL(i) || ' ' || CEIL(j));
DBMS_OUTPUT.PUT_LINE(MOD(13,4) || ' ' || MOD(13,5));
DBMS_OUTPUT.PUT_LINE(REMAINDER(13,4) || ' ' || REMAINDER(13,5));
END;

BEGIN
DBMS_OUTPUT.PUT_LINE(CURRENT_DATE || ' | ' || SYSDATE);
DBMS_OUTPUT.PUT_LINE(CURRENT_TIMESTAMP || ' | ' || LOCALTIMESTAMP || ' | ' || SYSTIMESTAMP);
DBMS_OUTPUT.PUT_LINE(CURRENT_DATE - CURRENT_TIMESTAMP);
DBMS_OUTPUT.PUT_LINE(TO_CHAR(sysdate,'DAY DD/MM/YYYY'));
DBMS_OUTPUT.PUT_LINE(EXTRACT(day FROM sysdate) || EXTRACT(month FROM sysdate) || EXTRACT(year FROM sysdate));
END;


DECLARE
x date := TO_DATE('28/02/2020','DD/MM/YYYY');
y date := TO_DATE('29/02/2020','DD/MM/YYYY');
BEGIN
DBMS_OUTPUT.PUT_LINE(TRUNC(x,'YYYY') || ' ' || TRUNC(y,'YYYY'));
DBMS_OUTPUT.PUT_LINE(TRUNC(x,'MM') || ' ' || TRUNC(y,'MM'));
DBMS_OUTPUT.PUT_LINE(TRUNC(x,'WW') || ' ' || TRUNC(y,'WW'));
DBMS_OUTPUT.PUT_LINE(TRUNC(x,'Q') || ' ' || TRUNC(y,'Q'));
DBMS_OUTPUT.PUT_LINE(x+10);
DBMS_OUTPUT.PUT_LINE(ADD_MONTHS(x,1) || ' ' || ADD_MONTHS(y,1));
DBMS_OUTPUT.PUT_LINE(ADD_MONTHS(x,-1) || ' ' || ADD_MONTHS(y,-1));
DBMS_OUTPUT.PUT_LINE(LAST_DAY(y) || ' ' || NEXT_DAY(y,'SOBOTA'));
END;

DECLARE
x varchar2(45);
y varchar2(45);
z date;
i int := 7;
BEGIN
SELECT FirstName INTO x FROM company WHERE id=i;
SELECT LastName INTO y FROM company WHERE id=i;
SELECT BirthDate INTO z FROM company WHERE id=i;
DBMS_OUTPUT.PUT_LINE(SUBSTR(x,0,1) || '.' || SUBSTR(y,0,1));
DBMS_OUTPUT.PUT_LINE(EXTRACT(year FROM sysdate) - EXTRACT(year FROM z));
END;


DECLARE
i int := 7;
BEGIN
UPDATE company SET FirstName = 'Zbyszek' WHERE id=i;
DELETE FROM company WHERE id=i-1;
END;

DECLARE
x date;
y date;
BEGIN
SELECT MIN(BirthDate) INTO y FROM company;
SELECT MAX(BirthDate) INTO x FROM company;
DBMS_OUTPUT.PUT_LINE(EXTRACT(YEAR FROM sysdate) - EXTRACT(YEAR FROM y) - (EXTRACT(YEAR FROM sysdate) - EXTRACT(YEAR FROM x)));
END;

DECLARE
i number(10) := 4;
BEGIN
UPDATE company SET salary = salary*1.1 WHERE Departmentid = i;
END;


DECLARE
i int;
x company%ROWTYPE;
BEGIN 
SELECT MAX(id) INTO i FROM company;
x.FirstName := 'Karol';
x.LastName := 'Majewski';
x.Gender := NULL;
x.BirthDate := '1998-04-25';
x.Salary := 12000;
x.DepartmentId := 7;
x.HireDate := '2020-05-24';
x.ReliveDate := '2021-01-01';
x.Active1 := 0;
INSERT INTO company (id,FirstName,LastName,Gender,BirthDate,Salary,DepartmentId,HireDate,ReliveDate,Active1) VALUES (i+1,x.FirstName,x.LastName,x.Gender,x.BirthDate,x.Salary,x.DepartmentId,x.HireDate,x.ReliveDate,x.Active1);
END;

