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
        /*
         * String cadenaDeTexto = "abcd";
         * System.out.println("cadenaDeTexto: " + cadenaDeTexto);
         * System.out.println(cadenaDeTexto.length());
         * System.out.println(cadenaDeTexto.toUpperCase());
         * System.out.println(cadenaDeTexto.toLowerCase());
         */

        // Arreglos
        /*
         * char[] miArregloDeChars = { 'a', 'b', 'c' };
         * System.out.println(miArregloDeChars.length);
         * System.out.println(miArregloDeChars[0]);
         * miArregloDeChars[1] = 'x';
         * System.out.println(miArregloDeChars);
         */

        // Matriz
        /*
         * int[][] miMatriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
         * System.out.println(miMatriz[1][1]);
         * miMatriz[1][1] = 0;
         * System.out.println(miMatriz[1][1]);
         */

        // Casteo
        // automático
        /*
         * int miEntero = 8;
         * System.out.println(miEntero);
         * double miDouble = miEntero;
         * System.out.println(miDouble);
         */
        // manual
        /*
         * double miOtroDouble = 10.5d;
         * System.out.println(miOtroDouble);
         * int miOtroEntero = (int) miOtroDouble;
         * System.out.println(miOtroEntero);
         */

        // ej
        /*
         * int puntaje1 = 400;
         * int puntaje2 = 432;
         * float porcentaje = (float) puntaje1 / puntaje2 * 100.0f;
         * System.out.println(porcentaje);
         */

        // operadores
        /*
         * String hola = "Hola";
         * String ana = "Ana";
         * System.out.println(hola + " " + ana);
         */
        // aritméticos
        /*
         * System.out.println(100 + 10);
         * System.out.println(100 - 10);
         * System.out.println(100 * 10);
         * System.out.println(100 / 10);
         * System.out.println(100 % 10);
         * int miEntero = 100;
         * miEntero++;
         * miEntero--;
         */
        // asignación
        /*
         * int miEntero = 200;
         * System.out.println(miEntero += 10);
         * System.out.println(miEntero -= 10);
         * System.out.println(miEntero *= 10);
         * System.out.println(miEntero /= 10);
         * System.out.println(miEntero %= 3);
         */
        // comparación
        /*
         * System.out.println(100 == 10);
         * System.out.println(100 != 10);
         * System.out.println(100 > 10);
         * System.out.println(100 >= 10);
         * System.out.println(100 < 10);
         * System.out.println(100 <= 10);
         */
        // lógicos
        /*
         * System.out.println(100 > 10 && 50 > 5);
         * System.out.println(10 > 100 || 50 > 5);
         * System.out.println(!true);
         */

        // expresiones booleanas
        // verdaderas
        // falsas

        // estructuras de control
        // condicionales
        /*
         * if (10 > 5) {
         * System.out.println("se ejecuta si la condición se cumple");
         * }
         */

        /*
         * if (10 < 5) {
         * System.out.println("si se cumple");
         * } else {
         * System.out.println("no se cumple");
         * }
         */

        /*
         * int miEntero = 10;
         * if (miEntero > 10) {
         * System.out.println("es mayor a 10");
         * } else if (miEntero < 10) {
         * System.out.println("es menor a 10");
         * } else {
         * System.out.println("no es ni mayor ni menor a 10");
         * }
         */
        /*
         * int miEntero = 2;
         * switch (miEntero) {
         * case 1:
         * System.out.println("es uno");
         * break;
         * case 2:
         * System.out.println("es dos");
         * break;
         * default:
         * System.out.println("ni uno ni dos");
         * break;
         * }
         */

        // ciclos
        /*
         * for (int i = 1; i <= 10; i++) {
         * System.out.println(i);
         * }
         *
         * for (int i = 0; i < "hola".length(); i++) {
         * System.out.println(i);
         * }
         *
         * int[] miArr = { 1, 2, 3 };
         * for (int i = 0; i < miArr.length; i++) {
         * System.out.println(i);
         * }
         */

        /*
         * int i = 0;
         * while (i < 3) {
         * System.out.println(i);
         * i++;
         * }
         */

        /*
         * boolean si = true;
         * while (si) {
         * System.out.println("ejecutando...");
         * si = false;
         * }
         */

        /*
         * boolean si = false;
         * do {
         * System.out.println("ejecutando...");
         * si = false;
         * } while (si);
         */

        // manipulación del flujo
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
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
