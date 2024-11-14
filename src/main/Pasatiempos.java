
   import java.util.Scanner;

   public class Pasatiempos {
       public static String crearPasatiempo(String texto) {
           String pasatiempo = ";";
           for (int i = 0; i < texto.length(); i++) {
               pasatiempo = texto.replaceAll("[aeiouAEIOU]", ".");
           }
           return pasatiempo;

       }

       public static void main(String[] args) {
           String texto = "";
           Scanner sc = new Scanner(System.in);
           System.out.println("Ingrese un texto: ");
           texto = sc.nextLine();
           System.out.println(crearPasatiempo(texto));
       }
   }