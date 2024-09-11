--Activity_9

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

INSERT ALL 
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001) 
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001) 
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002) 
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002) 
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006) 
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003) 
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007) 
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005) 
SELECT 1 FROM DUAL;

--Write an SQL statement to know which salesman are working for which customer

SELECT DISTINCT orders.customer_id,orders.salesman_id 
FROM orders 
INNER JOIN customers 
ON orders.customer_id = customers.customer_id 
ORDER BY orders.customer_id;

--Write an SQL statement to make a list in ascending order for the customer who holds a grade less than 300 and works either through a salesman


SELECT customers.customer_name, customers.city, customers.grade, salesman.salesman_name, salesman.salesman_city 
FROM customers LEFT JOIN salesman ON customers.salesman_id = salesman.salesman_id 
WHERE customers.grade<300 
ORDER BY customers.grade ASC;

--Write an SQL statement to find the list of customers who appointed a salesman for 
--their jobs who gets a commission from the company is more than 12%

SELECT customer_name, customers.city, salesman.salesman_name, salesman.salesman_city,commission 
FROM customers RIGHT JOIN salesman ON customers.salesman_id = salesman.salesman_id 
WHERE commission>12

--Write an SQL statement to find the details of a order i.e. order number, order date, amount of order, 
--which customer gives the order and which salesman works for that customer and commission rate he gets for an order.

SELECT a.order_no, a.order_date, a.purchase_amount, b.customer_name AS "Customer Name", b.grade, c.salesman_name AS "Salesman", c.commission FROM orders a 
INNER JOIN customers b ON a.customer_id=b.customer_id 
INNER JOIN salesman c ON a.salesman_id=c.salesman_id;