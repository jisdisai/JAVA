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
public class OperadorCondicional {
    
    public static void main(String[] args) {
        
        // && operador AND
        // || operador OR
        
        int a = 15;
        int valorMinimo = 0, valorMaximo=10;
        boolean resultado = a >= valorMinimo && a <= valorMaximo;
        System.out.println("resultado = " + resultado);
        
        boolean vacaciones = false;
        boolean diaDescanso = true;
        if(vacaciones || diaDescanso)
            System.out.println("Padre puede asistir al juego del hijo");
        else
            System.out.println("Padre ocupado");
                
        
    }
   
    
}


