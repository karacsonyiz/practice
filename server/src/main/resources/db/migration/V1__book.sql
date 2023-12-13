CREATE TABLE book (
 id int auto_increment primary key,
 author VARCHAR(255) NOT NULL,
 title VARCHAR(255) NOT NULL,
 synopsys TEXT NOT NULL,
 imgsrc VARCHAR(255),
 price int NOT NULL
 );

 INSERT INTO book
(author, title, synopsys, imgsrc, price)
VALUES("Szophoklész", "Antigoné", "Prior to the beginning of the play, the brothers Eteocles and Polynices, leading opposite sides in Thebes' civil war, died fighting each other for the throne. Creon, the new ruler of Thebes and brother of the former Queen Jocasta, has decided that Eteocles will be honored and Polynices will be in public shame. The rebel brother's body will not be sanctified by holy rites and will lie unburied on the battlefield, prey for carrion animals, the harshest punishment at the time. Antigone and Ismene are the sisters of the dead Polynices and Eteocles. ", "img/antigone.jpg", 1899),
("Dickens, Charles","Karácsonyi ének", "A Christmas Carol recounts the story of Ebenezer Scrooge, an elderly miser who is visited by the ghost of his former business partner Jacob Marley and the spirits of Christmas Past, Present and Yet to Come. After their visits, Scrooge is transformed into a kinder, gentler man.", "img/christmascarol.jfif", 1499),
("Gárdonyi Géza","Egri csillagok", "A small Hungarian Garrison commanded by István Dobó successfully resisted a huge Turkish army for nearly six weeks and forged it to retreat in disgrace. Dobó became a celebrated hero. But little is known of his explosives expert, Gergely Bornemissza, whose ingenious devices demoralized the Turks.", "img/egri.jfif", 2299);