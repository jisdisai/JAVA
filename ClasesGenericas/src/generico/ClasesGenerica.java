package generico;

/**
 *
 * @author Salgado
 */
public class ClasesGenerica<T> {
        private T objeto;
        
        public ClasesGenerica(T objeto){
            this.objeto = objeto;
        }
        
        public void obtenerTipo(){
            System.out.println("El Tipo T es: " + objeto.getClass().getSimpleName());
        }
    
}
