package collection.stack;

import java.util.Stack;
import java.util.Vector;

public class ComparacionMetodosPilasVectores {

	public static void main(String[] args) {

		// RECORDAR QUE SE MANTIENEN LOS INDICES EN LAS PILAS COMO EN LOS VECTORES
		// PERO SU ARQUITECTURA DE ACCESO Y BUSQUEDA CAMBIA, EL ULTIMO ELEMENTO DE
		// UN VECTOR/PILA ES EL SUPERIOR EN UN ENPILAMIENTO (ACCESO, NO ALMACENAMIENTO)
		// LAS PILAS Y VECTORES SE ALAMACENAN SUS ELEMENTO POR IGUAL, PERO EL ACCESO
		// CAMBIA

		Stack<String> pila01 = new Stack();

		Vector<String> vector01 = new Vector();

		String persona01 = "Javier Gutierrez | DNI : 384756333";
		String persona02 = "Marcelo Alvarado | DNI : 895757473";
		String persona03 = "Josefina Marce 	 | DNI : 231538593";
		String persona04 = "Ayelen Gutierrez | DNI : 923945023";

		pila01.add(persona01);
		pila01.add(persona02);
		pila01.add(persona03);
		pila01.add(persona04);

		vector01.add(persona01);
		vector01.add(persona02);
		vector01.add(persona03);
		vector01.add(persona04);

		System.out.println("\n== Elementos de la Pila ==");
		System.out.println(pila01.toString());
		System.out.println(pila01.capacity());// capacidad dinamica
		System.out.println(pila01.size());// tamaño
		System.out.println(pila01.firstElement());// primer elemento
		System.out.println(pila01.lastElement());// ultimo elemento
		System.out.println(pila01.peek());// ultimo elemento(primer elemento apilado)
		System.out.println(pila01.remove(0));// sacamos un elemento
		System.out.println(pila01.pop());// sacamos el ultimo elemento(primero apilado)
		System.out.println(pila01.push(persona01));// Agregamos un elemento
		pila01.addElement(persona01);
		System.out.println(pila01.lastIndexOf(persona01));// Indice del objeto

		System.out.println("\n== Elementos del Vector ==");

		System.out.println(vector01.toString());
		System.out.println(vector01.capacity());// capacidad dinamica
		System.out.println(vector01.size());// tamaño
		System.out.println(vector01.firstElement());// primer elemento
		System.out.println(vector01.lastElement());// ultimo elemento
		// System.out.println(vector01.peek());//ultimo elemento(primer elemento
		// apilado)
		System.out.println(vector01.remove(0));// sacamos un elemento
		// System.out.println(vector01.pop());//sacamos el ultimo elemento
		// System.out.println(vector01.push(persona01));//Agregamos un elemento
		vector01.addElement(persona01);// Agregamos un elemento
		System.out.println(vector01.lastIndexOf(persona01));// Indice del objeto

		// LA PREGUNTA ES PORQUE ES QUE LAS PILAS TIENES MÁS CANTIDAD DE MÉTODOS
		// QUE EL VECTOR?? PORQUE LA CLASE STACK HEREDA DE VECTOR, ADEMÁS DE LOS
		// METODOS DE LA CLASE VECTOR SE DESARROLLARON LOS PROPIOS

	}

}
