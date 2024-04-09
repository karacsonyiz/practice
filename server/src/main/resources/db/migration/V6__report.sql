CREATE TABLE report (
id BIGINT auto_increment,
month int NOT NULL,
product_name varchar (255) NOT NULL,
product_count int NOT NULL,
product_price int NOT NULL,
total_price int NOT NULL
);

 INSERT INTO report
(month, product_name, product_count, product_price, total_price)
VALUES(2, "test1", 2, 100, 200),
(5, "test2", 1, 50, 50),
(8, "test3", 5, 200, 1000),
(1, "test4", 1, 500, 500)
;
