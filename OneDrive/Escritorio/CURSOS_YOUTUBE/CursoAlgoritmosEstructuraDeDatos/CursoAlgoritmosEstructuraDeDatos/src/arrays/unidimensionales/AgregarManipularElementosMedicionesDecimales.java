package arrays.unidimensionales;

import java.util.Arrays;

/*
 * De la siguiente lista de Mediciones se necesita guardar 
 * solo los valores decimales mayores a una temperatura de 28 grados 
 * y no los enteros ni tampoco las mediciones menores a 28 grados. 
 * Filtrar dichos requerimientos y almacenarlos dentro de un array.
 * 
 * 
 * String arrayMediciones[] = {
 * "12", "14.4", "17.6", "15.2", "16", "17",
 * "23.6", "18.4", "17", "11", "17.2", "23",
 * "33", "32.1", "11", "32.5", "30.2", "29.22"
 * };
 * */

public class AgregarManipularElementosMedicionesDecimales {
	
	public static void main(String[] args) {
		
		
		
		String arrayMediciones[] = {
				 "12", "14.4", "17.6", "15.2", "16", "17",
				 "23.6", "18.4", "17", "11", "17.2", "23",
				 "33", "32.1", "11", "32.5", "30.2", "29.22"
				 };
		
		//Misma Longitud 
		double arrayMedicionesDecimales[] = new double[arrayMediciones.length]; 
		
		
		for (int i=0 ; i < arrayMediciones.length; i++) {
			
			//Nos aseguramos que sea decimal
			if(arrayMediciones[i].contains(".")) {
				
				//Guardamos el valor en formato decimal y de forma temporal 
				double valorTemperatura = Double.parseDouble(arrayMediciones[i]);
				
				//Filtramos los Mayores de 28 grados y lo guardamos en el nuevo array
				if (valorTemperatura > 28.0) {
					
					arrayMedicionesDecimales[i]= valorTemperatura;
					
					//Imprimimos el elemento
					System.out.println(arrayMedicionesDecimales[i]);
				
						
				}
				
			}
			
		
		}
		
	}
	
	

}
