/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author ISAI
 */
public class Encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Persona persona1 = new Persona("Juan","Barbosa",true);
        
        System.out.println(persona1.getNombre());
        persona1.setNombre("carlos");
        System.out.println(persona1.getNombre());
        System.out.println(persona1);
        
        
    }
    
}
