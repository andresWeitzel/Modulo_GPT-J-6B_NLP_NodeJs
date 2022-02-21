package arrays.unidimensionales;

/*
Se desea agregar un conjunto de 50 elementos de Números Enteros dentro de un array.
El requisito para agregar cierto conjunto de números es que a los numeros pares
se le sumen 10 unidades.
 */



public class AgregarManipularElementosEnterosPorIndice {
	
public static void main(String[] args) {
		
		int arrayNumerosEnteros[] = new int[101];
		
		boolean comprobarNumeroPar;
		
		
		System.out.println("\n====== ELEMENTOS ========");
		for(int i=0 ; i <= 50; i++ ) {
			System.out.println(i);
		}
		
		
		System.out.println("\n====== ELEMENTOS DEL ARRAY ========");
		for(int i=0 ; i <= 50; i++ ) {
			
			// Usamos el Modulo de la operacion. Si le aplicamos modulo 2 al numero
			// y es Cero, el numero es par, impares diferentes que cero
			comprobarNumeroPar = (i % 2) == 0;
			
			//Comprobamos si es par
			if ( comprobarNumeroPar ) {
				
				arrayNumerosEnteros[i] = i + 10;
			
			}else {
				
				arrayNumerosEnteros[i] = i;
				
			}
			
			
			System.out.println("Elemento del Array " + arrayNumerosEnteros[i]);
		}
		
		
		
	}

}
