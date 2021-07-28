/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporvalor;

/**
 *
 * @author ISAI
 */
public class PasoPorValor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int x = 10;
        imprimir (x);
        System.out.println("x= "+ x);
        cambiarValor(x);
        imprimir(x);
        
        
    }
    
    
    public static void imprimir (int arg){
    
        System.out.println("arg= "+ arg);
    
    }
    
    public static  void  cambiarValor(int i){
            
        i= 200;
        
    
    }
}
