
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ISAI
 */
public class ConversionTipoPrimitivo {
    
     public static void main(String[] args) {

        //convertir un String a un tipo int 
        int edad = Integer.parseInt("20");
        System.out.println("edad = " + edad);
        
        double valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        char c = "hola".charAt(3);
        System.out.println("c = " + c);
        
        Scanner scanner = new Scanner(System.in);
        edad = Integer.parseInt(scanner.nextLine()) ;
        System.out.println("edad = " + edad);
        
        char caracter = scanner.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
        String edadTexto = String.valueOf(false);
        System.out.println("edadTexto = " + edadTexto);
        
        short s = 129;
        byte b = (byte) s;
        System.out.println("b = " + b);
    }
    
}
