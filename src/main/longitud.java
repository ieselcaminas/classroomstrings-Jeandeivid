package main;

import java.util.Scanner;
    public class longitud {
    public static int contarPalabrasDeLongitud(String texto, int num) {
    String[] palabras = texto.split("\\s+");
    int contador = 0;
    for (String palabra : palabras) {
        if (palabra.length() == num) {
            contador++;
        }
    }
    return contador;
}


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String texto = scanner.nextLine();
        System.out.print("Introduce la longitud de las palabras a contar: ");
        int num = scanner.nextInt();
        int resultado = contarPalabrasDeLongitud(texto, num);
        System.out.println("Número de palabras con longitud " + num + ": " + resultado);
}
}
