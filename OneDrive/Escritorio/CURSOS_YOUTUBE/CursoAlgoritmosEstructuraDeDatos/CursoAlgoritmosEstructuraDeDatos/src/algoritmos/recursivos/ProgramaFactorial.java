
package algoritmos.recursivos;


import java.util.Scanner;


public class ProgramaFactorial {
    
    public static void main(String[] ar) 
{
        int n;
        
        Scanner scanner=new Scanner(System.in);
        
        do {
            System.out.print("Introduzca un número Entero Positivo: ");
            
            n = Integer.parseInt(scanner.nextLine());
        }
        while (n < 0);
        System.out.println("\n El factorial de  " + n + " es = " + factorial(n));
}
    
    
    static long factorial (int n) 
    {
        if (n <= 1){
            return 1;
        }
  

        else{

        long resultado = n * factorial(n - 1);

        return resultado;
        }

    }
}


