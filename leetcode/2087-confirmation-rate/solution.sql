select s.user_id , ROUND( AVG(IF(c.action='confirmed',1,0)) ,2) as confirmation_rate
from Signups s
left join Confirmations c # why left join ? becuase we want all the rows from left table ie signup
on s.user_id = c.user_id
group by s.user_id;
