-- /////////////////////////////////////////////////////////////////////////////////////////////////////
-- //////Base de Datos de gastos personales(transporte, servicios, compras, etc)//////////////////////////////
-- ////////////////////////////////////////////////////////////////////////////////////////////////////


use db_gastos;

insert into gastos(id, precio_compras, comentario_compras,
 precio_servicios, comentario_servicios, precio_transporte, comentario_transporte, fecha) values
 (1, 200.00, 'supermercado', 1000.00, 'Luz', 150.00, 'Uber', now()),
 (2, 2000.00, 'Ferreteria', 500.00, 'Agua', 50.00, 'Subte', now());