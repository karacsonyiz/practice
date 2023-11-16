CREATE TABLE book (
 id int auto_increment primary key,
 author VARCHAR(255) NOT NULL,
 title VARCHAR(255) NOT NULL,
 imgsrc VARCHAR(255) NOT NULL
 );

 INSERT INTO book
(author, title, imgsrc)
VALUES("Szophoklész", "Antigoné","img/antigone.jpg"),
("Dickens, Charles","Karácsonyi ének","img/christmascarol.jfif"),
("Gárdonyi Géza","Egri csillagok","img/egri.jfif");