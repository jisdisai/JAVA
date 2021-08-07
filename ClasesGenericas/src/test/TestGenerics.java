package test;

import generico.ClasesGenerica;


public class TestGenerics {
    public static void main(String[] args) {
        ClasesGenerica<Integer> objetoInt = new ClasesGenerica(15);
        objetoInt.obtenerTipo();
        
        ClasesGenerica<String> objectoString = new ClasesGenerica("Juan");
        objectoString.obtenerTipo();
    }
}
