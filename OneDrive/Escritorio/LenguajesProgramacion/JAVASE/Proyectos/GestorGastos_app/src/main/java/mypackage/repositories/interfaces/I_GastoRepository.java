
package mypackage.repositories.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import mypackage.entities.Gasto;


public interface I_GastoRepository {
  
    void save(Gasto gasto);
    
    void remove(Gasto gasto);

    void update(Gasto gasto);

    List <Gasto> getAll();
    
    default Stream <Gasto> getStream(){
        return getAll().stream();
    }
    
    default Gasto getById(int id){
        return getStream()
                .filter(objeto->objeto.getId() == id)
                .findAny()
                .orElse(new Gasto());
    }

    
    default List<Gasto> getLikePrecioCompras(float precio_compras){
        return getStream()
                .filter(objetoGasto -> objetoGasto. getPrecio_compras() == precio_compras)
                .collect(Collectors.toList());
    }     
    
    default List<Gasto> getLikePrecioComprasMayorQue(float precio_compras){
        return getStream()
                .filter(objetoGasto -> objetoGasto. getPrecio_compras() > precio_compras)
                .collect(Collectors.toList());
    }    
    
    
    default List<Gasto> getLikePrecioComprasMenorQue(float precio_compras){
        return getStream()
                .filter(objetoGasto -> objetoGasto. getPrecio_compras() < precio_compras)
                .collect(Collectors.toList());
    }    
    
    
   
    default List<Gasto> getLikeComentarioCompras(String comentario_compras){
           if (comentario_compras== null) {
            return new ArrayList<Gasto>();
        }
        return getStream()
                .filter(objetoGasto -> objetoGasto. getComentario_compras() 
                .contains(comentario_compras))
                .collect(Collectors.toList());
      
    }


    default List<Gasto> getLikePrecioServicios(float precio_servicios){
        return getStream()
                .filter(objetoGasto -> objetoGasto. getPrecio_servicios() == precio_servicios)
                .collect(Collectors.toList());
    }    
    
    
    default List<Gasto> getLikePrecioServiciosMayorQue(float precio_servicios){
        return getStream()
                .filter(objetoGasto -> objetoGasto. getPrecio_servicios() >  precio_servicios)
                .collect(Collectors.toList());
    }    
    
    
    default List<Gasto> getLikePrecioServiciosMenorQue(float precio_servicios){
        return getStream()
                .filter(objetoGasto -> objetoGasto. getPrecio_servicios() <  precio_servicios)
                .collect(Collectors.toList());
    }    
    
    
   
    default List<Gasto> getLikeComentarioServicios(String comentario_servicios){
           if (comentario_servicios == null) {
            return new ArrayList<Gasto>();
        }
        return getStream()
                .filter(objetoGasto -> objetoGasto. getComentario_servicios() 
                .contains(comentario_servicios))
                .collect(Collectors.toList());
      
    }

    
    default List<Gasto> getLikePrecioTransporte(float precio_transporte){
        return getStream()
                .filter(objetoGasto -> objetoGasto. getPrecio_transporte() == precio_transporte)
                .collect(Collectors.toList());
    }    
    
    default List<Gasto> getLikePrecioTransporteMayorQue(float precio_transporte){
        return getStream()
                .filter(objetoGasto -> objetoGasto. getPrecio_transporte() > precio_transporte)
                .collect(Collectors.toList());
    }    
    
    
    default List<Gasto> getLikePrecioTransporteMenorQue(float precio_transporte){
        return getStream()
                .filter(objetoGasto -> objetoGasto. getPrecio_transporte() < precio_transporte)
                .collect(Collectors.toList());
    }    
    
    
    
    default List<Gasto> getLikeComentarioTransporte(String comentario_transporte){
           if (comentario_transporte == null) {
            return new ArrayList<Gasto>();
        }
        return getStream()
                .filter(objetoGasto -> objetoGasto. getComentario_transporte() 
                .contains(comentario_transporte))
                .collect(Collectors.toList());
      
    }
    
    default List<Gasto> getLikeFecha(String fecha){
           if (fecha == null) {
            return new ArrayList<Gasto>();
        }
        return getStream()
                .filter(objetoGasto -> objetoGasto. getFecha() 
                .contains(fecha))
                .collect(Collectors.toList());
      
    }    
    
    
}
