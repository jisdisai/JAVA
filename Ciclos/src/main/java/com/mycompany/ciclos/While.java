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
public class While {

    public static void main(String[] args) {

        int contador = 0;

//        while ( contador < 3) {
//            System.out.println("contador = " + contador);
//            contador++;
//        }
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador < 3);
    }

}
