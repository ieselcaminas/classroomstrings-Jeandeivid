package main;
import java.util.Scanner;

    public class FraseInvertida {

        public static String invertirFrase(String cadena) {
        String[] palabras = cadena.split(" ");

        String fraseInvertida = "";

        for (int i = palabras.length - 1; i >= 0; i--) {
            fraseInvertida += palabras[i] + " ";
        }
        return fraseInvertida;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String texto = sc.nextLine();

        String resultado = invertirFrase(texto);
        System.out.println("Frase invertida: " + resultado);
    }
}
