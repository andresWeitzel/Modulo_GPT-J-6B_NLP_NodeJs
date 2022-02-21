package arrays.unidimensionales;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

/*
 * Se desea analizar varias mediciones tomadas por un 
 * centro meteorologico a partir de Temperaturas Bajas(1 a 18 grados),
 * Temperaturas Medias(19 a 27), Temperaturas Altas( 28 a 39) 
 * y Temperaturas Máximas (40 a N).
 * 
 * Modelizar el Problema creando datos aleatorios y guardando dichos
 * rangos en diferentes arrays*/

public class AgregarManipularElementosMedicionesVariosArrays {
	

	
	public static void main(String[] args) {
		
		double arrayTemperaturasAleatorias[] = new double[100];
		
		double arrayTemperaturasBajas[] = new double[100];
		double arrayTemperaturasMedias[] = new double[100];
		double arrayTemperaturasAltas[] = new double[100];
		double arrayTemperaturasMaximas[] = new double[100];

		double temperaturaAleatoria;
		
		//Lo usamos para comprobar los rangos de temperatura
		double temperaturaComprobacion;
		
		// NumberFormat Nos devuelve un decimal, con el FormatSymbols cambiamos 
		// la coma por punt y lo trabajamos como decimal.
		NumberFormat formato = new DecimalFormat("#.0",new DecimalFormatSymbols(Locale.ENGLISH));
			
		
		System.out.println("\n=====================================================");
		System.out.println("========== Mediciones de Temperatura =============");
		System.out.println("=====================================================");
		// Generamos 100 Temperaturas Aleatorias, del 0 al 99 y los guardamos en el array
		for (int i = 0; i <= 99; i++) {
			
			//El Numeros Min Aleatorio es el 2 y el Max es 51.0( 49 + 2 )
		    temperaturaAleatoria = Math.random()* 49 + 2;

		    System.out.println(formato.format(temperaturaAleatoria));
		    
		    //Guardamos las mediciones en el array
		    arrayTemperaturasAleatorias[i] = Double.valueOf(formato.format(temperaturaAleatoria));
		    
		}
		
		
		// Recorremos las temperaturas y guardamos los rangos de temperaturas
		// predifinidos en cada uno de los arrays
		for(int j=0;  j <=99 ; j++) {
			
			temperaturaComprobacion = arrayTemperaturasAleatorias[j];
			
			if(temperaturaComprobacion >= 0.0 && temperaturaComprobacion <= 18.0) {
				
				arrayTemperaturasBajas[j] = temperaturaComprobacion;
 			
			}else if(temperaturaComprobacion >= 19.0 && temperaturaComprobacion <= 27.0) {
				
				arrayTemperaturasMedias[j] = temperaturaComprobacion;
			
			}else if(temperaturaComprobacion >= 28.0 && temperaturaComprobacion <= 39.0) {
				
				arrayTemperaturasAltas[j] = temperaturaComprobacion;
			
			}else if(temperaturaComprobacion >= 40.0) {
				
				arrayTemperaturasMaximas[j] = temperaturaComprobacion;
			
			}else {
				System.out.println("");;
			}
			
			
		}
		
		
		System.out.println("\n=========== TEMPERATURAS BAJAS ================");
		//Recorremos el array Temperaturas Bajas
		for(int k=0; k < arrayTemperaturasBajas.length; k++) {
			
			//Filtramos los indices vacios
			if(arrayTemperaturasBajas[k] != 0.0) {
				System.out.println(arrayTemperaturasBajas[k]);
			}
			
		}
		

		System.out.println("\n=========== TEMPERATURAS MEDIAS ================");
		//Recorremos el array Temperaturas Medias
		for(int f=0; f < arrayTemperaturasMedias.length; f++) {
			
			if(arrayTemperaturasMedias[f] != 0.0) {
				System.out.println(arrayTemperaturasMedias[f]);
			}
			
		}
		
		
		System.out.println("\n=========== TEMPERATURAS ALTAS ================");
		//Recorremos el array Temperaturas Altas
		for(int z=0; z < arrayTemperaturasAltas.length; z++) {
			
			if(arrayTemperaturasAltas[z] != 0.0) {
				System.out.println(arrayTemperaturasAltas[z]);
			}
		}
		
		
		System.out.println("\n=========== TEMPERATURAS MAXIMAS ================");
		//Recorremos el array Temperaturas Maximas
		for(int t=0; t < arrayTemperaturasMaximas.length; t++) {
			
			if(arrayTemperaturasMaximas[t] != 0.0) {
				System.out.println(arrayTemperaturasMaximas[t]);
			}
		}


	 
		
		
		
		

	}
	}

