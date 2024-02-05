CREATE TABLE report (
id BIGINT auto_increment,
user_id BIGINT,
date DATETIME NOT NULL,
CONSTRAINT pk_report PRIMARY KEY(id)
);