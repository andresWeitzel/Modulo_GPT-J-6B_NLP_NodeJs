package arrays.unidimensionales;


/*
Se desea agregar un conjunto de Números Enteros pares
del 0 al 100 dentro de un array.
El requisito para agregar cierto conjunto de números es hacerlo
solamente por indice y que sean pares, de forma que en el ultimo 
indice del arreglo se encuentre el número 100  y en el primer 
indice el numero 2(para no entrar en la discusión de si el 0 es par). 
 */


public class AgregarElementosEnterosParesPorIndice {
	
	public static void main(String[] args) {
		
		int arrayNumerosPares[] = new int[101];
		
		for (int i=0 ; i < 101;) {
			
			//i=i+2;
			
			i+=2;
			
			if( i < 101) {
				
				arrayNumerosPares[i] = i;
				
				System.out.println("Elementos del Array " + arrayNumerosPares[i]);
				
				
			}
			
			
			
			
			
		
		}
		
	}

}
