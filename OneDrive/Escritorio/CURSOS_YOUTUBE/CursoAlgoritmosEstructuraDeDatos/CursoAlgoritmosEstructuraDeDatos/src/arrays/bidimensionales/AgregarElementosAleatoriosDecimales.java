package arrays.bidimensionales;

/*
 * 
 * Crear una matriz cuadrada de 20x20 y agregar elementos aleatorios
 * decimales comprendidos a partir del 2.0 y 1025.
 * 
 * Mostrar los elementos en la salida de la consola ordenados por filas 
 * y columnas
 * 
 * */




public class AgregarElementosAleatoriosDecimales {
	
	public static void main(String[] args) {
		
		double matrizDecimales [][] = new double[20][20];

		double numero;
	
		
		

		for (int i=0; i < 20 ; i++) {
			
			
			for(int j=0 ; j < 20 ; j++ ) {
				
				//El Numeros Min Aleatorio es el 2.0 y el Max es 1025.0( 1023.0 + 2.0 )
				numero =Math.random() * 1023 + 2;
				
				
				matrizDecimales[i][j] = numero;
				

			}
		}
		System.out.println("\n========== Recorrido de la Matriz ==============");
		for (int i=0; i < 20 ; i++) {
			
			System.out.println("\n========= Fila " + i + "===========");
			
			
			for(int j=0 ; j < 20 ; j++ ) {
				
				
				System.out.println("Columna "+j+" | Elemento "+matrizDecimales[i][j]);
					
				
				
				
			}
		}
	}

}
