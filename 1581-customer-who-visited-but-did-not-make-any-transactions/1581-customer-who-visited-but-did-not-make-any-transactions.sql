# Write your MySQL query statement below
SELECT customer_id, COUNT(Visits.visit_id) AS `count_no_trans`
FROM Visits
LEFT JOIN Transactions on Transactions.visit_id = Visits.visit_id
WHERE transaction_id IS NULL
GROUP BY customer_id;