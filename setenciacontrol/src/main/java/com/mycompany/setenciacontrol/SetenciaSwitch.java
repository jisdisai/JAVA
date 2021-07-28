/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.setenciacontrol;

/**
 *
 * @author ISAI
 */
public class SetenciaSwitch {
    
      public static void main(String[] args) {

      int numero = 1;
      String numeroTexto = "numero desconocido";
      
      switch(numero){
          case 1:
              numeroTexto = "numero uno";
              break;
          case 2:
              numeroTexto = "numero dos";
              break;
          case 3:
              numeroTexto = "numero tres";
              break;
          default:
              numeroTexto = "numero desconocido";
      }
      
        System.out.println("numero texto:" + numeroTexto + " para el numero proporcionado:" + numero );
    }
    
}
