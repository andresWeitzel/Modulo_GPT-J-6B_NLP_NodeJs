package arrays.bidimensionales;

/* Se desea crear una matriz cuadrada de 2x2 y agregar elementos 
 * sobre la misma linea. Seguidamente imprimirlos en consola*/
public class AgregarElementosMismaLinea {

	public static void main(String[] args) {
		
		int arrayNumeros[][] = { {0,1},{3,6} };//2 filas, 2 columnas (2x2)
		
		System.out.println("\n================= Elementos Array/Matriz ================");
		
		System.out.println("Primera Fila: ");
		System.out.println(arrayNumeros[0][0]);
		System.out.println(arrayNumeros[0][1]);
		

		System.out.println("Segunda Fila: ");
		System.out.println(arrayNumeros[1][0]);
		System.out.println(arrayNumeros[1][1]);
		
		

	}
}
