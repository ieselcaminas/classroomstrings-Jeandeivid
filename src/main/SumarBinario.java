public class SumarBinario {
    public static String sumaBinario(String binario1, String binario2) {
        int maxLen = Math.max(binario1.length(), binario2.length());
        StringBuilder sb = new StringBuilder();
        int carry = 0;


        for (int i = 0; i < maxLen; i++) {
            int digit1 = i < binario1.length()? binario1.charAt(binario1.length() - 1 - i) - '0' : 0;
            int digit2 = i < binario2.length()? binario2.charAt(binario2.length() - 1 - i) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            carry = sum / 2;
            sb.append(sum % 2);
        }
        if (carry > 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String binario1 = "101010";
        String binario2 = "1101";


        System.out.println("Suma de " + binario1 + " y " + binario2 + ": " + sumaBinario(binario1, binario2));
    }
}
