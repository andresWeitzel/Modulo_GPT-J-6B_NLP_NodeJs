package collection.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ComparacionArrayListLinkedList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> listaNumeros01 = new ArrayList();
		
		//Agregamos 2000 elementos a la lista
		for(int i=0 ; i < 10000 ; i++) {
			listaNumeros01.add(2 + i);
		}
		
		
		LinkedList<Integer> listaNumeros02 = new LinkedList();
		
		//Agregamos 2000 elementos a la lista
		for(int i=0 ; i < 10000 ; i++) {
			listaNumeros02.add(2 + i);
		}
		
		
		
		
		
		//System.out.println("\n== Elementos de la Lista ArrayList ==");
		//System.out.println(listaNumeros);
		
		
		System.out.println("\n == Tiempo de Recorrido de Elementos del ArrayList==");
		tiempoArrayList(listaNumeros01);
		
		System.out.println("\n == Tiempo de Recorrido de Elementos del ArrayList con el ITERATOR==");
		tiempoArrayListIterator(listaNumeros01);
		
		System.out.println("-------------------------------------------------------------");
		
		System.out.println("\n == Tiempo de Recorrido de Elementos del LinkedList==");
		tiempoLinkedList(listaNumeros02);
		
		System.out.println("\n == Tiempo de Recorrido de Elementos del LinkedList con ITERATOR==");
		tiempoLinkedListIterator(listaNumeros02);
		
		
		
		//EL TIEMPO VARIA SEGUN LOS RECURSOS DE CADA COMPUTADORA, PERO LO QUE
		//NO VARIA ES EL PERFORMANCE DE LOS TIPOS DE LISTAS, ARRAYLIST VA A SER
		//MAS PERFORMANCE QUE UN LINKEDLIST, AUNQUE USEMOS UN ITERATOR(EFICIENCIA
		//PARA LINKEDLIST)
		
		
		
	}
	
	//Creamos 2 metodo de cada tipo de lista para medir el performance
	
	public static void tiempoArrayList(ArrayList<Integer> lista) {
		
		//Tiempo Inicial para el bucle
		long startTime = System.currentTimeMillis();
		
		int size= lista.size();
		
		for(int i=0; i<size; i++) {
			
			lista.get(i);
		}
		
		//Tiempo Final
		long finalTime = System.currentTimeMillis() - startTime;
		
		System.out.println("Tiempo Total en ArrayList "+finalTime+" ms");
		
	}
	
	
	public static void tiempoArrayListIterator(ArrayList<Integer> lista) {
		
		//Tiempo Inicial para el bucle
		long startTime = System.currentTimeMillis();
		
	
		for(Iterator<Integer> iter = lista.iterator(); iter.hasNext();){
			iter.next();
		}
		
		//Tiempo Final
		long finalTime = System.currentTimeMillis() - startTime;
		
		System.out.println("Tiempo Total en ArrayList "+finalTime+" ms");
		
	}
	
	
	
	
	
	
	
	
	
	public static void tiempoLinkedList(LinkedList<Integer> lista) {
		
		//Tiempo Inicial para el bucle
		long startTime = System.currentTimeMillis();
		
		int size= lista.size();
		
		for(int i=0; i<size; i++) {
			
			lista.get(i);
		}
		
		//Tiempo Final
		long finalTime = System.currentTimeMillis() - startTime;
		
		System.out.println("Tiempo Total en ArrayList "+finalTime+" ms");
		
	}
	
	
	public static void tiempoLinkedListIterator(LinkedList<Integer> lista) {
		
		//Tiempo Inicial para el bucle
		long startTime = System.currentTimeMillis();
		
		for(Iterator<Integer> iter = lista.iterator(); iter.hasNext();){
			iter.next();
		}
		
		//Tiempo Final
		long finalTime = System.currentTimeMillis() - startTime;
		
		System.out.println("Tiempo Total en ArrayList "+finalTime+" ms");
		
	}
	
	

}
