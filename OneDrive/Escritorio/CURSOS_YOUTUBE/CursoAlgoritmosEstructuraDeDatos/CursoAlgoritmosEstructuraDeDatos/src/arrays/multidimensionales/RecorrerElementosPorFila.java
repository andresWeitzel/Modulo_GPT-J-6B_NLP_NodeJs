package arrays.multidimensionales;

/* Se desea crear una matriz cuadrada de 2x2x2 y agregar elementos 
 * sobre la misma linea. Seguidamente imprimirlos en consola
 * 
 * Recomiendo --> https://www.programiz.com/java-programming/multidimensional-array
 * 
 * */
public class RecorrerElementosPorFila {

	public static void main(String[] args) {
		
		//2 arrays(profundidad), 2 filas y 2 columnas (2x2x2)
		//ATENTI QUE EL PRIMER VALOR INDICA LA PROFUNDIDAD NO EL N° DE FILA
		// [N° ARRAY][N° FILA][N° COLUMNA]
		
		int arrayNumeros[][][] = { {{0,1},{3,6}}, {{4,6},{3,1}} };
		
		System.out.println("\n================= Elementos Array/Matriz ================");
		
		System.out.println("\n======= Primera Matriz ========");
		
		System.out.println("Primera Fila: ");
		System.out.println(arrayNumeros[0][0][0]);// [N° ARRAY][N° FILA][N° COLUMNA]
		System.out.println(arrayNumeros[0][0][1]);
		

		System.out.println("Segunda Fila: ");
		System.out.println(arrayNumeros[0][1][0]);
		System.out.println(arrayNumeros[0][1][1]);
		
		
		
		
		System.out.println("\n======= Segunda Matriz ========");
		
		System.out.println("Primera Fila: ");
		System.out.println(arrayNumeros[1][0][0]);// [N° ARRAY][N° FILA][N° COLUMNA]
		System.out.println(arrayNumeros[1][0][1]);
		

		System.out.println("Segunda Fila: ");
		System.out.println(arrayNumeros[1][1][0]);
		System.out.println(arrayNumeros[1][1][1]);
		
	}
}
