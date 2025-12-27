select a.name as Employee from employee as a
where a.salary >
 (select e.salary from employee as e join employee as ee on e.id = ee.managerId and a.managerId = ee.managerId limit 1)