package collection.vector;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class OrdenamientoElementos {
	
	public static void main(String[] args) {
		
		Vector<Double> vectorTipoDouble = new Vector();
		
		
		
		vectorTipoDouble.add(12.8);
		vectorTipoDouble.add(33.4);
		vectorTipoDouble.add(22.1);
		vectorTipoDouble.add(098.22);
		vectorTipoDouble.add(22.2);
		
		
		System.out.println("\n -- Array de Elementos No Ordenados --");

		System.out.println(vectorTipoDouble);
		
		
		//===================================================================
		
		
		System.out.println("\n -- Array de Elementos Ordenados --");
		
		//No conozco forma eficiente de ordenar los elementos con la clase Vector
		//Caemos Directamenmte sobre el Collection, por eso es que la clase
		//vector esta muy relacionada con la API collections
		Collections.sort(vectorTipoDouble);
		
		System.out.println(vectorTipoDouble);
		
		
		//===================================================================
		
		
		
	}

}
