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
public class OperacionAsignacion {
    
    public static void main(String[] args) {

        int a = 3, b = 2;

        int c = a + 5 - b;
        System.out.println("c = " + c);

        a += 1;//a=a+1
        System.out.println("a = " + a);
        
        a += 3;//a=a+3
        System.out.println("a = " + a);
        
        b -= 1;//b=b-1
        System.out.println("b = " + b);
        
        // *=, /=, %= 
    }
    
}
