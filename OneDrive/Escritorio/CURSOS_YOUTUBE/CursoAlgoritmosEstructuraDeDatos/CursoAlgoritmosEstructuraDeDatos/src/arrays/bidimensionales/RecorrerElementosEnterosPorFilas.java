package arrays.bidimensionales;


/*Recorrer los elementos por sus filas de la siguiente matriz 2x2 

*
	 (			
	 	6,7
	 	4,55
	 		)
	
*/

public class RecorrerElementosEnterosPorFilas {
	
	public static void main(String[] args) {
		
		
		int arrayEnteros [][] = { {6,7},{4,55} };
		
		System.out.println("\n========  Elemento a Elemento por Filas ==========");
		
		System.out.println("--- Fila 0 ---");
		System.out.println(arrayEnteros[0][0]);
		System.out.println(arrayEnteros[0][1]);
		
		System.out.println("--- Fila 1 ---");
		System.out.println(arrayEnteros[1][0]);
		System.out.println(arrayEnteros[1][1]);
		
		
		System.out.println("\n======== Recorrido Elemento a Elemento por Filas ==========");
		
		System.out.println("--- Fila 0 ---");
		for(int i=0 ; i<2; i++) {
			System.out.println(arrayEnteros[0][i]);
		}
		
		System.out.println("--- Fila 1 ---");
		for(int i=0 ; i<2; i++) {
			System.out.println(arrayEnteros[1][i]);
		}
		
		System.out.println("\n======== Recorrido Eficiente Elemento a Elemento por Filas ==========");
		
		for(int i=0; i<2 ; i++) {//filas
			
			System.out.println("--- Fila"+i+"---");
			
			for(int j=0 ; j<2 ; j++) {//columnas
			
				
				System.out.println(arrayEnteros[i][j]);
			}
		}
	
	}

}
