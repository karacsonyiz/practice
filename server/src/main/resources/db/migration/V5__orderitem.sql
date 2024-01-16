CREATE TABLE orderitem (
id BIGINT AUTO_INCREMENT,
order_id BIGINT,
book_id BIGINT,
book_price BIGINT NOT NULL,
CONSTRAINT PK_OrderItem PRIMARY KEY(id),
FOREIGN KEY(order_id) REFERENCES order(id),
FOREIGN KEY(book_id) REFERENCES book(id)
);