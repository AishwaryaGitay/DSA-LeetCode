# Write your MySQL query statement below
select e.name, b.bonus from employee e
left join bonus b on e.empID = b.empId
where b.bonus is null OR b.bonus < 1000;