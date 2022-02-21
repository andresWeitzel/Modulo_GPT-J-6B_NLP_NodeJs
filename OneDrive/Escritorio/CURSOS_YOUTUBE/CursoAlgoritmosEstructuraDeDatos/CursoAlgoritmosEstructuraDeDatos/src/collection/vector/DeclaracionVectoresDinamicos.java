package collection.vector;

import java.util.Vector;

public class DeclaracionVectoresDinamicos {
	
	public static void main(String[] args) {
		
		
		
		Vector<Integer> vectorDinamico = new Vector(2);
		

		System.out.println("\n == Agregamos 2 Elementos al Vector(tamaño de 2) ==");
		for(int i=0 ; i<2; i++) {
			
			vectorDinamico.add(3 + i);
			
			System.out.println("Indice "+i+" | Elemento/Numero "+vectorDinamico.lastElement());
		
		}
		
		//===================================================================
		
		
		
		System.out.println("\n == Agregamos 6 Elementos al Vector(El vector crece a 8) ==");
		for(int i=0 ; i<6; i++) {
			
			vectorDinamico.add(2 + i);
			
			System.out.println(vectorDinamico.lastElement());
		
		}
		
		
		//===================================================================
		
		
		System.out.println("\n == Cantidad de elementos del Vector ==");
	
		System.out.println(vectorDinamico.size());
		
		
		
		//===================================================================
		
		
	}

}
