--Activity_7
--Write an SQL statement to find the total purchase amount of all orders

SELECT SUM (purchase_amount) AS Purchase_Total FROM orders;

----Write an SQL statement to find the average purchase amount of all orders

SELECT ROUND(AVG(purchase_amount),0) AS AVG_Purchase_Amount FROM orders;

--Write an SQL statement to get the maximum purchase amount of all the orders

SELECT MAX(purchase_amount) AS Purchase_Max FROM orders;

--Write an SQL statement to get the minimum purchase amount of all the orders

SELECT MIN(purchase_amount) AS Purchase_Min FROM orders;

--Write an SQL statement to find the number of salesmen listed in the table

SELECT COUNT(DISTINCT salesman_id) as Total_salesman FROM orders;