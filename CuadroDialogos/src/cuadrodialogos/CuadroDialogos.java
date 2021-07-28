/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrodialogos;

import javax.swing.JOptionPane;

/**
 *
 * @author ISAI
 */
public class CuadroDialogos {

    
    public static void main(String[] args) {
        
        String cadena ;
        int entero ;
        char letra ;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Digite su Cadena:  ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite su Numero Entero:  "));
        letra = JOptionPane.showInputDialog("Digite su Carater:  ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un Decimal:    "));
        
        JOptionPane.showMessageDialog(null,"La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null,"El Numero es: "+entero);
        JOptionPane.showMessageDialog(null,"El Caracter es: "+letra);
        JOptionPane.showMessageDialog(null,"El Decimal es: "+decimal);
    }
    
}
