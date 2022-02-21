package arrays.bidimensionales;

/*
 * 
 * Crear una matriz 8x5 agregando valores cualesquiera del 0 al 100.
 * Recorrer la matriz y mostrar los valores por consola.
 * 
 * 
 * */

public class AgregarElementosDecimales {

	public static void main(String[] args) {
		
		
		double matrizNumeros[][]=new double[8][5];
		
		double numero=0;
		
		
		

		for (int i=0; i < 8 ; i++) {
			
			
			for(int j=0 ; j < 5 ; j++ ) {
				
				matrizNumeros[i][j]=numero;
				
				numero=numero+1;
				
				System.out.println(matrizNumeros[i][j]);
				
			}
		}
		
		
		System.out.println("\n======= Elementos de la Matriz =========");
		for (int i=0; i < 8 ; i++) {
			
			System.out.println("\n========= Fila " + i + "===========");
			
			for(int j=0 ; j < 5 ; j++ ) {
			
				System.out.println("Columna "+j+" | Elemento "+matrizNumeros[i][j]);
				
				
			}
		}
		
		
	}
}
