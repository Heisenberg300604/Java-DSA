# Write your MySQL query statement below
select x, y , z , 
case when x+y > z
and y+z > x 
and x+z > y
then 'Yes'
else 
'No'
END AS triangle
from triangle;

# case is just like if else in sql 
# case
#   when condition then true
#   else value
# end
