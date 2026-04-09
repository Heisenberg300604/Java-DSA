select max(salary) #find max salary
as SecondHighestSalary
from Employee
where salary < ( select max(salary) from Employee ); # subquery for maximum below that
