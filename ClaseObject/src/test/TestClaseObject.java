package test;

import domain.Empleado;

public class TestClaseObject {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Juan", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);

        if (empleado1 == empleado2) {
            System.out.println("Tienen la Misma referencia en la memoria");
        } else {
            System.out.println("Tiene distinta referencia en memoria");
        }
        if (empleado1.equals(empleado2)) {
            System.out.println("Los Objtos son iguales en contenido");
        } else {
            System.out.println("Los Objetoas son distintos contenido");
        }

        if (empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("el valor hashcode es igual");
        } else {
            System.out.println("el valor de hashcode es disitinto");
        }
    }

}
