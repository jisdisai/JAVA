/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ciclos;

/**
 *
 * @author ISAI
 */
public class EtiquetasLabels {
    
    public static void main(String[] args) {
//        inicio:
//        for (int i = 0; i < 3; i++) {
//            //Imprimimos solo numeros pares
//            if (i % 2 == 0) {
//                System.out.println("i = " + i);
//                break inicio;
//            }
//        }
        
        inicio:
        for (int i = 0; i < 3; i++) {
            //Imprimimos solo numeros pares
            if (i % 2 != 0) {
                //break inicio;
                continue inicio;
                
            }
            System.out.println("i = " + i);
        }
        
    }
    
}
    

