with cte as (select score, dense_rank() over(order by score desc) as rank
from scores)
select * from cte