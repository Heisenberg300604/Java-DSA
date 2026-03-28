# Write your MySQL query statement below

select distinct author_id as id from Views 
where author_id = viewer_id ORDER BY id asc;

# distinct - avoid duplicates , as id - because i am renaming the column acc to question 
# Order by asc - sorting 
