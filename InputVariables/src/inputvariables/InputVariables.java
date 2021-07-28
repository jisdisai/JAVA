package inputvariables;

import java.util.Scanner;

/**
 *
 * @author ISAI
 */
public class InputVariables {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean boolVal;
        byte byteVal;
        char charVal;
        short shortVal;
        int intVal;
        long longVal;
        float floatVal;
        double doubleVal;

        System.out.println("Introduzca un valor booleano: ");
        boolVal = in.nextBoolean();

        System.out.println("Introduzca un valor byte: ");
        byteVal = in.nextByte();

        System.out.println("Introduzca un valor char: ");
        charVal = in.next().charAt(0);

        System.out.println("Introduzca un valor short: ");
        shortVal = in.nextShort();

        System.out.println("Introduzca un valor int: ");
        intVal = in.nextInt();

        System.out.println("Introduzca un valor log: ");
        longVal = in.nextLong();

        System.out.println("Introduzca un valor float: ");
        floatVal = in.nextFloat();

        System.out.println("Introduzca un valor double: ");
        doubleVal = in.nextDouble();

        System.out.println("boolean value: " + boolVal);
        System.out.println("byte value : " + byteVal);
        System.out.println("char value : " + charVal);
        System.out.println("short value : " + shortVal);
        System.out.println("int value : " + intVal);
        System.out.println("long value : " + longVal);
        System.out.println("double value : " + floatVal);
        System.out.println("double value : " + doubleVal);

    }// fin del metodo main

}// fin de la clase
