create table producto(
	prod_id int not null primary key ,
    prod_fabricante varchar(45) not null,
    prod_precio int not null
);

insert into producto values(100,"Cannondale",1200000);
insert into producto values(101,"Trek",1450000);
insert into producto values(102,"Yeti",2000000);
insert into producto values(103,"Fuji",950000);
insert into producto values(104,"Bmc",1950000);
insert into producto values(105,"Starker",4200000);
insert into producto values(106,"Lucky Lion",5600000);
insert into producto values(107,"Be Electric",4600000);
insert into producto values(108,"Aima",8000000);
insert into producto values(109,"Mec de Colombia",5900000);
insert into producto values(200,"Atom Electric",4500000);