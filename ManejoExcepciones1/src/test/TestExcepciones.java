package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
            try{
                    resultado = division(10, 0);
                }catch(OperacionExcepcion e){
                    System.out.println("Ocurrio un error en el tipo Opeacion");
                    System.out.println(e.getMessage());
                } catch(Exception e){
                    System.out.println("Ocurrió un error: ");
                     e.printStackTrace(System.out);
                    System.out.println(e.getLocalizedMessage());
                } 
            finally{
                System.out.println("Se reviso la division entre cero");
            }
        System.out.println("resultado = " + resultado);
    }
}