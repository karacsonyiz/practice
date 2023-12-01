create table user(
     id int auto_increment primary key,
     name varchar (255) NOT NULL,
     password varchar (255) NOT NULL,
     email varchar (255) NOT NULL,
     enabled int,
     role varchar(255));

 insert into user(name, password, email, enabled, role)
     values ('admin', '$2a$10$FV9w7BuvK2gmnVPaUqQ88.d9V2C73VyTvc24DrqHZJXTGnQV5xtl.', 'admin@admin.com', 1, 'ROLE_ADMIN'),
            ('user', '$2a$10$v8PdVYFQ/Btnd1RpicvfR.sA/v0TvNoJogNsULJqRvAWXoCCM50xu', 'user@user.com', 1, 'ROLE_USER');