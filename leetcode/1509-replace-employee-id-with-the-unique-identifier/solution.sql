select EmployeeUNI.unique_id as unique_id , Employees.name
from Employees
left join EmployeeUNI
on Employees.id = EmployeeUNI.id;

# some types of joins 
# left join - Returns everything from left table + matching from right (If no match then NULL)
# inner join - Returns only matching rows.
# right join - opposite of left join
# self join - Joining a table to itself
