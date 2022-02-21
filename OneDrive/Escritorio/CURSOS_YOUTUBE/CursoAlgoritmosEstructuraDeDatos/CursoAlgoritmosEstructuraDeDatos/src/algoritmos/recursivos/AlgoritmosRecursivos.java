
package algoritmos.recursivos;


public class AlgoritmosRecursivos {
    
    public static void main(String[] args) {
        
        System.out.println("La sumatoria de los enteros positivos del numero Inicial(Factorial) es: "+facorialNumero(4)+"\n");
        System.out.println("La Serie Fibonacci del Número Inicial es: "+serieFibonacci(6)+"\n");
    }
    
    /*
    Esta funcion al ser recursiva,se va estar ejecutando hasta
    que n=1, ya que deja de llamar internamente a la misma 
    funcion. si le pasamos el valor 3 a n, el resultado es 6 (3+2+1),
    
    sumaNumerosEntero(6); la definición es sumaNumerosEntero(6) = 6 + sumaNumerosEntero(5),
    a su vez sumaNumerosEntero(5) es 5 + sumaNumerosEntero(4), este proceso continúa hasta
    sumaNumerosEntero(1) = 1 y cae en el condicional if.
    
    
    */
    static int facorialNumero (int n)
{
    
     if (n == 1){
            return 1;
     }
         
     else{
            System.out.print(n+", ");
            return n + facorialNumero(n - 1);
     }
         }
    
    /*
    Definir la naturaleza recursiva de la serie de Fibonacci: 0, 1, 1, 2, 3, 5, 8 ,13, 21 ...
    
    0 + 1 = 1
    1 + 1 = 2
    2 + 1 = 3
    3 + 2 = 5
    5 + 3 = 8
    ...
    
    Entonces se puede establecer que :
    
    fibonacci(0) = 0
    fibonacci(1) = 1
    ...
    fibonacci(n) = fibonacci(n - 1) + fibonacci(n - 2)
    
    */
    
    static int serieFibonacci(int n){
        
        if(n==0 || n==1){
            return n;
        }
        else{
           /* int serie01=serieFibonacci(n - 1) ;
            int serie02=serieFibonacci(n - 2);
            int sumaSeries=serie01+serie02;
            
            System.out.println(serie01+" + "+serie02+" = "+sumaSeries);
            
            return sumaSeries;
            */
            System.out.print(n+", ");
           return serieFibonacci(n-1)+serieFibonacci(n-2);
}
    }
    

}
