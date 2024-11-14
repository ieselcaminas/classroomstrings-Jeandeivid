import java.util.Scanner;
    public class Alfabetica {
        public static boolean esAlfabetica(String palabra) {
            palabra = palabra.toLowerCase();
            for (int i = 0; i < palabra.length() - 1; i++) {
                if (palabra.charAt(i) > palabra.charAt(i + 1)) {
                    return false;
                }
            }
            return true;
        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce una palabra:");
            String palabras = scanner.nextLine();
            for (String palabra : palabras.split(" ")) {

                if (esAlfabetica(palabra)) {
                    System.out.println(palabra + " es alfabética");
                } else {
                    System.out.println(palabra + " no es alfabética");
                }
            }
        }
    }
