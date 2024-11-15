import java.util.Scanner;
    public class Siglas {
        public String Siglas(String palabra){
            String sigla = "";
            for (int i = 0; i < palabra.length(); i++) {
                if ((i == 0 )) {
                    sigla += palabra.charAt(i);
                }
                else if (palabra.charAt(i) == ' ' && Character.isUpperCase(palabra.charAt(i + 1))) {
                   sigla += palabra.charAt(i + 1);
                }
            }
            return sigla;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime una frase: ");
            String frase = sc.nextLine();

            Siglas siglas = new Siglas();
            System.out.println(siglas.Siglas(frase));
        }
    }


