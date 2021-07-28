
public class Concatenacion {
    
    public static void main(String[] args) {
        
    
        
    
        String usuario = "Juan";
        String saludar = "Hola";

        System.out.println(saludar + " " + usuario);

        int i = 3;
        int j = 5;
        System.out.println(i + j);
        
        System.out.println(saludar + i + j);// primero encuentra cadena, por lo tanto lo restante lo concatena
        
        System.out.println(i + j + saludar);// primero encuentra numeros, por lo tanto primero suma y despues concatena
  }

}