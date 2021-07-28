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
public class OperadoresIgualda {
    
    public static void main(String[] args) {
        
       int a=3, b=4;
       
       boolean c = (a == b);
        System.out.println("c = " + c);
        
        c = (a != b);
        System.out.println("c = " + c);
        
        // se usa la palabra equals cuando son objetos o cadenas 
        String cadena = "hola";
        String cadena2 = "hola";
        System.out.println( cadena.equals(cadena2) );
        
        boolean d = a <= b;
        System.out.println("d = " + d);
        
        if( b % 2 == 0){
            System.out.println("numero par");
        }
        else{
            System.out.println("numero impar");
        }
        
        int edad = 31;
        int adulto = 18;
        if ( edad >= adulto)
            System.out.println("es un adulto");
        else
            System.out.println("es menor de edad");
        
    }
    
}
