/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrareturn;

/**
 *
 * @author ISAI
 */
public class PalabraReturn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int b;

        int resultado = sumar(a = 3, b = 6);

        System.out.println("resultado : " + resultado);

    }

    public static int sumar(int a, int b) {

        return a + b;

    }

}
