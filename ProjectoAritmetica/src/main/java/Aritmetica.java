/**
 *
 * @author ISAI
 */
public class Aritmetica {
    
    // Atributos de la Clase
    int a;
    int b;
    
    // Construtor vacio 
    public Aritmetica(){
//        a=3;
//        b=5;
        System.out.println("Ejecutando Construtor vacio");
    
    }
    
    public Aritmetica(int arg1, int arg2){
    
        a= arg1;
        b=arg2;
        System.out.println("Ejecutando cosntrutor con dos argumentos");
    }
    
    public int sumar(){
    
        int resultado = a + b ;  // se utilizan los atributos de la clase 
        return resultado;
    
    }
    
    
}
