package collection.vector;

import java.util.Vector;

public class AgregarElementosPorIndice {
	public static void main(String[] args) {
		
		
Vector<Integer> vectorDinamico = new Vector();
		

		System.out.println("\n -- Agregamos 2 Elementos --");
		vectorDinamico.add(2);
		vectorDinamico.add(12);
	
		System.out.println(vectorDinamico.elementAt(0));
		System.out.println(vectorDinamico.elementAt(1));
		
		
		//===================================================================
		
		
		
		System.out.println("\n -- Agregamos 1 Elemento en el Indice 0 --");
		
		vectorDinamico.add(0,23);
		
		//Recorrido Poco Eficiente
		//System.out.println(vectorDinamico.elementAt(0));
		//System.out.println(vectorDinamico.elementAt(1));
		//System.out.println(vectorDinamico.elementAt(2));
		
		
		//Recorrido Eficiente
		for(int i=0 ; i < vectorDinamico.size() ; i++) {
			
			System.out.println(vectorDinamico.elementAt(i));
		}
		
		
		//===================================================================
		

		System.out.println("\n -- Agregamos 50 Elementos al Array --");
		
		for(int i=0 ; i < 50 ; i++) {
			
			vectorDinamico.add(i, (0+i) );
			//System.out.println(vectorDinamico.elementAt(i));
		}
		
		
		
		//Recorrido Eficiente
		for(int i=0 ; i < vectorDinamico.size() ; i++) {
			
			System.out.println(vectorDinamico.elementAt(i));
		}
		
		
		//===================================================================
		
		
		//PODEMOS AHORRARNOS EL FOREACH PARA RECORRER EL ARRAY
		
		System.out.println("\n -- Agregamos 20 Elementos al Array --");
		
		for(int i=0 ; i < 20 ; i++) {
			
			vectorDinamico.add(i, (0+i) );
			//System.out.println(vectorDinamico.elementAt(i));
		}
		
		System.out.println(vectorDinamico.toString());
		
		
	}

}
