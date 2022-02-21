

/* ----------------------------
 * -- Tienda de Indumentaria---
 * ----------------------------
 * 
 * 
 * ========= DDL =============
 */

drop database if exists db_indumentaria;

create database db_indumentaria;

use db_indumentaria;


drop table if exists clientes;
drop table if exists articulos;
drop table if exists articulos_calzados_detalles;
drop table if exists articulos_ropa_detalles;
drop table if exists articulos_accesorios_detalles;
drop table if exists facturas;
drop table if exists facturas_detalles;


show tables;




create table clientes(
	id int auto_increment primary key,
	nombre varchar(20) not null,
	apellido varchar(20) not null,
	edad int,
	direccion varchar(50),
	email varchar(40),
	telefono varchar(25),
	tipoDocumento enum('DNI','LIBRETA_CIVICA','LIBRETA_ENROLAMIENTO','PASAPORTE'),
	numeroDocumento varchar(10)
);




create table articulos(
	id int auto_increment primary key,
	categoria enum('CALZADO','ROPA','ACCESORIOS'),
	descripcion varchar(35) not null,
    precio double,
    stock int,
    stockMinimo int,
    stockMaximo int,
    costo double
    
	
);


create table articulos_calzados_detalles(

	id int auto_increment primary key,
	idArticulo int not null,
	tipo varchar(20) not null, -- Botas, zapatos, zapatillas
	usabilidad varchar(20) not null, -- Deportivo, Urbano, Fino
	numero char(3),
	color varchar(20)

);

create table articulos_ropa_detalles(

	id int auto_increment primary key,
	idArticulo int not null,
	tipo varchar(20) not null, -- Abrigo, ropa interior, remera, etc
	usabilidad varchar(20) not null, -- Fina, deportiva, de trabajo, etc
	talle varchar(4),
	temporada enum('VERANO','INVIERNO'),
	color varchar(20)
	
);


create table articulos_accesorios_detalles(

	id int auto_increment primary key,
	idArticulo int not null,
	tipo varchar(20) not null, -- Cinturones, gafas de sol, sombreros, pañuelos, etc
	color varchar(20)

);



create table facturas(
	id int auto_increment primary key,
	idCliente int not null,
	idArticulo int not null,
	precio double,
	cantidad int
	
);


create table facturas_detalles(
	id int auto_increment primary key,
	idFactura int not null,
	tipo enum('A','B','C','E'),
	numero bigint,
    fechaEmision TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	medioDePago enum('EFECTIVO','CHEQUE','TARJETA'),
	descripcion varchar(25)
	
);





-- ==============RESTRICCIONES TABLAS CLIENTES===============

-- Restriccion CHECK para Edad
alter table clientes 
	add constraint CHECK_clientes_edad
    check(edad>=18 and edad<=120); 

-- Restriccion UNIQUE para Tipo y Numero Documento   
alter table clientes
	add constraint UNIQUE_clientes_tipoNumeroDocumento
	unique(tipoDocumento,numeroDocumento);


  

-- =================RESTRICCIONES PARA TABLA ARTICULOS==============

-- Restriccion UNIQUE para id
alter table articulos
	add constraint UNIQUE_articulos_id
    unique (id);
   
-- Restriccion CHECK para precio   
alter table articulos
	add constraint CHECK_articulos_precio
    check (precio > 0 );
   
   
   -- Restriccion CHECK stock
alter table articulos
	add constraint CHECK_articulos_stock
    check (stock >= 0);

-- Restriccion CHECK stockMaximo   
alter table articulos
	add constraint CHECK_articulos_stockMaximo
    check (stockMaximo >= stockMinimo);

   -- Restriccion CHECK stockMinimo   
alter table articulos
	add constraint CHECK_articulos_stockMinimo
    check (stockMinimo > 0);

   
   -- Restriccion CHECK costo   
alter table articulos
	add constraint CHECK_articulos_costo
    check (costo >= 0);
   
   
   

-- =================RESTRICCIONES PARA TABLA ARTICULOS CALZADO DETALLE==============

-- FK idArticulos   
alter table articulos_calzados_detalles 
	add constraint FK_articulosCalzadoDetalles_idArticulos
    foreign key(idArticulo)
   	references articulos(id);
      
   
-- Restriccion UNIQUE para id 
alter table articulos_calzados_detalles
	add constraint UNIQUE_articulosCalzadosDetalles_id
	unique(id);


   -- Restriccion CHECK numero   
alter table articulos_calzados_detalles 
	add constraint CHECK_articulosCalzadosDetalles_numero
    check (numero >= 0);

   
-- =================RESTRICCIONES PARA TABLA ARTICULOS ROPA DETALLES==============

-- FK idArticulos   
alter table articulos_ropa_detalles 
	add constraint FK_articulosRopaDetalles_idArticulos
    foreign key(idArticulo)
   	references articulos(id);
      
   
-- Restriccion UNIQUE para id 
alter table articulos_ropa_detalles
	add constraint UNIQUE_articulosRopaDetalles_id
	unique(id);

   
-- =================RESTRICCIONES PARA TABLA ARTICULOS ACCESORIOS DETALLES==============

   
-- FK idArticulos   
alter table articulos_accesorios_detalles 
	add constraint FK_articulosAccesoriosDetalles_idArticulos
    foreign key(idArticulo)
   	references articulos(id);
   
   
-- Restriccion UNIQUE para id 
alter table articulos_accesorios_detalles
	add constraint UNIQUE_articulosAccesoriosDetalles_id
	unique(id);


-- ==============RESTRICCIONES TABLAS FACTURAS===============

-- FK idCliente
alter table facturas
	add constraint FK_facturas_idCliente
    foreign key(idCliente)
    references clientes(id);
   
-- FK idArticulos   
alter table facturas 
	add constraint FK_facturas_idArticulos
    foreign key(idArticulo)
   	references articulos(id);
   
    

   -- Restriccion tipo UNIQUE id facturas
alter table facturas 
	add constraint UNIQUE_facturas_id
    unique(id);    
   
   
   -- Restriccion tipo CHECK precio facturas
alter table facturas 
	add constraint CHECK_facturas_precio
    check(precio >= 0);   
   
   
-- Restriccion tipo CHECK cantidad facturas   
alter table facturas 
	add constraint CHECK_facturas_cantidad
    check(cantidad >= 0);   



-- ==============RESTRICCIONES TABLAS FACTURAS_DETALLES===============   

   -- FK idFacturas
alter table facturas_detalles 
	add constraint FK_detalles_Facturas
    foreign key(idFactura)
   	references facturas(id);     
   
   
--  Restriccion CHECK para Numero de Factura
alter table facturas_detalles 
	add constraint CHECK_facturas_numero
    check (numero > 0);


-- Restriccion UNIQUE para  numero de factura
alter table facturas_detalles 
	add constraint UNIQUE_facturas_numero
    unique(numero);
   
  
-- Restriccion UNIQUE para Id de Factura
alter table facturas_detalles 
	add constraint UNIQUE_facturas_id
    unique(idFactura);




   
   
 
