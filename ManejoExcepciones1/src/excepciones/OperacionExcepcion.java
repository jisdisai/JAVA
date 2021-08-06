package excepciones;

/**
 *
 * @author Salgado
 */
public class OperacionExcepcion extends RuntimeException {

    public OperacionExcepcion(String mensaje) {
        super(mensaje);
    }

}
