CREATE TABLE orderitem (
id BIGINT AUTO_INCREMENT,
orders_id BIGINT,
book_id BIGINT,
book_price BIGINT NOT NULL,
CONSTRAINT pk_orderitem PRIMARY KEY(id)
);