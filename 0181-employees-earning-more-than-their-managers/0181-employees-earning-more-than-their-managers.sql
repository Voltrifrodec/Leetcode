# Write your MySQL query statement below
SELECT emp1.name as 'Employee'
FROM Employee emp1, Employee emp2
WHERE emp1.salary > emp2.salary AND emp1.ManagerId = emp2.id;