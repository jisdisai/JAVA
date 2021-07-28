/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringoperations;

/**
 *
 * @author ISAI
 */
public class StringOperations {

    
    public static void main(String[] args) {
        
        String str1 = "Hello";
        String str2 = "Duke";
        //Crea una nueva cadena por concatenacion 
        String str3 = " Yo Soy " + str2;
        // muestra la beinvenida en la pantalla 
        System.out.println("Bienvenido " + str3);
        // muestra la longitud de una nueva cadena 
        System.out.println("Length" + str1.length());
        //muestra una subcadena de str1 que comienza con el caracter 0 pero sin incluir el caracter 5
        System.out.println("Sub: " + str3.substring(0,5));
        // mostrar un valor de cadena en mayuscula 
        System.out.println("Upper: " + str2.toUpperCase());
        // compara las dos cadenas para ver si son iguales identifica que valor viene primero 
        System.out.println(str1.compareTo(str2));
        // compara dos cadenas para ver si son iguales 
        System.out.println(str1.equals(str2));
        
        
    }
    
}
