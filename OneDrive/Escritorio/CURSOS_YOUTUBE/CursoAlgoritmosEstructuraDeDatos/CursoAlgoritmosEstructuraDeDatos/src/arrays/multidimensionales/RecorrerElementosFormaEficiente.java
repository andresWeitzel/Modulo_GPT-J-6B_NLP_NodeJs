package arrays.multidimensionales;

public class RecorrerElementosFormaEficiente {
	public static void main(String[] args) {
		
		// 2x2x2 [n°vector][n°filas][n°columnas]
		double arrayNumerosDecimales[][][] =
			{ {{0.4 , 1.22},{3.88 , 3.46}}, {{4.77 , 6.99},{3.4 , 1.43}} };
		
		
		
		
		for (int i=0; i<2; i++) {//n° filas
			
			System.out.println("--------------------------------");
			
			System.out.println("\n== Fila N° "+i+" ==");
			
			for (int j=0; j<2; j++) {//n°columna
			
				System.out.println("\n-- Columna N° "+j+" --");
				
				for (int k=0; k<2; k++) {//n°vector
					
					System.out.print("\n- Vector N° "+k+" : ");
					
					System.out.println(arrayNumerosDecimales[i][j][k]);
					
				}
				
			}
			
		}
		
	}

}
