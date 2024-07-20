# Write your MySQL query statement below
# Didn't find solution with subquery for now, will use LEFT JOIN for now
SELECT e1.employee_id
FROM Employees e1
LEFT JOIN Employees e2 ON e2.employee_id = e1.manager_id
WHERE e1.salary < 30000 AND e2.employee_id IS NULL AND e1.manager_id IS NOT NULL
ORDER BY e1.employee_id;