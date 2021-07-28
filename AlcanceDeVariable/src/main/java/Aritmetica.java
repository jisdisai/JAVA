/**
 *
 * @author ISAI
 */
public class Aritmetica {
    
    // Variables de una Clase
    int a ;
    int b ;
    
    public Aritmetica(){
    
        System.out.println("Ejecutando Construtor Vacio");
    }
    
    public Aritmetica(int a,int b){
    
        this.a = a;
        this.b = b;
        
        System.out.println("Ejecutando Construtor con Dos Parametros");
        
    }
    
    public  int sumar(){
    
    return this.a + this.b;
    
    }
    
    public  int restar(){
    
    return this.a - this.b;
    
    }
    
    public  int multiplicar(){
    
    return this.a * this.b;
    
    }
    
    public  int dividir(){
    
    return this.a / this.b;
    
    }
    
}

