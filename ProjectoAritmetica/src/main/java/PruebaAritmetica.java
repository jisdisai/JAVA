/**
 *
 * @author ISAI
 */
public class PruebaAritmetica {
    
    public static void main(String[] args) {
        
        // crear un objeto tipo aritmetica
        Aritmetica  aritmetica = new Aritmetica();
        
        aritmetica.a=10;
        aritmetica.b=2;
        
        int resultado = aritmetica.sumar();
        
        System.out.println("resultado = " + resultado);
        
        // Creacion de un segundo Objeto
        
        Aritmetica aritmetica2 = new Aritmetica(4,2);
        System.out.println("aritmetica2 = " + aritmetica2.sumar());  
    }  
}
