package test;

import domain.*;

/**
 *
 * @author Salgado
 */
public class TestClasesAbstractas {

    public static void main(String[] args) {
        //FiguraGeometrica figura = new FiguraGeometrica();

        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
    }

}
