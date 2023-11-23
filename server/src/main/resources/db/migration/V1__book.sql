CREATE TABLE book (
 id int auto_increment primary key,
 author VARCHAR(255) NOT NULL,
 title VARCHAR(255) NOT NULL,
 imgsrc VARCHAR(255),
 price int NOT NULL
 );

 INSERT INTO book
(author, title, imgsrc, price)
VALUES("Szophoklész", "Antigoné","img/antigone.jpg", 1899),
("Dickens, Charles","Karácsonyi ének","img/christmascarol.jfif", 1499),
("Gárdonyi Géza","Egri csillagok","img/egri.jfif", 2299);