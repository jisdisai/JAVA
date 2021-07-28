/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scanner1;

public class Scanner {

    public static void main(String[] args) {

         java.util.Scanner  scanner = new java.util.Scanner (System.in);
        // Escribe tu solucion aqui

        System.out.println("Proporciona el título:  " +"");

        String titulo = scanner.nextLine();

        System.out.println("Proporciona el autor:  " +"");

        String autor = scanner.nextLine();

        System.out.println(titulo  + " fue escrito por " + autor);
    }


    
}
