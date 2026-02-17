# Write your MySQL query statement below
#select p.email as Email from Person p
#group by p.email
#having count(p.email) > 1;

select distinct p1.email from Person p1
join Person p2 on p1.email = p2.email
where p1.id != p2.id



