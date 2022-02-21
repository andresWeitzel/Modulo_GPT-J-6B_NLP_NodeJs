/*
----------------------------
-- Tienda de Indumentaria---
----------------------------

========= DML =============
*/



use db_indumentaria;



-- ==============INSERT CLIENTES===============

insert into clientes (id,nombre,apellido,edad,direccion,email,telefono,tipoDocumento,numeroDocumento) values 

	(1,'Juan','Perez',25,'Velez Dias 1123','juanPerezDump@gmail.com',1167456711,'DNI','67899076'),
	(2,'Mariela','Gutierrez',34,'San Sarasa 67','Marielita567@gmail.com', NULL ,'DNI','45670076'),
	(3,'Antonio','Parra',45,'Noriega 34','AntonioParra_jui@hotmail.com',1175894087,'PASAPORTE','AA89I00344'),
	(4,'Sofia','Arlojeti',19,NULL,NULL,NULL,NULL,NULL),
	(5,'Martin','Candia',32,'Lambordini 24','elcalcioDiItalia@hotmail.com',1176984544,'DNI','87690544');



-- ==============INSERT ARTICULOS===============

insert into articulos (id,categoria,descripcion,precio,stock,stockMinimo,stockMaximo,costo) values
	(1,'ROPA','Sweater Blanco',2500.00, 18, 10, 30, 1100.00),
	(2,'ROPA','Piloto Invernal serie 2',3800.00, 10, 5, 30, 2100.00),
	(3,'CALZADO','Zapatillas Nasha Keep',4300.00, 34, 10, 100, 2800.00),
	(4,'CALZADO','Zapatos Gashi Gashi',5900.00, 5, 1, 10, 3100.00),
	(5,'ACCESORIOS','Sombrero Vifu',2800.00, 3, 3, 20, 1000.00),
	(6,'ACCESORIOS','Cartera Gucci',9500.00, 2, 2, 10, 3100.00);



-- ==============INSERT ARTICULOS ROPA===============

insert into articulos_ropa_detalles (id,idArticulo,tipo,usabilidad,talle,color,temporada) values 
	(1, 1, 'Abrigo', 'Vestir/Formal', 'M', 'Blanco', 'INVIERNO'),
	(2, 2,'Abrigo', 'Lluvia' ,'XL' , 'Negro' , 'INVIERNO');


-- ==============INSERT ARTICULOS CALZADOS===============

insert into articulos_calzados_detalles (id,idArticulo,tipo,usabilidad,numero,color) values 
	(1, 3, 'Zapatillas', 'Deportivo', 39 , 'Violeta/Verde'),
	(2, 4, 'Zapatos', 'Vestir/Formal', 43,'Negro Mate');


-- ==============INSERT ARTICULOS DETALLES===============

insert into articulos_accesorios_detalles (id,idArticulo,tipo,color) values 
	(1, 5, 'Sombrero', 'Blanco/Morado'),
	(2, 6, 'Cartera', 'Rosado');






-- ==============INSERT FACTURAS===============

insert into facturas (id, idCliente, idArticulo, precio, cantidad) values 
	
	(1 , 1 , 1 , 5000.0 , 1),
	(2 , 2 , 2 , 7600.0 , 2);



-- ==============INSERT FACTURAS DETALLES===============

insert into facturas_detalles (id, idFactura, tipo, numero, fechaEmision, medioDePago, descripcion) values 
	(1,1,'A',9993028302,now(),'EFECTIVO',NULL),
	(2,2,'B',7684999033,now(),'TARJETA','Debito');


