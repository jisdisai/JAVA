/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contextostatico;

/**
 *
 * @author ISAI
 */
public class ContextoStatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona ("Juan");
        System.out.println(persona1);
        
        Persona persona2 = new Persona ("Karla");
        System.out.println(persona2);
        
        System.out.println("contadorPersona: " + Persona.getContadorPersonas());
    }
    
}

class Persona {

    private int idPersona;
    private String nombre ;
    private static int contadorPersonas;
    
    public Persona(String nombre){

    //contadorPersonas++ ;
    this.idPersona = contadorPersonas++;
    this.nombre = nombre;


}

    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }

    @Override
    public String toString() {
        return  "idPersona= " + idPersona + ", nombre= " + nombre ;
    }
    


}
