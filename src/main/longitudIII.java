package main;

import java.util.Scanner;

public class longitudIII {
        public static boolean todasCortas(String texto, int num) {
            String[] palabras = texto.split(" ");

            for (String palabra : palabras) {
                if (palabra.length() >= num) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce un texto: ");
            String texto = sc.nextLine();

            System.out.print("Introduce un número: ");
            int num = sc.nextInt();

            boolean resultado = todasCortas(texto, num);

            if (resultado) {
                System.out.println("Todas las cadenas son cortas.");
            } else {
                System.out.println("Hay alguna palabra larga.");
            }

            sc.close();
        }
    }


