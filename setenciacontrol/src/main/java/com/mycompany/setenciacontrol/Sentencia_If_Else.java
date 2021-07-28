package com.mycompany.setenciacontrol;

/**
 *
 * @author ISAI
 */
public class Sentencia_If_Else {
    
    public static void main(String[] args) {

        boolean condicion = false;

        if (condicion) {
            System.out.println("condicion verdadera");
        } else {
            System.out.println("condicion falsa");
        }
        
        int numero = 2;
        String numeroTexto = "numero desconocido";
        
        if( numero == 1 ){
            numeroTexto = "numero uno";
        }
        else if( numero == 2){
            numeroTexto = "numero dos";
        }
        else if( numero == 3){
            numeroTexto = "numero tres";
        }
        else{
            numeroTexto = "valor desconocido";
        }
        System.out.println("numeroTexto = " + numeroTexto);

    }
            
    
    
    
}
