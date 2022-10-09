select 'Consulta 1';
select prod_fabricante from producto order by prod_fabricante asc;
select 'Consulta 2';
select prod_fabricante,prod_precio,anio_bici from bicicleta join producto using (prod_id) where anio_bici>=2019 order by prod_fabricante asc;
select 'Consulta 3';
select p.prod_fabricante from producto p, motocicleta m, proveedor pr where m.prod_id = p.prod_id and
m.prov_id=pr.prov_id and pr.prov_id = (select prov_id from proveedor where prov_nombre like 'Auteco');
select 'Consulta 4';
select fabricantes from consulta where alias like 'lucky' order by fabricantes asc;
select 'Consulta 5';
select c.alias, cl.nombre_apellido, cl.apellido from consulta c, clientes cl where c.alias=cl.alias and 
c.fabricantes like 'Yeti' order by 'alias' asc;
select 'Consulta 6';
select count(*) from bicicleta where anio_bici>=2019;
