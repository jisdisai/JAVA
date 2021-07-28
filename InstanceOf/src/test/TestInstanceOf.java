package test;

import domain.Empleado;
import domain.Gerente;

public class TestInstanceOf {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
//        determinarTipo(empleado);

        empleado = new Gerente("Karla", 10000, "contabilidad");
        determinarTipo(empleado);

    }

    /* Se debe de preguntar de las clases mas especifico a menos especifico */
    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println("Es de Tipo Gerente");
            Gerente gerente = (Gerente) empleado; // conversion Manual 
            System.out.println("gerente = " + gerente.getDepartamento());
            ((Gerente) empleado).getDepartamento(); // conversion del IDE
        } else if (empleado instanceof Empleado) {
            System.out.println("Es de Tipo Empleado");
//            Gerente gerente = (Gerente)empleado; // conversion Manual 
//            System.out.println("gerente = " + gerente.getDepartamento());
            System.out.println("empleado = " + empleado.getNombre());
        } else if (empleado instanceof Object) {
            System.out.println("Es de Tipo Object");
            empleado.toString();
        }
    }

}
