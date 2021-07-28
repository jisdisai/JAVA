package com.mycompany.pseudoaleatorioscongruencial;

import java.util.Scanner;

/**
 *
 * @author ISAI
 */
public class pseudoaleatorio {
    
    public static void main(final String[] args) {

    final Scanner entrada = new Scanner(System.in); 
    int a, c, xN, m; 
    int i, numero;  
    float numero2;  
    System.out.println("Congruencial");
    System.out.println("-------------------");
    //("Xn+1=[a*Xn + c] mod m");

    System.out.print("Escriba una semilla(Xn): ");
    xN = entrada.nextInt();
    System.out.print("Escriba una constante multiplicativa(a): ");
    a= entrada.nextInt();
    System.out.print("Escriba una constante aditiva(c): ");
    c=entrada.nextInt();
    System.out.print("Escriba el modulo(m): ");
    m = entrada.nextInt();

    System.out.println("----------------------------------------------------");
    System.out.println("n       Xn      Xn+1      Pseudonumeros Generados  |");
    System.out.println("----------------------------------------------------");

    
    for (i=0; i<=30; i++){
        numero = (a*xN+c) % m;   
        numero2 = (float)numero / (float)(m);
        System.out.printf("%d       %d        %d            %.3f\n", i ,xN,numero,numero2); 

        xN = numero;  
    }

  }
    
}
