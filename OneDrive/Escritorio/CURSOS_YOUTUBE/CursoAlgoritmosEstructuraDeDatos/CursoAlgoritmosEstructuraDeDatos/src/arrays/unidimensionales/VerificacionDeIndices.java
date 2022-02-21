package arrays.unidimensionales;

/*
 * Durante la ejecución del programa también puede producirse el acceso a un
 *  elemento fuera de los índices, y provocará que el programa se “rompa” 
 *  en tiempo de ejecución, generando una excepción.
 * */

public class VerificacionDeIndices {
	
public static void main(String[] args) {
	
	
	int arrayNumeros[] = new int[20];
	
	int numero = 2;
	
	for( int i=0; i<20; i++) {
		
		//Condición de Verificación 
		if( i < arrayNumeros.length) {
			
			arrayNumeros[i] = numero;
			
			numero = numero + 1;
			
			System.out.println(arrayNumeros[i]);
			
		}else {
			
			return;
		}
		
	}
	
}

}
