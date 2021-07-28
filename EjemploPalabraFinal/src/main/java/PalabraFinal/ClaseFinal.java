package PalabraFinal;

/**
 *
 * @author ISAI
 */
public class ClaseFinal {

    // variables marcadas como final
    public final int varNumero = 0;

    // constante en java
    public static final int VAR_PRIMITIVO = 15;

    public static final Persona VAR_PERSONA = new Persona();

    //Metodo Final
    public final void metodoFinal() {

    }

}

// noes posible crear clase hijas en una clase final
class claseHija extends ClaseFinal {

    //Sobre escritura de un metodo padre marcado como final 
   //public void metodoFinal(){}
}
