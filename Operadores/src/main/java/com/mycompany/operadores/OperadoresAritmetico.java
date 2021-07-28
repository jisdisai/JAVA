/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.operadores;

/**
 *
 * @author ISAI
 */
public class OperadoresAritmetico {
    
     public static void main(String[] args) {

        int a = 3, b = 2;

        int resultado = a + b;
        System.out.println("resultado suma = " + resultado);

        System.out.println("resultado suma=" + (a  + b) );
        
        resultado = a - b;
        System.out.println("resultado resta = " + resultado);
        
        System.out.println("resultado resta = " + (a - b));
        
        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);
        
        double resultado2 = 3D / b;
        System.out.println("resultado division = " + resultado2);
        
        resultado = a % b;
        System.out.println("resultado modulo= " + resultado);
        
        resultado = a % 2;
        System.out.println("resultado = " + resultado);
        
        resultado = 123 % 2;
        System.out.println("resultado = " + resultado);
        
        if(resultado == 0)
            System.out.println("es numero par");
        else
            System.out.println("es numero impar");
    }
    
}
