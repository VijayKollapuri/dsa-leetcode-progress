-- select a.name as Employee from employee as a
-- where a.salary >
--  (select e.salary from employee as e join employee as ee on e.id = ee.managerId and a.managerId = ee.managerId limit 1)

# Write your MySQL query statement below
SELECT e1.name AS Employee FROM Employee e1 JOIN Employee e2 ON e1.managerId=e2.id WHERE e1.salary > e2.salary;