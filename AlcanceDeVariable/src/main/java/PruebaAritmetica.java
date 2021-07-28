/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ISAI
 */
public class PruebaAritmetica {

    public static void main(String[] args) {

        // Variables Locales
        int operandoA = 6;
        int operandoB = 2;

        // Creamos un Objeto de la clase Aritmetica enviando argumentos 
        Aritmetica objeto1 = new Aritmetica(operandoA, operandoB);

        // Imprimir los valores de los operandos 
        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);

        //Imprimir Resultados 
        System.out.println("\n El Resultado Suma : " + objeto1.sumar());
        System.out.println("\n El Resultado Resta : " + objeto1.restar());
        System.out.println("\n El Resultado Multiplicacion : " + objeto1.multiplicar());
        System.out.println("\n El Resultado Division : " + objeto1.dividir());
        System.out.println("\n");

    }

}
