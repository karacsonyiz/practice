CREATE TABLE feedback (
id BIGINT AUTO_INCREMENT,
rating_text TEXT,
rating_score TINYINT NOT NULL,
rating_date DATETIME NOT NULL,
product_id BIGINT,
user_id BIGINT,
CONSTRAINT PK_feedback PRIMARY KEY(id),
FOREIGN KEY(product_id) REFERENCES products(id),
FOREIGN KEY(user_id) REFERENCES users(id)
);

 INSERT INTO feedback
(rating_text, rating_score, rating_date, user_id)
VALUES('test_rating', 2, "2024,04,10", 1);

