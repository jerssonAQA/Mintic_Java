create table motocicleta(
	prod_id int not null primary key,
    mot_autonomia varchar(40) not null,
    prov_id int not null,
    foreign key (prod_id) references producto(prod_id) on delete restrict on update restrict,
    foreign key (prov_id) references proveedor(prov_id) on delete restrict on update restrict
);
insert into motocicleta values(105,"18 horas",101);
insert into motocicleta values(106,"14 horas",102);
insert into motocicleta values(107,"26 horas",101);
insert into motocicleta values(108,"36 horas",103);
insert into motocicleta values(109,"20 horas",104);
insert into motocicleta values(200,"12 horas",105);