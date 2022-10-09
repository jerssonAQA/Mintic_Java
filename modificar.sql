update bicicleta set anio_bici = 2017 where prod_id=(select prod_id from producto where prod_fabricante like "Cannondale");
update clientes set celular ='3115678432' where (alias='ninja');
UPDATE `reto4`.`clientes` SET `celular` ='3115678432' WHERE (`alias` = 'ninja');
delete from consulta where (alias = "green" and fabricantes="Trek");

