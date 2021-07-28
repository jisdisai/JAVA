package test;

import enumeracion.Continentes;
import enumeracion.Dias;

/**
 *
 * @author Salgado
 */
public class TestEnumeraciones {

    public static void main(String[] args) {
       // System.out.println("Dia 1: " + Dias.LUNES);
//        indicarDiaSemana(Dias.MARTES);

        System.out.println("Continentes no.4: " + Continentes.AMERICA);
        System.out.println("No. Paises en el 4to continente " +
                 Continentes.AMERICA.getPaises());
        
    }//fin del main
    
    private static void indicarDiaSemana(Dias dias) {

        switch (dias) {

            case LUNES:
                System.out.println("Primer Dia de la Semana ");
                break;

            case MARTES:
                System.out.println("Segundo Dia de la Semana ");
                break;
            case MIERCOLES:
                System.out.println("tercer Dia de la Semana ");
                break;
            case JUEVES:
                System.out.println("cuarto Dia de la Semana ");
                break;
            case VIERNES:
                System.out.println("quinto Dia de la Semana ");
                break;
            case SABADO:
                System.out.println("sexto Dia de la Semana ");
                break;
            case DOMINGO:
                System.out.println("septimo Dia de la Semana ");
                break;
            /*default : 
                System.out.println("Dia de la Semana Invallida");
                break;
                */ // no es necesario


        }// fin switch

    }// fin indicarDiaSemana

}// fin de la clase 
