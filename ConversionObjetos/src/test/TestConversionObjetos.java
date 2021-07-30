package test;

import domain.*;

/**
 *
 * @author Salgado
 */
public class TestConversionObjetos {

    public static void main(String[] args) {

        Empleado empleado;

        empleado = new Escritor("Juan ", 5000, TipoEscritura.CLASICO);
        //System.out.println("empleado = " + empleado);
        //System.out.println(empleado.obtenerDetalles());
        
        //dowcasting si es necesario hacer conversion implicita
       // ((Escritor)empleado).getTipoEscritura();
       Escritor escritor = (Escritor)empleado;
       escritor.getTipoEscritura();
       
       Empleado empleado2 = escritor; // upcasting no es necesario hacer conversion implicita
        System.out.println(empleado2.obtenerDetalles());
       //empleado2.obtenerDetalles();
       
        
    }

}
