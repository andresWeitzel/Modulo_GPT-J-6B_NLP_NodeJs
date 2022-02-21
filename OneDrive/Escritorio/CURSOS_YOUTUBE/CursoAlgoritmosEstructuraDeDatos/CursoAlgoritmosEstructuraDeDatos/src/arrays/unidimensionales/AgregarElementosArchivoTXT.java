package arrays.unidimensionales;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * Se desea agregar las Mediciones obtenidas de estaciones meteorologicas de 
 * un Archivo de Texto a un array unidimensional y visualizar las mismas. 
 * (No importa en base a que se hizo, que se considera, ni nada, solo tomar 
 * las mediciones del archivo mediciones.txt), para eso se trabajara con Java
 *  Nio, hay una playlist en mi canal del asunto o investiga por tu cuenta acerca 
 *  de esto.
 *
 *https://www.delftstack.com/es/howto/java/how-to-read-a-file-to-a-string-in-java/
 * 
 * */

public class AgregarElementosArchivoTXT {

	public static void main(String[] args){
		
		/*
	//========= EJEMPLO ===========
		  
		  
	 //Ruta del Archivo
	Path path = Paths.get("ejemplo.txt");
	
	 try {
	            String content = Files.readString(path);
	            
	            
	            
	            System.out.println(content);
	            
	        }catch (IOException e){
	        	
	            e.printStackTrace();
	        }
	        
	 */
		
		//Ruta del Archivo
		Path path = Paths.get("C:\\\\Users\\\\andre\\\\OneDrive\\\\Escritorio\\\\CURSOS_YOUTUBE\\\\CursoAlgoritmosEstructuraDeDatos\\\\CursoAlgoritmosEstructuraDeDatos\\\\src\\\\arrays\\\\unidimensionales\\\\mediciones.txt");
		
		String arrayNumerosEnteros[] = new String[100];
		
		//Para el indice del array
		int i=0;
		
		try {
			
			//El Metodo readString nos devuelve el conjunto de datos
			String contenido = Files.readString(path);
			
			//Imprimimos el contenido del fichero
			System.out.println(contenido);
			
			//Guardamos el conjunto de datos en el indice 0
			arrayNumerosEnteros[i] = String.valueOf(contenido);
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("\n============================");
		
		
		//Todos los datos lo tenemos en el indice 0
		
		for(int j=0 ; j < 1 ; j++) {
			
			if(!(arrayNumerosEnteros.equals(null))) {
				
				System.out.println("Elementos del Array");
				System.out.println(arrayNumerosEnteros[j]);
				
			}
			
		}
		
		
		
		
		
		
	
			
			
		
			
	}
}
