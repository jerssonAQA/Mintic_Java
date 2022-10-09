create table Clientes(
	alias varchar(45) not null primary key,
    nombre_apellido varchar(50) not null,
    apellido varchar(50) not null,
    email varchar(50) null,
    celular BIGINT(13) null,
    contraseña varchar(15),
    fecha_nac date null
);
insert into Clientes values("lucky","Pedro"," Perez","a",1,"123",'2020-03-04');
insert into Clientes values("malopez","Maria","Lopez","a",1,"123",'2020-03-04');
insert into Clientes values("diva","Ana","Diaz","a",1,"123",'2020-03-04');
insert into Clientes values("dreamer","Luis","Rojas","a",1,"123",'2020-03-04');
insert into Clientes values("ninja","Andres","Cruz","a",1,"123",'2020-03-04');
insert into Clientes values("neon","Nelson","Ruiz","a",1,"123",'2020-03-04');
insert into Clientes values("rose","Claudia","Mendez","a",1,"123",'2020-03-04');
insert into Clientes values("green","Jorge","Rodriguez","a",1,"123",'2020-03-04');