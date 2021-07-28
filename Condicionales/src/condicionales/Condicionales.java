/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author ISAI
 */
public class Condicionales {

   
    public static void main(String[] args) {
        
        int numero, dato=5; 
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un Numero: "));
        
        if(numero != dato){
            
           JOptionPane.showMessageDialog(null,"El numero es 5");
           
        }else {
            
           JOptionPane.showMessageDialog(null, "El numero es diferente de 5");
        
        }
        
    }
    
}
