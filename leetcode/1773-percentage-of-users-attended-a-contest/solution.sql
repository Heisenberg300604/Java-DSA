select r.contest_id , round(count(r.user_id) * 100  / (SELECT COUNT(user_id) FROM Users),2)
as percentage
from Register r
group by r.contest_id
order by percentage DESC, r.contest_id asc;
