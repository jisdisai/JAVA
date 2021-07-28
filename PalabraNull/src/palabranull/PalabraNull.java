package palabranull;

/**
 *
 * @author ISAI
 */
public class PalabraNull {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan");
        System.out.println("persona1 = " + persona1.obtenerNombre());

        Persona persona2 = persona1;
        System.out.println("persona2 = " + persona2.obtenerNombre());

        // hacemos que persona1 ya no apunte al objeto persona
        persona1 = null;// variable candidata para que la elimine el recolector de basura 
        System.gc();//metodo que manda a llamar el colector de basura 
        //System.out.println("persona1 = " + persona1.obtenerNombre());
        persona2 = null;

        if (persona1 != null) {
            System.out.println("persona1 = " + persona1);
        } else {

            System.out.println("la variable persona no apunta a ningun objeto");
        }
    }

}

// clase Persona 
class Persona {

    String nombre;

    Persona(String nombre) {

        this.nombre = nombre;

    }

// Metodo Obtener Nombre 
    public String obtenerNombre() {

        return this.nombre;

    }

}
