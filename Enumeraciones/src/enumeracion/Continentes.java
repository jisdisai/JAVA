package enumeracion;

/**
 *
 * @author Salgado
 */
public enum Continentes {
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);

    private int paises;

    Continentes(int paises) {
        this.paises = paises;
    }// fin del construtor

    public int getPaises() {

        return this.paises;

    }// fin del get

}// FIN DE CONTINENTE
