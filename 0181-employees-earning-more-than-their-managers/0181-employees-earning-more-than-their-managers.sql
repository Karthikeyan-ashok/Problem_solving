select e.name as Employee
from Employee e
where salary > (
    select salary
    from Employee ee
    where e.managerId = ee.id
);