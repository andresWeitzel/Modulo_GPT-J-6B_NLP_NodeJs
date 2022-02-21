package arrays.unidimensionales;

/*Se pide agregar la lista de Numeros Telefonicos
 * dentro de un array de tipo String e imprimirlos
en la salida de la consola.

Los números telefónicos son..
	
	34565-2323
	2354-6798
	2343-7890
	+5491145654765
	+5491189769876
	+5545687978484222 */


public class AgregarElementosStrings {
	
	public static void main(String[] args) {
		
		String arrayNumerosTelefonicos[] = {
				"34565-2323",
				"2354-6798",
				"2343-7890",
				"+5491145654765",
				"+5491189769876",
				"+5545687978484222"
		};
		
		for (int i=0 ; i < 6 ; i++ ) {
			System.out.println(arrayNumerosTelefonicos[i]);
		}
		
	}

}
