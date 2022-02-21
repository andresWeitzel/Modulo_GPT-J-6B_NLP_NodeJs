package collection.vector;

import java.util.Vector;

public class VectoresDinamicosTipoObject {

	public static void main(String[] args) {
		
		Vector<Object> vectorTipoObject = new Vector();
		
		
		vectorTipoObject.add(12);
		vectorTipoObject.add(12.8);
		vectorTipoObject.add("Texto01");
		vectorTipoObject.add('H');
		vectorTipoObject.add(true);
		vectorTipoObject.add(33.9F);
		

		
		for(int i=0 ; i < vectorTipoObject.size() ; i++) {
			
			System.out.println(vectorTipoObject.elementAt(i));
		}
		
		
		//Otra Forma de Mostrar los elementos es en forma de Lista
		System.out.println(vectorTipoObject);
	}
	
	
}
