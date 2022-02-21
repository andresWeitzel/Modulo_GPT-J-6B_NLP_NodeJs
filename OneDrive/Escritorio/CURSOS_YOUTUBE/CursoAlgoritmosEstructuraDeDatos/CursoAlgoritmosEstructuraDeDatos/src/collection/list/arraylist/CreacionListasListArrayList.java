package collection.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CreacionListasListArrayList {
public static void main(String[] args) {
	
	//UNA LISTA Es una estructura de datos lineal donde los elementos no se almacenan en 
	//ubicaciones contiguas y cada elemento es un objeto separado con una parte
	//de datos y una parte de dirección. Los elementos se vinculan mediante punteros 
	//y direcciones. Cada elemento se conoce como nodo. Debido a la dinámica y 
	//facilidad de inserciones y eliminaciones, se prefieren sobre las matrices. 
	
	//Podemos usar listas de la Interfaz List o Listas de la clase ArrayList
	//Las listas más rápidas son la de la Interfaz List pero las más eficientes son
	//las de la Clase ArrayList
	
	//Antiguamente solo estaba la Clase List, despues se convirtio en Interfaz y vino 
	//la clase ArrayList, por eso la mezcla estre nombres, llamado polimorfismo
	
	List<Object> lista01 = new ArrayList<Object>();
	
	ArrayList<Object> lista02 = new ArrayList<Object>();
	
	
	String objeto01 = "Pelota de Fútbol";
	String objeto02 = "Pelota de Basquet";
	
	lista01.add(objeto01);
	lista01.add(objeto02);
	
	
	lista02.add(objeto01);
	lista02.add(objeto02);
	
	
	
	System.out.println("\n == Objetos de la Lista de Tipo List ==");
	System.out.println(lista01.toString());
	
	
	System.out.println("\n == Objetos de la Lista de Tipo ArrayList ==");
	System.out.println(lista02.toString());
	
	
}
}
