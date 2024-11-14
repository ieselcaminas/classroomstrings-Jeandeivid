

import java.util.Scanner;

public class Digitos {
        public static int cuantosSonDigitos(String texto) {
            int contadorDigitos = 0;
            for (int i = 0; i < texto.length(); i++) {
                char caracter = texto.charAt(i);
                if (Character.isDigit(caracter)) {
                    contadorDigitos++;
                }
            }
            return contadorDigitos;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Introduce una cadena de texto: ");
            String texto = sc.nextLine();

            int cantidadDigitos = cuantosSonDigitos(texto);

            System.out.println("La cantidad de dígitos en la cadena es: " + cantidadDigitos);

        }
    }
