create table consulta(
	consul_id int not null primary key,
    alias varchar(45) not null,
    fabricantes varchar(50) not null,
    fecha datetime not null,
	foreign key (alias) references clientes(alias) on delete restrict on update restrict
);
insert into consulta values(1,"lucky","Cannondale",'2017-10-25 20:00:00');
insert into consulta values(2,"lucky","Trek",'2019-03-15 18:30:00');
insert into consulta values(3,"lucky","Starker",'2019-05-20 20:30:00');
insert into consulta values(4,"malopez","Cannondale",'2018-05-20 20:30:00');
insert into consulta values(5,"malopez","Starker",'2020-01-20 20:30:00');
insert into consulta values(6,"diva","Yeti",'2019-05-20 20:30:00');
insert into consulta values(7,"diva","Fuji",'2018-06-22 21:30:00');
insert into consulta values(8,"diva","Lucky Lion",'2020-03-17 15:30:20');
insert into consulta values(9,"dreamer","Lucky Lion",'2020-03-17 15:30:20');
insert into consulta values(10,"dreamer","Be Electric",'2020-04-10 18:30:20');
insert into consulta values(11,"ninja","Aima",'2020-02-17 20:30:20');
insert into consulta values(12,"ninja","Starker",'2020-02-20 16:30:20');
insert into consulta values(13,"ninja","Mec de Colombia",'2020-03-27 18:30:20');
insert into consulta values(14,"rose","Atom Electric",'2020-03-20 21:30:20');
insert into consulta values(15,"green","Yeti",'2020-01-10 17:30:20');
insert into consulta values(16,"green","Trek",'2020-02-15 20:30:20');
insert into consulta values(17,"green","Bmc",'2020-03-17 18:30:20');