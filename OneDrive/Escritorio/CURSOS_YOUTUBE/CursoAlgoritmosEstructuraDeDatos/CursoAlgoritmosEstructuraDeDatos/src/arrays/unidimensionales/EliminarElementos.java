package arrays.unidimensionales;

public class EliminarElementos {

	public static void main(String[] args) {
		
		int array[]=new int[20];
		int arrayTemporal[]=new int[20];
		
		
		System.out.println("\n=== Array de Números ===");
		for(int i=0; i< array.length ; i++) {
			
			array[i]= 2 + i;
			
			System.out.println(array[i]);
		}
		
		
		
		System.out.println("\n==== Eliminando Elementos ====");
		
		for(int i=0; i< array.length ; i++) {
			
			if(array[i] == 12 ) {
				
				array[i] = 0;
				
				
			}
			
			else if( !(array[i] == 0) ) {
				
			
			
				System.out.println(arrayTemporal[i]);
				
				
			}else {
				
				array[i]=array[i];
			}
			
		
		}
		
		
		System.out.println("\n=== Array Depurado ===");
		
		for(int i=0; i< arrayTemporal.length ; i++) {
			
			System.out.println(arrayTemporal[i]);	
			
		}
		
	}
	
}
