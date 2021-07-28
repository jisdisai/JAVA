/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplo;

import javax.swing.JOptionPane;

/**
 *
 * @author ISAI
 */
public class Multiplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero "));
        
        if(numero%10 == 0){
          JOptionPane.showMessageDialog(null,"El Numero" + numero + "El numero es multiplo de 10");
        }else 
            JOptionPane.showMessageDialog(null,"El numero no es multiplo de 10");
    }
    
}
