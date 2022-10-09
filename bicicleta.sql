create table bicicleta(
	prod_id int not null primary key,
    anio_bici int not null,
    foreign key (prod_id) references producto(prod_id) on delete restrict on update restrict
);
insert into bicicleta values(100,2020);
insert into bicicleta values(101,2019);
insert into bicicleta values(102,2020);
insert into bicicleta values(103,2021);
insert into bicicleta values(104,1018);