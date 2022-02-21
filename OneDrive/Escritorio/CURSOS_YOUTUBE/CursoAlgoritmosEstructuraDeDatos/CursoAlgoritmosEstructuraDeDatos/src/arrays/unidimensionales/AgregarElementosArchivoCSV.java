package arrays.unidimensionales;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/*
 * Se desea agregar las Mediciones obtenidas de estaciones meteorologicas de 
 * un Archivo de Texto a un array unidimensional y visualizar las mismas. 
 * (No importa en base a que se hizo, que se considera, ni nada, solo tomar 
 * las mediciones del archivo mediciones.csv), para eso se trabajara con Java Nio,
 * hay una playlist en mi canal del asunto o investiga por tu cuenta acerca de esto.
 *
 *https://www.delftstack.com/es/howto/java/how-to-read-a-file-to-a-string-in-java/
 * 
 * */

public class AgregarElementosArchivoCSV {
	
	
	public static void main(String[] args) {
		
		BufferedReader bufferReader = null;
		
		
		try {
			
			//Abrir el .csv en buffer modo de lectura
			bufferReader = new BufferedReader(new FileReader("C:\\Users\\andre\\OneDrive\\Escritorio\\CURSOS_YOUTUBE\\CursoAlgoritmosEstructuraDeDatos\\CursoAlgoritmosEstructuraDeDatos\\src\\arrays\\unidimensionales\\mediciones.csv"));
		
			
			//Leer una linea del Archivo
			String lineaActual = bufferReader.readLine();
			
			
			// Si no esta vacio seguimos leyendo el fichero
			while ( lineaActual != null) {
				
				
				//Separamos cada medicion por espacio
				String arrayMediciones[] = lineaActual.split("\n");
				
				
				//Mostramos los valores en consola
				for(int i=0; i<1 ; i++) {
					System.out.println(arrayMediciones[i]);
				}
				
				//Volvemos a leer otra linea del fichero
				lineaActual = bufferReader.readLine();
				
			}
			
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		
		
		
		}finally {
			
			//Cerramos el buffer de lectura
			if(bufferReader != null) {
				
				try {
					
					bufferReader.close();
					
					
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			
			
		}
		
	

	 

}
}
