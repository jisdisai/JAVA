package matrices;

/**
 *
 * @author ISAI
 */
public class EjemploMatricesPrueba {
    
    public static void main(String[] args) {
        // Declarar unamatriz de tipo int 
        int edades[][];
        //Instanciar una matriz
        edades = new int[3][2];
        // Instaciar los valores de la matriz
        edades[0][0] = 30 ;
        edades[0][1] = 15 ;
        edades[1][0] = 20 ;
        edades[1][1] = 45 ;
        edades[2][0] = 5 ;
        edades[2][1] = 38 ;
        
        //System.out.println("Matriz enetero 0 0 : " + edades[0][0] );
        //System.out.println("Matriz enetero 0 1 : " + edades[0][1] );
        System.out.println("Matriz enetero 1 0 : " + edades[1][0] );
        System.out.println("Matriz enetero 1 1 : " + edades[1][1] );
        System.out.println("Matriz enetero 2 0 : " + edades[2][0] );
        System.out.println("Matriz enetero 2 1 : " + edades[2][1] );
        
         //1. declara e instanciar una matriz de objetos de tipo persona
        Persona personas[][] = new Persona[1][2];
        
        //2.inicializamos valores
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        
        //3.imprimimos valores
        System.out.println("Matriz persona indice 0 0:" + personas[0][0]);
        System.out.println("Matriz personas indice 0 1:" + personas[0][1]);
        
        for(int renglon = 0; renglon < personas.length; renglon++){
            for(int columna = 0; columna < personas[renglon].length; columna++){
                System.out.println("Matriz personas indice:" + renglon + " - " + columna + ": " + personas[renglon][columna]);
            }
        }
    }
        
    }
    

