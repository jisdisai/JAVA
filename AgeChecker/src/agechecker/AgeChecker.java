package agechecker;

import java.util.Scanner;

/**
 *
 * @author ISAI
 */
public class AgeChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age ;
        
        System.out.println("Por favor Introduzca su edad: ");
        age = in.nextInt();
        
        if(age > 20 )
            System.out.println("Ya eres Adulto");
        else 
            System.out.println("Todavia no eres un adulto");
        
        in.close();
        
    }
    
}
