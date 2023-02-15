/* Populate tabla clientes */

INSERT INTO regiones (id, nombre) VALUES (1, 'Sudamérica');
INSERT INTO regiones (id, nombre) VALUES (2, 'Centroamérica');
INSERT INTO regiones (id, nombre) VALUES (3, 'Norteamérica');
INSERT INTO regiones (id, nombre) VALUES (4, 'Europa');
INSERT INTO regiones (id, nombre) VALUES (5, 'Asia');
INSERT INTO regiones (id, nombre) VALUES (6, 'Africa');
INSERT INTO regiones (id, nombre) VALUES (7, 'Oceanía');
INSERT INTO regiones (id, nombre) VALUES (8, 'Antártida');

INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(1, 'Esteban', 'Acosta', 'esteban@proyoctupus.com', '2018-01-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(2, 'Mr. John', 'Doe', 'john.doe@gmail.com', '2018-01-02');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, 'Linus', 'Torvalds', 'linus.torvalds@gmail.com', '2018-01-03');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, 'Rasmus', 'Lerdorf', 'rasmus.lerdorf@gmail.com', '2018-01-04');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, 'Erich', 'Gamma', 'erich.gamma@gmail.com', '2018-02-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'Richard', 'Helm', 'richard.helm@gmail.com', '2018-02-10');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'Ralph', 'Johnson', 'ralph.johnson@gmail.com', '2018-02-18');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'John', 'Vlissides', 'john.vlissides@gmail.com', '2018-02-28');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'Dr. James', 'Gosling', 'james.gosling@gmail.com', '2018-03-03');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(5, 'Magma', 'Lee', 'magma.lee@gmail.com', '2018-03-04');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(6, 'Tornado', 'Roe', 'tornado.roe@gmail.com', '2018-03-05');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(7, 'Jade', 'Doe', 'jane.doe@gmail.com', '2018-03-06');

/* Creamos algunos usuarios con sus roles */
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('esteban','$2a$10$C3Uln5uqnzx/GswADURJGOIdBqYrly9731fnwKDaUdBkt/M3qvtLq',1, 'Esteban', 'Acosta','esteban@proyoctupus.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$RmdEsvEfhI7Rcm9f/uZXPebZVCcPC7ZXZwV51efAvMAp1rIaRAfPK',1, 'Admin', 'Admin','admin@proyoctupus.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 1);

/* TABLA PRODUCTOS */
INSERT INTO productos (nombre, precio, create_at) VALUES('iPhone 12 Pro Max', 494520, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Mac iOS', 1494520, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Monitor Samsung', 94520, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Parlantes Noga', 4520, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Notebook Bangho', 49450, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Mouse Noga', 520, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Teclado Mecanico Noga', 4920, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Cargador Base Inalambrica', 9420, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Reloj Apple Watch Serie 5', 49452, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Cargador Mac SafeCharge', 49420, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Placa de Video 3060 NVIDIA', 994520, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('MotherBoard ASUS', 64520, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Memoria RAM DDR5 32GB 3600Mhz', 44520, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Disco SSD 512GB', 4520, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Procesador Intel i9', 4494520, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Procesador Ryzer 3600', 194520, NOW());

/* TABLA FACTURAS */

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura equipos de oficina', 'Detalle de los componentes necesarios para la oficina', 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 1, 3);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 1, 4);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (2, 1, 6);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (3, 1, 7);


INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura Notebooks', null, 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 2, 2);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 2, 5);





