1. Display all the information of the EMP table.
select * from emp;

2. Display unique Jobs from EMP table.
select distinct job from emp;

3. Display the details of all MANAGERS.
select * from emp where job = 'MANAGER';

4. List the emps who joined before 1981.
select * from emp where HIREDATE < '01-01-1981';

5. Display the Empno, Ename, Job, Hiredate, and experience of all Managers.
select empno, ename, job, hiredate,to_char(sysdate,'YYYY')-to_char(HIREDATE,'YYYY') as experience from emp where job='MANAGER';

6. List the Empno, Ename, Sal, Exp of all emps working for Mgr 7698.
select empno, ename, sal, to_char(sysdate,'YYYY')-to_char(HIREDATE,'YYYY') as experience from emp where MGR = 7698;

7. Display all the details of the emps whose Comm. Is more than their Sal.
select * from emp where comm > sal;

8. List the emps along with their Exp and whose Daily Sal is more than Rs. 100.
select ename,to_char(sysdate,'YYYY')-to_char(HIREDATE,'YYYY') as experience from emp where (sal/30) > 100;

9. List the emps who are working for the Deptno 10 or 20.
select * from emp where deptno = 10 or deptno = 20;

10. List the emps who are working under any Manager.
select * from emp order by mgr;

11. List all the Clerks of Deptno 20.
select * from emp where job = 'CLERK' and deptno = 20;

12. Display the details of SMITH.
select * from emp where empno = 7369;

13. Display the Empno, Ename, Deptno from EMP table.
select empno, ename, deptno from emp;

14. Write a query to display the Empno and the Deptno of all emps.
select empno, deptno from emp;

15. Display the unique Deptno of emps.
select distinct deptno from emp;

16. List the emps whose Salary is more than 3000 after giving 20% increment.
select empno,ename,sal,((sal*0.20)+sal) as "INCREMENT" from emp where ((sal*0.20)+sal)>3000;

17. List the Ename and Sal increased by 15% and expressed as No. of Dollars.
select ename,to_char('$'||to_char((sal*0.15)+sal))as SALARY from emp;

18. Produce the output of EMP table EMP_AND_JOB for Ename and job.
select ename || ' is ' || job as "OUTPUT" from emp;

19. Display the Empno, Ename, Salary of all Managers.
select empno,ename,sal from emp where job = 'MANAGER';

20. Define a variable representing the expression used to calculate on emps total annual remuneration use the variable in a statement which finds all emps who can earn 30000 a year or more.
select * from emp where &s*&m >= &l;

21. Check whether all the emps numbers are indeed unique.
select empno, count(empno) from emp group by empno having count(empno) > 1;

22. List the Empno, Sal and Comm of emps.
select empno, sal, comm from emp;

23. Display the unique dept with Jobs.
select distinct deptno, job from emp;

24. Display the details of Blake.
select * from emp where ename = 'Blake';

25. List all Clerks.
select * from emp where job = 'CLERK';

26. List all emps joined on 1 may 1981.
select * from emp where hiredate = '01-05-1981';

27. List the emps whose Salaries are less than 3500.
select * from emp where sal < 3500;

28. List the emps Empno, Ename, Sal of all emp joined before 1 Apr 1981.
select empno, ename, sal from emp where hiredate < '01-04-1981';

29. List the emps whose exp is more than 10 years.
select ename,to_char(sysdate,'YYYY')-to_char(HIREDATE,'YYYY') as experience from emp where (to_char(sysdate,'YYYY')-to_char(HIREDATE,'YYYY')) > 10;

30. List the emps who are working as Manager.
select * from emp where job = 'MANAGER';

31. List the emps who are working as clerks and exp is more that 8 Years.
select * from emp where job = 'CLERK' and (to_char(sysdate,'YYYY')-to_char(HIREDATE,'YYYY')) > 8;

32. List the Empno, Ename, Sal, Job of emps with the annSal <34000 but receiving some comm. Which should not be greater than Sal and the designation should be Salesman working for dept 20.
select empno, ename, sal, job,deptno from emp where (sal*12)<34000 and comm<sal and job ='SALESMAN' and deptno=20;

33. List all the Salesmen who are receiving Comm.
select * from emp where job = 'SALESMAN' and comm is not null;

34. List all the Salesmen of the Dept 30 whose Comm. Is more than their Salary.
select * from emp where job = 'SALESMAN' and deptno = 30 and comm > sal;
select * from emp where deptno = 30 and comm>sal;

35. Generate all the 3 digit numbers.
select (99 + level) as three_digit_number from dual
CONNECT BY level <= 100

36. Display the first 5 records of the EMP table.
select * from emp where rownum between 1 and 5;

37. List the emps empno, ename, job, sal of all emps.
select empno, ename, job, sal from emp;

38. List all the unique deptno of emps.
select distinct deptno from emp;

39. List all the unique jobs along with deptno.
select distinct job, deptno from emp;

40. List all the details of ‘Miller’.
select * from emp where ename = 'MILLER';

41. list the details of dept 10.
select * from emp where deptno = 10;

42. List all the ‘SALESMAN’.
select * from emp where job = 'SALESMAN';

43. List all the emps who joined before 1984.
select * from emp where hiredate < '01-01-1984';

44. List all the emps whose Sal>2500.
select * from emp where sal > 2500;

45. List all the emps who are working since 1st April 1982.
select * from emp where hiredate >= '01-04-1982';

46. List the empno, ename, sal, Daily sal of all emps.
select empno, ename, sal, (sal)/31 as "Daily Sal" from emp; 

47. List the empno, ename, sal, experience of all ‘Analysts’.
select empno, ename, job, sal, to_char(sysdate,'YYYY')-to_char(HIREDATE,'YYYY') as experience from emp where job = 'ANALYST';

48. List the emps whose exp>6.5 Y.
select ename, to_char(sysdate,'YYYY')-to_char(HIREDATE,'YYYY') as experience from emp where to_char(sysdate,'YYYY')-to_char(HIREDATE,'YYYY') > 6.5; 

49. List the emps who joined in 2nd half of 1981.
select * from emp where HIREDATE < '31-12-1981' and HIREDATE > '01-06-1981';

50. List all the emps in dept 10 who are working as Clerks.
select * from emp where deptno = 10 and job = 'CLERK';

51. List the emps who joined before 1985 and salary is more than 3000.
select * from emp where hiredate < '01-01-1985' and sal > 3000;