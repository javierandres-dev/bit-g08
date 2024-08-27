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
        System.out.println("¡Hola, Mundo!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        String valorIngresado = scanner.nextLine();
        scanner.close();
        System.out.println("valorIngresado: " + valorIngresado);
    }
}
