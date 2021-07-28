package paquete1;

import paquete1.ClaseHija;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
       // Clase1 clase1 = new Clase1();
//        System.out.println("clase1 = " + clase1.atributoPublico);
//        clase1.metodoPublico();
        
//        ClaseHija claseHija = new ClaseHija();
//        System.out.println("claseHija = " + claseHija);

        Clase1 clase1 = new Clase1();
        clase1.atributoDefault = "Cambios desde la prueba";
        System.out.println("clase1 atributo Default = " + clase1.atributoDefault);
        clase1.metodoDefault();
    }
}
