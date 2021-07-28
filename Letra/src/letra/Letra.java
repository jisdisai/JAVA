/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letra;

import javax.swing.JOptionPane;

/**
 *
 * @author ISAI
 */
public class Letra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letra ;
        
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        
        if(Character.isUpperCase(letra)){
        JOptionPane.showMessageDialog(null,"Es una Letra Mayuscula");
        }else{
        
            JOptionPane.showMessageDialog(null,"Es una Letra minuscula");
        
        }
    }
    
}
