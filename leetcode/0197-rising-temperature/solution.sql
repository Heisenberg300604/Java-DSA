select w1.id
from Weather w1 join Weather w2
on DATEDIFF(w1.recordDate , w2.recordDate) = 1 
where w1.temperature > w2.temperature;

# datediff function is use to calculate the number of days between 2 dates
# in this question we self join the table and then compare 
