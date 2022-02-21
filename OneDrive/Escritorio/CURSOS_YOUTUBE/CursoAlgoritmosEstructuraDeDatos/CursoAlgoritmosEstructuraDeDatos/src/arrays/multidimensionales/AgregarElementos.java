package arrays.multidimensionales;

/* Se desea crear una matriz cuadrada de 2x2x2 y agregar sus elementos 
 * 
 *
 * */

public class AgregarElementos {

	public static void main(String[] args) {
		
		//2 arrays(profundidad), 2 filas y 2 columnas (2x2x2)
		//ATENTI QUE EL PRIMER VALOR INDICA LA PROFUNDIDAD NO EL N° DE FILA
		// [N° ARRAY][N° FILA][N° COLUMNA]
				
		int arrayTridimensional[][][] = new int [2][2][2]; 
		
		//Primer Array, Primera Fila,  Primera Columna
		arrayTridimensional[0][0][0] = 222;
		
		//Primer Array, Primera Fila, Segunda Columna
		arrayTridimensional[0][0][1] = 42;
		
		
		
		//Comprobemos que hay valores en el array, más adelante veremos como recorrerlos		
	
		//PRIMERA FORMA
		System.out.println(arrayTridimensional.length);
		
		//SEGUNDA FORMA
		for(int i=0 ; i < 2; i++ ) {
			System.out.println("Elementos del Array " + arrayTridimensional[i]);
		}
		
		
	}
	
}
