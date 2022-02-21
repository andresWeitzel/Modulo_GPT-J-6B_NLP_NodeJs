package arrays.unidimensionales;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

/* Se desea generar un conjunto de 50 numeros decimales de forma
 * aleatoria y almacenarlos en un array unidimensional. Dichos Numeros
 * deberan almacenarse solamente con 1 caracter despues del punto 
 * (Ej 1.0, 2.0, 12.9, etc )*/

public class AgregarElementosAleatorios {
	
	public static void main(String[] args) {
		
		double arrayNumerosAleatorios[]=new double[100];
		
		double numeroAleatorio;
		
		//Nos devuelve un String con coma, no se puede  parsear a double, ATENTI
		//DecimalFormat formato = new DecimalFormat("#.0");
		
		//NumberFormat nos devuelve un decimal, con el FormatSymbols cambiamos
		//la coma por punto y lo trabajamos como decimal
		NumberFormat formato= new DecimalFormat("#.0", new DecimalFormatSymbols(Locale.ENGLISH));
		
		//Generamos 50 numeros, del 1 al 50 y los guardamos en el array
		
		for( int i=0; i < 50 ; i++) {
			
			if(i < arrayNumerosAleatorios.length) {
				
				//El numero Min Aleatorio es el 4.0 y el max es 95.0 (89 + 4)
				numeroAleatorio = Math.random()*89 + 4;
				
				
				//System.out.println(formato.format(numeroAleatorio));
				
				arrayNumerosAleatorios[i] = Double.valueOf(formato.format(numeroAleatorio));
	
			}else {
				
				return;
			}
		}
		

		
		//Visualizamos los elementos del Arrray
		for( int i=0; i < 50 ; i++) {
			
			if(i < arrayNumerosAleatorios.length) {
				
				System.out.println("== Elemento N°"+i+" ==");
				System.out.println(arrayNumerosAleatorios[i]);
				
			}else {
				
				return;
			}
		}
		
		
		
		
		

	}

}
