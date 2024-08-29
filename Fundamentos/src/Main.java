/*
 * Comentarios
 * Multi-Línea
 */

// Comentario Línea-Simple

/* Convenciones 'naming'
 * UpperCamelCase
 * lowerCamelCase
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // System.out.println("¡Hola, Mundo!");

        // Interacción
        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.print("Ingrese un valor: ");
         * String valorIngresado = scanner.nextLine();
         * scanner.close();
         * System.out.println("valorIngresado: " + valorIngresado);
         */

        // Variables
        // Constantes
        // Tipos de dato primitivos
        /*
         * final byte numByte = 127;
         * final short numShort = 32767;
         * final int numInt = 2147483647;
         * final long numLong = 9223372036854775807l;
         * final float numFlotante = 0.1234567f;
         * final double numDouble = 0.123456789012345d;
         * final boolean booleano = true;
         * final char caracter = 'a';
         * System.out.println("numByte: " + numByte);
         * System.out.println("numShort: " + numShort);
         * System.out.println("numInt: " + numInt);
         * System.out.println("numLong: " + numLong);
         * System.out.println("numFlotante: " + numFlotante);
         * System.out.println("numDouble:" + numDouble);
         * System.out.println("booleano: " + booleano);
         * System.out.println("caracter: " + caracter);
         */

        // Inferencia
        /*
         * var miNumeroEntero = 10;
         * System.out.println("miNumeroEntero: " + miNumeroEntero);
         */

        // Ámbito
        /*
         * int diez = 10;
         * System.out.println("diez: " + diez);
         */

        // Métodos
        /*
         * imprimirHola();
         * imprimirNumero(10);
         * imprimirNumero(10.5f);
         *
         * int retornado = obtenerNumero();
         * System.out.println("retornado: " + retornado);
         */

        // Tipos de dato no primitivos
        // String
        String cadenaDeTexto = "abcd";
        System.out.println("cadenaDeTexto: " + cadenaDeTexto);
        System.out.println(cadenaDeTexto.length());
        System.out.println(cadenaDeTexto.toUpperCase());
        System.out.println(cadenaDeTexto.toLowerCase());
    }

    private static void imprimirHola() {
        System.out.println("¡Hola!");
    }

    private static int obtenerNumero() {
        return 10;
    }

    private static void imprimirNumero(int numero) {
        System.out.println("imprimiendo número int: " + numero);
    }

    private static void imprimirNumero(float numero) {
        System.out.println("imprimiendo número float: " + numero);
    }
}
