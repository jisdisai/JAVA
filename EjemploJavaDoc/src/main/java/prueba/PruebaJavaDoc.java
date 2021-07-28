/*
* Derechos reservados Isai Salgado
*/
package prueba;

import com.mycompany.ejemplojavadoc.Aritmetica;

/**
 *clase para probar el concepto de Java Doc 
 * @author ISAI Salagado
 * @version 1.0
 */
public class PruebaJavaDoc {
    
    /**
     * Metodo que ejecuta la prueba d ela clase Aritmetica 
     * @param args es un arreglo de tipo String 
     */
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica(3,2);
        int resultado = aritmetica1.sumar();
        System.out.println("resultado = " + resultado);
        
        
    }
}
