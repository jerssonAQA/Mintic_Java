create database reto5;

use reto5;

create table Producto(
    Codigo bigint primary key auto_increment,
    Nombre varchar(50),
    V_compra bigint,
    V_venta bigint,
    Cantidad int,
    Categoria varchar(50)
);


INSERT INTO producto VALUES (1, 'tornillo', 2000, 2500, 10, 'tornillo');
INSERT INTO producto VALUES (2, 'tuerca', 200, 300, 10, 'tornillo');
INSERT INTO producto VALUES (3, 'llave', 12000, 15000, 2, 'herramientas');
INSERT INTO producto VALUES (4, 'destornillador', 3000, 3750, 3, 'herramientas');
INSERT INTO producto VALUES (5, 'gafas_protectoras', 11000, 12500, 3, 'accesorios');
INSERT INTO producto VALUES (6, 'casco', 22000, 24700, 3, 'accesorios');
INSERT INTO producto VALUES (7, 'pintura_blanca', 14000, 15800, 1, 'pintura');
