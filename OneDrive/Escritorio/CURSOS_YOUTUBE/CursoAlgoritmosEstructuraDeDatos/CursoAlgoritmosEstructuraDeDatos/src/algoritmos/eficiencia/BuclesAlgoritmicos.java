package algoritmos.eficiencia;

public class BuclesAlgoritmicos {

    public static void main(String[] args) {

        int valorMultiplicacion = 100;

        
        
        for (int variableDeControl01 = 1; variableDeControl01 < valorMultiplicacion;) {

            System.out.println("Bucle Algoritmico de Multiplicacion..");

            variableDeControl01 *= 2;

        }

        System.out.println("---------------------------------------------------------------------------");

        int valorDivision =1;
        
        for (int variableDeControl02 = 100; variableDeControl02 >= valorDivision;) {

            System.out.println("Bucle Algoritmico de Division..");

            variableDeControl02 /= 2;

        }

    }

}
