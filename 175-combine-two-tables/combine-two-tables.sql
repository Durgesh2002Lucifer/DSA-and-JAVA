/* Write your PL/SQL query statement below */

select firstname, lastname, nvl(city,null) as city , nvl(state,null) as state from person p left join address a on p.personid = a.personid
order by 1