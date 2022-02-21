package arrays.bidimensionales;

/*
 * Se requiere agregar dichos datos a un Array Bidimensional (Matriz).
 * 
 * La Matriz sera Cuadrada(nro filas = nro columnas) de 2 X 2 y en la primera 
 * fila se deberan colocar los datos Nro Empleado y Sueldo. En la sedunda fila
 * el N° de Empleado y el Sueldo (A elección).
 * 
 * 
 * https://dcodingames.com/arreglos-bidimensionales-java/
 * 
 * */

public class AgregarElementosStrings {

	
	public static void main(String[] args) {
		
		//Declaramos e Instanciamos 
		String arrayNumerosTelefonicos[][] = new String[2][2];
		
		//[fila][columna]
		arrayNumerosTelefonicos[0][0]="Nro Empleado";
		
		arrayNumerosTelefonicos[0][1]="Sueldo";
		
		arrayNumerosTelefonicos[1][0]="3776464";
		
		arrayNumerosTelefonicos[1][1]="78.000";
		
		//Leemos las filas
		for(int i=0 ; i < 2; i++ ) {
			
			//Leemos las columnas
			
			for(int j=0 ; j < 2; j++ ) {
				
				System.out.println(arrayNumerosTelefonicos[i][j]);
			}
		}
		
		
		
		
	}
}
