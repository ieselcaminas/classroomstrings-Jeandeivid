public class SumarBinario {
    public static String sumaBinario(String binario1, String binario2) {
        String res = "";
        int digitoA = Integer.parseInt("" + binario1.charAt(0));
        char b1;
        char b2;
        int bit1;
        int bit2;
        int suma;
        int acarreo = 0;
        for (int i = binario1.length() - 1; i >= 0; i--) {
            b1 = binario1.charAt(i);
            b2 = binario2.charAt(i);
            bit1 = Integer.parseInt("" + b1);
            bit2 = Integer.parseInt("" + b2);
            suma = bit1 + bit2 + acarreo;
            if (suma == 0) {
                res = "0" + res;
                acarreo = 0;
            } else if (suma == 1) {
                res = "1" + res;
                acarreo = 0;
            } else if (suma == 2) {
                res = "0" + res;
                acarreo = 1;
            } else {
                res = "1" + res;
                acarreo = 1;
            }
        }
        if (acarreo == 1) {
            res = "1" + res;
            }
        return res;
    }
    public static void main(String[] args) {
        String num1 = "1111";
        String num2 = "1010";

        System.out.println("Suma binaria de " + num1 + " y " + num2 + ": " + sumaBinario(num1, num2));
    }
}
