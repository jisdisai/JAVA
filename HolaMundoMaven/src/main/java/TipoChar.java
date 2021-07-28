/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ISAI
 */
public class TipoChar {
    
     public static void main(String[] args) {

        System.out.println("bits tipo char:" + Character.SIZE);
        System.out.println("bytes tipo char:" + Character.BYTES);
        System.out.println("valor minimo tipo char:" + Character.MIN_VALUE);
        System.out.println("valor maximo tipo char:" + Character.MAX_VALUE);
        
       char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
      
    }
    
    
}
