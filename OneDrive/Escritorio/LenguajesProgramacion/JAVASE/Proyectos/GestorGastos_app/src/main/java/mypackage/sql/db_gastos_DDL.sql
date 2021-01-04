-- /////////////////////////////////////////////////////////////////////////////////////////////////////
-- //////Base de Datos de gastos personales(transporte, servicios, compras, etc)//////////////////////////////
-- ////////////////////////////////////////////////////////////////////////////////////////////////////

drop database if exists db_gastos;
create database db_gastos;

use db_gastos;
drop table if exists gastos;

create table gastos(

id					int 				auto_increment primary key,

precio_compras				float,
comentario_compras 	varchar(50), -- Aclara si es comida, alguna cmopra de otra cosa, etc

precio_servicios			float,
comentario_servicios varchar(50), -- Siempre comentarios para aclarar que servicios se pagan				

precio_transporte			float,
comentario_transporte varchar(50), -- Aclara si es gasto en nafta, subte, etc.

fecha				datetime		not null

);