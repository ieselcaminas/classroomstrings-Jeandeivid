package main;

import java.util.Scanner;

public class longitudII {
    public static boolean acalculolongitud(String texto, int num){
        String[] palabraS = texto.split(" ");

        for (String palabra : palabraS){
            if(palabra.length() == num){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce un texto: ");

        String texto = sc.nextLine();
        System.out.print("introduce un numero : ");
        int num = sc.nextInt();


        boolean resultado = acalculolongitud(texto, num);
        if (resultado){
            System.out.println("si hay al menos una palabra con esa longitud" + num);
        }else{
            System.out.println("no hay palabras con esa longitud" + num );
        }

    }
}
