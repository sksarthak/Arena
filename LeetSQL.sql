# 175. Combine Two Tables : https://leetcode.com/problems/combine-two-tables/
select p.firstName, p.lastName, a.city, a.state from person p left join address a on p.personId=a.personId;

# 181. Employees Earning More Than Their Managers :https://leetcode.com/problems/employees-earning-more-than-their-managers/
select ex.name as employee from employee ex left join employee m on ex.managerId=m.id where m.salary<ex.salary;

# 182. Duplicate Emails : https://leetcode.com/problems/duplicate-emails/
select distinct a.email from person a cross join person b on a.id!=b.id and a.email=b.email;
select distinct email from person group by email having count(email)>1;

# 176. Second Highest Salary : https://leetcode.com/problems/second-highest-salary/
select * from( (select distinct salary as SecondHighestSalary from employee) union (select null as SecondHighestSalary)) data order by SecondHighestSalary desc limit 1,1;

#183. Customers Who Never Order : https://leetcode.com/problems/customers-who-never-order/

select name as 'Customers' from customers left join orders on orders.customerid=customers.id  where customerId is null;
select name as 'Customers' from customers where id not in (select customerId from orders);