package PalabraFinal;
/**
 *
 * @author ISAI
 */
public class EjemploPalabraFinal {
    public static void main(String[] args) {
        // Modificar un atributo marcado como final cuando se asigna un valor no es posible modificarlo 
        //ClaseFinal.VAR_PRIMITIVO = 20;
        
        //Modificar la Referencia de un atributo tipo object
        //ClaseFinal.VAR_PERSONA = new Persona();
        
        ClaseFinal.VAR_PERSONA.setNombre("Ezequiel");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
        
        ClaseFinal.VAR_PERSONA.setNombre("Manuel");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
    }
    
}
