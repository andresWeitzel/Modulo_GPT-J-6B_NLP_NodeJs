package arrays.unidimensionales;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

/*
 * Generar 200 elementos de tipo decimal y guardar 100 elementos en un array
 * y otros 100 en otro array. 
 * 
 * En el primer array se deberan cambiar los valores decimales que sean 12.4 a un 
 * nuevo valor 13.3 y los que esten en el rango de 37.2 a 39.6 reemplazar por 36.0.
 * 
 * En el segundo array se deberan cambiar los elementos que esten en el rango de
 * 20.0 a 21.0  por 22.0 y los que sean mayores a 40.0 reemplazados por 40.0
 * 
 * Ademas para ambos arrays se deberan redondear los valores que esten en el rango
 * de 15.5 a 24.5 reemplazandolos por el siguente valor de cada medicion .
 *  Ej: 15.5 --> 16  17.8 --> 18 etc
 * 
 * Se deberan mostrar los indices y valores en la salida de la consola
 * */


public class AgregarManipularElementosMedicionesDecimalesParteDos {
	public static void main(String[] args) {
		
		
		double primerArrayDecimales[]= new double[100];
		double segundoArrayDecimales[]= new double[100];
		
		double decimalAleatorio;
		

		// NumberFormat Nos devuelve un decimal, con el FormatSymbols cambiamos 
		// la coma por punt y lo trabajamos como decimal.
		NumberFormat formato = new DecimalFormat("#.0",new DecimalFormatSymbols(Locale.ENGLISH));
		
		
		
		
		//============ LLENAMOS LOS ARRAYS ===============
		
		for (int i = 0; i < 100; i++) {
			
			//El Numeros Min Aleatorio es el 2 y el Max es 51.0( 49 + 2 )
		    decimalAleatorio = Math.random()* 49 + 2;

		    
		    //Guardamos el decimal en el array
		    primerArrayDecimales[i] = Double.valueOf(formato.format(decimalAleatorio));
		    
		}
		
		
		for (int j = 0; j < 100; j++) {
			
			//El Numeros Min Aleatorio es el 2 y el Max es 51.0( 49 + 2 )
		    decimalAleatorio = Math.random()* 49 + 2;

		    
		    //Guardamos el decimal en el array
		    segundoArrayDecimales[j] = Double.valueOf(formato.format(decimalAleatorio));
		    
		}
		
		
		//============ RECORREMOS LOS ARRAYS ===============
		
		System.out.println("\n======== ELEMENTOS PRIMER ARRAY ============");
		
		System.out.println("\nINDICE | VALOR");
		
		for (int i = 0; i < 100; i++) {
			
		  if (primerArrayDecimales[i] == 12.4) {
			  
			  primerArrayDecimales[i] = 13.3;
			  
			  System.out.println(i + " | " + primerArrayDecimales[i]);
		  }
		  
		  else if(primerArrayDecimales[i] >= 15.5 && primerArrayDecimales[i] <= 24.5) {
			  
			  //Redondeamos
			  primerArrayDecimales[i] = Math.ceil(primerArrayDecimales[i]);
			  
			  System.out.println(i + " | " +primerArrayDecimales[i]);
		  }
		  
		  else if(primerArrayDecimales[i] >= 37.2 && primerArrayDecimales[i] <= 39.6) {
			  
			  primerArrayDecimales[i] = 36.0;
			  
			  System.out.println(i + " | " +primerArrayDecimales[i]);
		  }
	
		  else {
			  
			  System.out.println(i + " | " +primerArrayDecimales[i]);
		  }

		  
		}
		
		
		
		
		
		System.out.println("\n======== ELEMENTOS SEGUNDO ARRAY ============");
		
		for (int i = 0; i < 100; i++) {
			
			
			if (segundoArrayDecimales[i] >= 20.0 && segundoArrayDecimales[i] <= 21.0) {
				
				segundoArrayDecimales[i] = 22.0;
				  
				System.out.println(i + " | " +segundoArrayDecimales[i]);
		
			}
			
			else if(segundoArrayDecimales[i] >= 40.0) {
				  
				segundoArrayDecimales[i] = 40.0;
				  
				  System.out.println(i + " | " +segundoArrayDecimales[i]);
			  }
			
			else if(segundoArrayDecimales[i] >= 15.5 && segundoArrayDecimales[i] <= 24.5) {
				  
				  //Redondeamos
				  segundoArrayDecimales[i] = Math.ceil(segundoArrayDecimales[i]);
				  
				  System.out.println(i + " | " +segundoArrayDecimales[i]);
			  }
			  
			else {
				System.out.println(i + " | " +segundoArrayDecimales[i]);
			}
			
			
			
		}
	}
}
