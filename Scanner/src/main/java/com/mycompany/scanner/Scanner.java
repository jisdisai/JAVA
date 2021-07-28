package com.mycompany.scanner;

import java.util.Scanner;

public class Scanner {

    public static void main(String[] args) {

         Scanner  scanner = new Scanner (System.in);
        // Escribe tu solucion aqui

        System.out.println("Proporciona el título:");

        String titulo = scanner.nextLine();

        System.out.println("Proporciona el autor:");

        String autor = scanner.nextLine();

        System.out.println(titulo + "fue escrito por" + autor);
    }

}
