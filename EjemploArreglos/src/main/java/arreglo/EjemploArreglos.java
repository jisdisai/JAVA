package arreglo;

/**
 *
 * @author ISAI
 */
public class EjemploArreglos {

    public static void main(String[] args) {

        // Declara una variable de tipo int
        int edades[];

        // instanciamos el arreglo de tipo int 
        edades = new int[3];

        // inizialisar los valores del arreglo 
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;

        // imprimir los valores del arreglo 
        System.out.println("Arreglo entero Indice 0 : " + edades[0]);
        System.out.println("Arreglo entero Indice 1 : " + edades[1]);
        System.out.println("Arreglo entero Indice 2 : " + edades[2]);
        //System.out.println("Arreglo entero Indice 3 : " + edades[3]);

        //Declarar e Instanciar un arreglo de tipos objetos
        Persona personas[] = new Persona[4];
        //Inicializar los valores del Arreglo
        personas[0] = new Persona("Juan");
        personas[2] = new Persona("Karla");

        System.out.println("Arreglo personas 0 : " + personas[0]);
        System.out.println("Arreglo personas 1 : " + personas[1]);
        System.out.println("Arreglo personas 2 : " + personas[2]);
        System.out.println("Arreglo personas 3 : " + personas[3]);
        //System.out.println("Arreglo personas 4 : " + personas[4]);
        
        //Arreglo utilizando notacion simplifcada 
        String nombre[] = {"Sara","Laura","Carlos","Carmen"};
        // Imprimir los elementos de un arreglo
        for(int i=0; i < nombre.length; i++){
        
            System.out.println("Arreglo String indice: " + i + ":" + nombre[i]);
        }
        

    }
}
