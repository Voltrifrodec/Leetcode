# Write your MySQL query statement below
# Doing penetrance between Person (person1) and its clone (person2) using join by email and keeping first that matches the equation (?)
# if person1.id < person2.id, I'd get the exact opposite -- the greater ID would remain, and smaller excluded (same thing would be achieved by deleting person2 instead of person1)
DELETE person1 FROM Person person1
INNER JOIN Person person2 ON person1.email = person2.email AND person1.id > person2.id;