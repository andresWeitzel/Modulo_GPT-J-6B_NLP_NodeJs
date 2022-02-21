package collection.vector;

import java.util.Collection;
import java.util.Vector;

//https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=596:interface-collection-api-java-add-remove-size-ejemplo-arraylist-diferencia-con-list-streams-cu00917c&catid=58&Itemid=180

/*
* Java proporciona un grupo de clases que almacenan secuencias de objetos de 
* cualquier tipo, son las colecciones. Se diferencian en la forma de organizar
*  los objetos y, en consecuencia, la manera de recuperarlos. La clase Vector 
*  (paquete java.util) es una de estas colecciones, tiene un comportamiento
*  similar a un array unidimensional.
*  Un Vector guarda objetos (referencias) de cualquier tipo y crece 
*  dinámicamente,sin necesidad de tener que programar operaciones adicionales. 
*  El array donde almacena los elementos es de tipo Object.
* 
* 
* ATENTI: LUEGO DE ESTE EJEMPLO VAMOS A TRABAJAR CON JAVA8, POO Y ALGUNAS BUENAS
* PRACTICAS, TE RECOMIENDO INVESTIGAR Y APRENDER EN 
* PARALELO ESTOS TEMAS
* 
* 
* */


public class CreacionVectoresDinamicos {
	
	public static void main(String[] args) {
		
		//Operaciones Basicas
		//add (agregamos elementos al vector)
		//firstElement (primer elemento del vector)
		//lastElement (ultimo elemento del vector)
		//remove (eliminamos un elemento del vector)
		//entre otros
		
		//https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2020/03/collection-framework-hierarchy-in-java.jpg
		
		// Vectores Dinámicos de la clase Vector, indirectamente implementa la interfaz collection
		Vector<Integer> vectorDinamicoNumeros = new Vector<Integer>();
		
		
		// Vectores Dinámicos de la Interfaz Collection
		Collection<Integer> vectorDinamicoCollection = new Vector<Integer>();
		
		
		System.out.println("\n == Vector Dinamico Clase Vector ==");
		for(int i=0 ; i<20; i++) {
			
			vectorDinamicoNumeros.add(9 + i);
			
			System.out.println("Indice "+i+" | Elemento/Numero "+vectorDinamicoNumeros.lastElement());
		}
		
		
		System.out.println("\n == Vector Dinamico Interface Collection ==");
		for(int i=0 ; i<20; i++) {
			
			vectorDinamicoCollection.add(9 + i);
			
			System.out.println(vectorDinamicoCollection.toString());
		
		}

		
		
		
		
		
		
	}

}
