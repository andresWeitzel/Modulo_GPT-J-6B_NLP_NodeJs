package arrays.unidimensionales;

import java.util.Scanner;

/*
 * Se desea llenar dos arrays con los elementos que ingrese por teclado 
 * el usuario.
 * Para el primer array solo se deberan ingresar los numeros primos y
 * para el segundo array los No Primos.
 * 
 * El Maximo de Numeros que debera ingresar el usuario son 10, caso de que 
 * no complete los 10 numeros, rellenar con unos o ceros.
 * 
 * Crear una funcion para la lectura de los numeros ingresados y para llenar 
 * los arrays
 * 
 * 
 * */

public class IngresarAgregarElementosPrimosNoPrimos {
	
	public static void main(String[] args) {
		
		
		numerosPrimosNoPrimos();
	}
	
	
	
	//Funcion para el Ingreso de Numeros y determinación números Primos No Primos
	 static void numerosPrimosNoPrimos() {
		 
		int arrayNumeros[]=new int[10];

		int arrayNumerosPrimos[]=new int[10];
		int arrayNumerosNoPrimos[]=new int[10];
			
			
		System.out.println("\n=== Ingresar 10 Números Enteros ===");
		
		Scanner numerosInput = new Scanner(System.in); 
		

		
		for (int i=0 ; i < 11 ; i++) {
			
			//Verificación de Indices
			if( i<10) {
				System.out.println("\n --Digite el " + (i+1)+"er Número ");
				
				arrayNumeros[i] = numerosInput.nextInt();
				
				System.out.println("Número Ingresado " + arrayNumeros[i]);
				System.out.println("-----------------------------------------");
				
			

			}else
				//Mostramos un mensaje y salimos
			{	System.out.println("\n =========================================");
				System.out.println(" == Números Ingresados de Forma Correcta ==");
				System.out.println(" =========================================");
			
			}
			
		}
			
			
	//Algoritmo para determinar numero primo y no primos
			
	int indice=0;
	
			
	
	//Con este for nos aseguramos que no se inicialice las variables en 0
	for (int repeticion=0; repeticion < 10; repeticion++){
		
		int divisor=0;
		int numero=0;
		
		
		for (int j=1; j <= arrayNumeros[indice]; j++) {
			
			//Si el numero del array modulo de j es 0, incrementamos el divisor 
			// en 1
			if(arrayNumeros[indice] % j==0) {
				
				divisor++;
				
				numero=arrayNumeros[indice];
				
			}	
			
		}
		//Si al final del bucle el divisor vale 2, el numero es primo, porque 
		// tiene solamente 2 divisores.
		
		if(divisor == 2) {
		
			arrayNumerosPrimos[indice]=numero;
			
		}
		else {
			
			arrayNumerosNoPrimos[indice]=numero;
		}
		
		//Incrementamos el indice del array en 1
		indice++;
		
		
		//Nos aseguramos de recorrer los array una sola vez
		if(repeticion >= 9) {
			

			//Mostramos el contenido de los arrays
			
			System.out.println("\n=== Números Primos ===");
			for (int k=0; k<11 ; k++) {
				
				//No pasarnos del indice maximo
				if( k < arrayNumerosPrimos.length) {
					
					//Nos aseguramos de no mostrar el 0
					if(arrayNumerosPrimos[k] != 0) {
						
						System.out.println(arrayNumerosPrimos[k]);
					}
					
				}
			}
			
			System.out.println("\n=== Números No Primos ===");
			for (int k=0; k<11 ; k++) {
				
				//No pasarnos del indice maximo
				if(k < arrayNumerosNoPrimos.length) {
					
					//Nos aseguramos de no mostrar el 0
					if(arrayNumerosNoPrimos[k] != 0) {
						
						System.out.println(arrayNumerosNoPrimos[k]);
					}
					
				}
			}
			
		}
		
		
		
	}
			
			
			
			
			
		
		
	}

}
