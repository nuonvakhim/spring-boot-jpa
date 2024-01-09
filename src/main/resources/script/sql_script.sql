insert into users (id, email, password, status)
values ( 1 ,
         'subscriber@gmail.com', '$2a$12$4WUzFdONA537TKbkak4hPu2/gYuPemTmaWRPj5eVna1DLgZzh0U3S
', true),
       ( 2 ,
         'admin@gmail.com', '$2a$12$4WUzFdONA537TKbkak4hPu2/gYuPemTmaWRPj5eVna1DLgZzh0U3S
', true),
       ( 3 ,
         'superadmin@gmail.com', '$2a$12$4WUzFdONA537TKbkak4hPu2/gYuPemTmaWRPj5eVna1DLgZzh0U3S
', true);

insert into roles(id , name)
values (1, 'SUBSCRIBER'),
       (2, 'ADMIN'),
       (3, 'SUPER-ADMIN');

insert into  users_roles (user_id, role_id)
values (1,1), (2,2),(3,3);

insert  into  authorities (id, name )
values (1, 'user:read'), (2,'user:write'), (3, 'user:delete'),(4, 'user:update'),
       (5, 'book:read'), (6,'book:write'), (7, 'book:delete'),(8, 'book:update');


insert into roles_authorities (role_id, authority_id)
values (1,5),
       (1,6),
       (1,7),
       (1,8),
       (2,1),
       (2,2),
       (2,4),
       (2,5),
       (2,6),
       (2,7),
       (2,8),
       (3,1),
       (3,2),
       (3,3),
       (3,4),
       (3,5),
       (3,6),
       (3,7),
       (3,8);


