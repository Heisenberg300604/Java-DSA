select DATE_FORMAT(trans_date,'%Y-%m') AS month,
country,
count(id) as trans_count , 
COUNT(CASE WHEN state = 'approved' THEN 1 END) AS approved_count,
sum(amount) as trans_total_amount,
sum(CASE WHEN state = 'approved' THEN amount ELSE 0 END) as approved_total_amount
from Transactions
group by month , country ;
