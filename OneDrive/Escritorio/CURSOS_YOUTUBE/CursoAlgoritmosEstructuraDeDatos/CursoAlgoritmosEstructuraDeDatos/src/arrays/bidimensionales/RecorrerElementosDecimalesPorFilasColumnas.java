package arrays.bidimensionales;

/*
 * Vamos  a crear y recorrer una matriz NO CUADRADA (4X2) de varias formas 
 * posibles
 * 
 * --MATRIZ 4X2--
 * (       
	  	0.0		1.8
	  	3.0		6.0
	  	56.88  	78.32
	  	33.36	66.1
	  			         )
 * 
 * */


public class RecorrerElementosDecimalesPorFilasColumnas {
	
	
public static void main(String[] args) {
		
		double arrayNumeros[][] = { {0,1.8},{3,6},{56.88,78.32},{33.36,66.1}};//4 filas 2 columnas
		
		System.out.println("\n================= Elemento a Elemento Por Fila  ================");
		
		System.out.println("\n----- Filas -------\n");
		
		System.out.println("--- Primera Fila ---");
		System.out.println(arrayNumeros[0][0]);
		System.out.println(arrayNumeros[0][1]);
		
		System.out.println("--- Segunda Fila ---");
		System.out.println(arrayNumeros[1][0]);
		System.out.println(arrayNumeros[1][1]);
		
		System.out.println("--- Tercera Fila ---");
		System.out.println(arrayNumeros[2][0]);
		System.out.println(arrayNumeros[2][1]);
		
		System.out.println("--- Cuarta Fila ---");
		System.out.println(arrayNumeros[3][0]);
		System.out.println(arrayNumeros[3][1]);
		
		
		System.out.println("\n================= Elemento a Elemento Por Columna  ================");
		
		
		System.out.println("\n----- Columnas -------\n");
		
		System.out.println("--- Primera Columna ---");
		System.out.println(arrayNumeros[0][0]);
		System.out.println(arrayNumeros[1][0]);
		System.out.println(arrayNumeros[2][0]);
		System.out.println(arrayNumeros[3][0]);
		
		System.out.println("--- Segunda Columna ---");
		System.out.println(arrayNumeros[0][1]);
		System.out.println(arrayNumeros[1][1]);
		System.out.println(arrayNumeros[2][1]);
		System.out.println(arrayNumeros[3][1]);
		
		
		
		
		
		System.out.println("\n================= Recorrido Elemento a Elemento Por Fila ================");
		
		System.out.println("\n----- Filas -------\n");
		
		int nroFila=0;
		
		System.out.println("--- Fila "+nroFila+"---");
		for(int i=0; i<2 ; i++) {
			
			System.out.println(arrayNumeros[nroFila][i]);
		}
		
		nroFila+=1;
		
		System.out.println("--- Fila "+nroFila+"---");
		for(int j=0; j<2 ; j++) {
			
			System.out.println(arrayNumeros[nroFila][j]);
		}
		
		nroFila+=1;
		
		System.out.println("--- Fila "+nroFila+"---");
		for(int k=0; k<2 ; k++) {
			
			System.out.println(arrayNumeros[nroFila][k]);
		}
		
		nroFila+=1;
		
		System.out.println("--- Fila "+nroFila+"---");
		for(int p=0; p<2 ; p++) {
			
			System.out.println(arrayNumeros[nroFila][p]);
		}
		
		
		
		
		System.out.println("\n================= Recorrido Elemento a Elemento Por Columnas ================");
		

		System.out.println("\n----- Columnas -------\n");
		
		
		int nroColumna=0;
		
		System.out.println("--- Columna "+nroColumna+"---");
		for(int i=0; i<4 ; i++) {
			
			System.out.println(arrayNumeros[i][nroColumna]);
		}
		
		nroColumna+=1;
		

		System.out.println("--- Columna "+nroColumna+"---");
		for(int j=0; j<4 ; j++) {
			
			System.out.println(arrayNumeros[j][nroColumna]);
		}		
		
		
		
		System.out.println("\n======== Recorrido Eficiente Elemento a Elemento por Filas ==========");
		
		System.out.println("\n----- Filas -------\n");
		
		
		for(int i=0; i<4 ; i++) {//filas
			
			
				System.out.println("--- Fila"+i+"---");
				
			
			for(int j=0 ; j<2 ; j++) {//columnas
			
				System.out.println(arrayNumeros[i][j]);
				
			}
		
		}
		
		
		System.out.println("\n======== Recorrido Eficiente Elemento a Elemento por Columnas ==========");
		
		System.out.println("\n----- Columnas -------\n");
		
		
		for(int j=0; j<2 ; j++) {//columnas
			
			
				System.out.println("--- Columna"+j+"---");
				
			
			for(int i=0 ; i<4 ; i++) {//filas
			
				System.out.println(arrayNumeros[i][j]);
				
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}		
}
}
