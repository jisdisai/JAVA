package test;

/**
 *
 * @author Salgado
 */
public class TestAutoboxingUnboxing {
    
    public static void main(String[] args) {
        
        /*
            Clases Envolventes de Tipo Primitivo
            int ---> Integer
            long --> Long
            float -> Float
            double -> Double
            boolean -> Boolean
            byte ----> Byte
            char ----> Character
            short ---> Short
        
        */
        
        Integer entero = 10;// AutoBoxing
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.toString());
        System.out.println("entero = " + entero.doubleValue());
         
        int entero2 = entero; //UnBoxing
        System.out.println("entero2 = " + entero2);
    }
    
}
