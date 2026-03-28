# Write your MySQL query statement below

select tweet_id from Tweets
 where char_length(content) > 15;

#char_length counts the actual characters whereas if we use length() then it counts the bytes
