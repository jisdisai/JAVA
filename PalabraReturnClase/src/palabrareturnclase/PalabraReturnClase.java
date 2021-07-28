package palabrareturnclase;

/**
 *
 * @author ISAI
 */
public class PalabraReturnClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Suma s = crearObjetoSuma();
        
        int resultado= s.a + s.b ;
        
        System.out.println("el resultado es: " + resultado);
    }
    
    public static Suma crearObjetoSuma(){
        int a;
        int b;
       Suma s = new Suma(a = 3, b=4);
       return s;
    
    }
}

class Suma {

   int a;
   int b;

    public Suma(int a, int b) {
        this.a = a;
        this.b = b;
    }



}
