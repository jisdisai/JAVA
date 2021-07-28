package test;

/**
 *
 * @author Salgado
 */
public class TestArgumentoVariable {

    public static void main(String[] args) {
        imprimirNumero(3, 4, 5);
        imprimirNumero(1, 2);

    }

    private static void imprimirNumero(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Elementos: " + numeros[1]);

        }// fin del for 

    }// fin del metodo imprimirNumero
}// fin del main

