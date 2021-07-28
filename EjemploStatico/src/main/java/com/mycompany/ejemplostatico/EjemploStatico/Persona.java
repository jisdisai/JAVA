package com.mycompany.ejemplostatico.EjemploStatico;

public class Persona {

    private int idPersona; // los atributos dinamicos se asocian con el objeto (instancia)
    private String nombre; // los atributos dinamicos se asocian con el objeto (instancia)
    private static int contadorPersona; // los atributos static se asocian con la clase 

    public Persona(String nombre) {

        this.idPersona = ++contadorPersona;
        this.nombre = nombre;

    }

    public int getIdPersona() {
        return idPersona;
    }

//    public void setIdPersona(int idPersona) {
//        this.idPersona = idPersona;
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersona() {
        return contadorPersona;
    }

//    public static void setContadorPersona(int contadorPersona) {
//        Persona.contadorPersona = contadorPersona;
//    }
//    

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    

}
