CREATE TABLE basket(
id BIGINT auto_increment,
user_id int,
book_id int,
CONSTRAINT pk_basket PRIMARY KEY(id),
FOREIGN KEY (book_id) REFERENCES book(id),
FOREIGN KEY (user_id) REFERENCES user(id)
);