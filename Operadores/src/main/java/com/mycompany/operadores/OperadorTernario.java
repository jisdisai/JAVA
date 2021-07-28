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
public class OperadorTernario {
    public static void main(String[] args) {

        int numero = 10;

        String resultado = (numero % 2 == 0) ? "Es numero par" : "Es numero impar";
        System.out.println("resultado = " + resultado);
        
        // operador ternario es una simplificacion de if else
        // Tipo resultado (expresion) ? true:false;

        boolean par = (numero % 2 == 0) ? true : false;
        if(par)
            System.out.println("numero par");
        else
            System.out.println("numero impar");
    }
    
}
