# Write your MySQL query statement below
select e.firstName, e.lastName, a.city, a.state from Person e left join Address a
on e.personId = a.personId