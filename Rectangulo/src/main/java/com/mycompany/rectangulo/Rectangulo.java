/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rectangulo;

import java.util.Scanner;

/**
 *
 * @author ISAI
 */
public class Rectangulo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Escribe tu solucion aqui
        System.out.println("Proporciona el alto:");
        int alto = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el ancho:");
        int ancho = Integer.parseInt(scanner.nextLine());
        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
    
}
