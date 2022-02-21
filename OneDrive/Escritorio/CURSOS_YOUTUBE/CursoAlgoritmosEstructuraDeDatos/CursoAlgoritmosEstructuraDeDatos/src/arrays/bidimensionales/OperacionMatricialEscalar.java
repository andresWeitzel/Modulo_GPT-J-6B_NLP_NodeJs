package arrays.bidimensionales;

/*
 * Se desea realizar la multiplicacion de un escalar con una matriz
 * 
 * 
 * El formato del programa sera el siguiente
 * La matriz la denotaremos como (m x n)
 * El escalar lo denotaremos como k
 * 
 * 
 * El programa debera realizar la operacion (m x n) x k
 * 
 * 
 * Tener en consideracion que un escalar multiplicado con una
 * matriz se realiza elemento a elemento
 * 
 * 
 * Comprobar dicha operacion por un simulador online
 * 
 * https://es.symbolab.com/
 * 
 * 
 * 
 * 
 * == Matriz 2x2 ==
 * 		
 * 	(	4	6  	)
 * 	(	8	9  	)
 * 
 * == Escalar ==
 * 
 *		6
 * 
 * 
 * 
 * */
public class OperacionMatricialEscalar {
	
	public static void main(String[] args) {
		
	int matrizEnteros [][] = { {4,6} , {8,9} };	
		
	int escalar = 6;
	
	
	
	
	
	for (int i=0; i < 2 ; i++) {
		
		System.out.println("\n========= Fila " + i + "===========");
		
		for(int j=0 ; j < 2 ; j++ ) {
			
			
			System.out.println("Columna "+j+" | Elemento "
			+(matrizEnteros[i][j] * escalar));
			
			

		}
	}
	
	
	
	
	}

}
