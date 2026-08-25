# Write your MySQL query statement below
Select MAX(Salary) AS SecondHighestSalary
From Employee
Where salary < (Select Max(salary) From Employee);