CREATE TABLE book (
 id int auto_increment primary key,
 author VARCHAR(255) NOT NULL,
 title VARCHAR(255) NOT NULL
 );

 INSERT INTO book
(author, title)
VALUES("Szophoklész", "Antigoné"),
("Dickens, Charles","Karácsonyi ének"),
("Gárdonyi Géza","Egri csillagok");