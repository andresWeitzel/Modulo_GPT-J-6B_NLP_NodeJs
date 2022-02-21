package algoritmos.ordenamiento.arrays.unidimensionales;

//Se tiene un conjunto de Notas y se desea ordenarlas por aprobados 
//y desaprobados en arrays independientes.
//Implementar un algoritmo que realice este ordenamiento sin
//utilizar APIS de Java ni métodos que hagan esto automaticamente

public class OrdenamientoDeNumerosEnteros {

	public static void main(String[] args) {

		int arrayNotas[] = { 8, 7, 5, 8, 10, 5, 4, 7, 4, 3, 4 };

		int arrayAprobados[] = new int[arrayNotas.length];

		int arrayDesaprobados[] = new int[arrayNotas.length];

		// Guardamos las Notas Mayores y Menores a 7 en Arrays Diferentes
		for (int i = 0; i < arrayNotas.length; i++) {

			if (arrayNotas[i] >= 7) {

				arrayAprobados[i] = arrayNotas[i];
			} else if (arrayNotas[i] <= 7) {

				arrayDesaprobados[i] = arrayNotas[i];
			} else {
				return;
			}

		}

		// Podemos Implementar el forEach para guardar las notas menores y mayores

		int indiceNota = 0;

		for (int nota : arrayNotas) {
			
			

			if (nota >= 7) {

				arrayAprobados[indiceNota] = nota;

			} else if (nota <= 7) {

				arrayDesaprobados[indiceNota] = nota;

			} else {
				return;
			}

			// Nos aseguramos de no pasarnos de su longitud
			// Podemos usar el indice de la misma variable del for
			// pero usando nombres largos no es tan evidente el codigo
			if (indiceNota < arrayNotas.length) {

				indiceNota += 1;
			}

		}

		// Recorremos los arrays

		System.out.println("\n--- Array Aprobados ---");

		for (int nota : arrayAprobados) {

			if (nota != 0) {
				System.out.println(nota);
			}

		}

		System.out.println("\n--- Array Desaprobados ---");

		for (int nota : arrayDesaprobados) {

			if (nota != 0) {
				System.out.println(nota);
			}

		}

		// Ordenamos los arrays

		int arrayAprobadosOrdenados[] = new int[arrayAprobados.length];

		// Se puede trabajar sin indices, diretamente con la variable del forEach
		// pero es menos evidente
		int indiceAprobados = 0;

		for (int notaOrdenada : arrayAprobados) {

			// Nos aseguramos de no pasarnos de su longitud
			// Podemos usar el indice de la misma variable del for
			// pero usando nombres largos no es tan evidente el codigo
			if ((indiceAprobados) >= (arrayAprobados.length - 1) ) {

				// Si no esta dentro de la longitud permitida salimos
				return;
			}
			
			else {
				

				// Ej.. (nota indice 0) < (nota indice 1)
				if (notaOrdenada < arrayAprobados[notaOrdenada + 1]) {

					arrayAprobadosOrdenados[indiceAprobados] = notaOrdenada;

				} else if (notaOrdenada > arrayAprobados[notaOrdenada + 1]) {

					// Lo guardamos en el Proximo indice
					// Nos Aseguramos que el proximo indice este dentro de la longitud permitida

					if ((indiceAprobados + 1) <= (arrayAprobados.length - 1)) {

						arrayAprobadosOrdenados[indiceAprobados + 1] = notaOrdenada;

					} else {

						// Legamos al indice maximo salimos
						return;
					}

				} else {

					return;
				}

		
				// Incrementamos el indice
				indiceAprobados += 1;

			}

		}

		
		
		
		// Recorremos los arrays

		System.out.println("\n--- Array Aprobados Ordenados ---");

		for (int nota : arrayAprobadosOrdenados) {

			if (nota != 0) {
				System.out.println(nota);
			}

		}

		int arrayDesaprobadosOrdenados[] = new int[arrayDesaprobados.length];
		int indiceDesaprobados = 0;

	}

}
