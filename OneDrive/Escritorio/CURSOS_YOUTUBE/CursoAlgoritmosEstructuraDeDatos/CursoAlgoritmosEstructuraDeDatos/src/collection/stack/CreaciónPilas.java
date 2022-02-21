package collection.stack;

import java.util.Stack;

public class CreaciónPilas {
	public static void main(String[] args) {
		
		//Una pila sigue el modelo LIFO (Last In - First Out, o último en entrar 
		//- primero en salir). Esta clase hereda de la clase que ya hemos visto
		//anteriormente, la clase Vector y con 5 operaciones permite tratar un
		//vector a modo de pila o stack
		
		//Las operaciones básicas son 
		// push ( introduce un elemento en la pila)
		// pop ( saca el ultimo elemento de la pila) 
		//peek (consulta el ultimo elemento (primer elemento apilado))
		//empty (que comprueba si la pila está vacía) 
		//search (que busca un determinado elemento dentro de la pila y 
		//devuelve su posición dentro de ella).
		
		Stack<Integer> pila = new Stack();
		
		
		for (int i=0 ; i < 50 ; i++) {
			
			pila.add(i);
			System.out.println(pila);
			
		}
		
		
	}

}
