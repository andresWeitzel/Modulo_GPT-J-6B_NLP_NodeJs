
package mypackage.test;

import java.time.LocalDateTime;
import mypackage.connector.LocalConnector;
import mypackage.entities.Gasto;
import mypackage.repositories.interfaces.I_GastoRepository;
import mypackage.repositories.jdbc.GastoRepository;


public class TestGasto {
    public static void main(String[] args) {
        
    I_GastoRepository gastoRepository=new GastoRepository(LocalConnector.getLocalConnection());

    // -----------INSERT---------------
        System.out.println("\n=================Agregamos un nuevo gasto===============\n");
    Gasto nuevoGasto=new Gasto(1200f, "supermercado y fiambreria", 670f, "Cable", 110f, "Recarga Tarjeta Sube", String.valueOf(LocalDateTime.now()));
    gastoRepository.save(nuevoGasto);
        System.out.println(nuevoGasto);
        System.out.println("\n=================Lista de Gastos===============\n");
    gastoRepository.getAll().forEach(System.out::println);
        
// -----------FIN INSERT---------------
    
    
    // -----------DELETE---------------
        System.out.println("\n=================Eliminamos el nuevo gasto agregado===============\n");
    gastoRepository.remove(nuevoGasto);
        System.out.println("\n=================Lista de Gastos Actualizada===============\n");
    gastoRepository.getAll().forEach(System.out::println);
    
    // -----------FIN DELETE---------------
    
    
    // -----------UPDATE---------------
        System.out.println("\n=================Actualizamos el gasto con el id 2===============\n");
            
        nuevoGasto=gastoRepository.getById(2);
        
        if( nuevoGasto != null &&  nuevoGasto.getId() != 0){
            
             nuevoGasto.setPrecio_compras(1900f);
            
            gastoRepository.update(nuevoGasto);
        }
        
        System.out.println("\n=================Lista de Gastos Actualizada===============\n");
    gastoRepository.getAll().forEach(System.out::println);
    
    // -----------FIN UPDATE---------------
    
    
    // -----------SELECT---------------
    
    System.out.println("\n=================Gasto cuyo id sea 3===============\n");
        System.out.println(gastoRepository.getById(3));
    
       System.out.println("\n================= Gasto cuyo precio de compra sea $300===============\n");
        System.out.println(gastoRepository.getLikePrecioCompras(300));
        
        
       System.out.println("\n================= Gasto cuyo precio de compra sea mayor a  $600===============\n");
        System.out.println(gastoRepository.getLikePrecioComprasMayorQue(600));
    
        
       System.out.println("\n================= Gasto cuyo precio de compra sea menor a $200===============\n");
        System.out.println(gastoRepository.getLikePrecioComprasMenorQue(200));
    
    
      
    
    // -----------FIN SELECT---------------
    
    
    
    
    }
    
}
