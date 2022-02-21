package collection.stack;

import java.util.Stack;

public class CrudPilasFuncionamiento {

	// RECORDAR QUE SE MANTIENEN LOS INDICES EN LAS PILAS COMO EN LOS VECTORES
	// PERO SU ARQUITECTURA DE ACCESO Y BUSQUEDA CAMBIA, EL ULTIMO ELEMENTO DE
	// UN VECTOR/PILA ES EL SUPERIOR EN UN ENPILAMIENTO (ACCESO, NO ALMACENAMIENTO)
	// LAS PILAS Y VECTORES SE ALAMACENAN SUS ELEMENTO POR IGUAL, PERO EL ACCESO
	// CAMBIA

	public static void main(String[] args) {

		int num01 = 12;
		int num02 = 22;
		int num03 = 333;

		Stack<Integer> pila = new Stack();

		System.out.println("\n === Agregamos los Elemento con .push() ===");
		pila.push(num01);
		pila.push(num02);
		pila.push(num03);
		System.out.println(pila);

		System.out.println("\n === Visualizamos el Primer Y Último Elemento de la pila con .peek() ===");
		System.out.println(pila.firstElement());// PRIMER ELEMENTO
		System.out.println(pila.lastElement());// ULTIMO ELEMENTO
		System.out.println(pila.peek());// ULTIMO ELEMENTO (ELEMENTO SUPERIOR DE LA PILA, PRIMER ELEMENTO APILADO)

		System.out.println("\n === Eliminamos el Último Elemento de la pila con .pop() ===");
		System.out.println(pila.pop());// PRIMER ELEMENTO APILADO
		System.out.println(pila);

	}
}
