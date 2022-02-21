package algoritmos.rendimiento;

public class TiempoDeEjecucionLineal {

    public static void main(String[] args) {
        
        TiempoDeEjecucionLineal objeto01=new TiempoDeEjecucionLineal();

        System.out.println(objeto01.calculoTiempoEjecucion(3000));
    }
    
    
    
    long calculoTiempoEjecucion(int n){
        
        int i;
        long tiempoInicial, tiempoFinal, tiempoEjecucion;
        
        tiempoInicial=System.currentTimeMillis();
        
        for (i=0; i <= n; i++){
            
        }
        
        tiempoFinal=System.currentTimeMillis();
        
         tiempoEjecucion=tiempoFinal - tiempoInicial;
         
           return tiempoEjecucion;
    }
    
  
    

}
