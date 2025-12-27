# Write your MySQL query statement below
-- select e.firstName, e.lastName, a.city, a.state from Person e left join Address a
-- on e.personId = a.personId

select firstName, lastName, city, state 
from Person left join Address on Person.personId = Address.personId