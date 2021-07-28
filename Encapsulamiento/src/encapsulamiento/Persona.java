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
public class Persona {
   private  String nombre;
   private  String apellido;
   private boolean borrado;
    
    
    // construtor 
    public Persona(String nombre, String apellido, boolean borrado) {
    
     this.nombre= nombre;
     this.apellido = apellido;
     this.borrado = borrado;
    
    }
    
    // construtor vacio
    public  Persona(){}
            
    public String getNombre(){
    
        return this.nombre;
    
    } 
    
    public String setNombre(String nombre){
    
        return this.nombre = nombre ;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
    
    // Estado del objeto 
    
    public String toString(){
        
    return "Nombre: " + nombre + "Apellido: " + apellido + "Borrado: " + borrado  ; 
    
    }
    
}
