public class parentesis {
    public static boolean verificarParentesis(String cadena) {
        int verificar = 0;
        char character;
            for (int i = 0; i < cadena.length(); i++) {
            character = cadena.charAt(i);
            if (character == '(') {
                verificar++;
            } else if (character == ')') {
                verificar--;
            }
            if (verificar < 0) {
                return false;
            }
        }
        return verificar == 0;
    }
    public static void main(String[] args) {
        String cadena1 = "Esto (es (un ejemplo) (de) una (cadena bien) parentizada)";
        String cadena2 = "una )cadena (mal (parentizada)";
        String cadena3 = "(una)(";


        System.out.println("¿La cadena 1 está bien parentizada? " + verificarParentesis(cadena1));
        System.out.println("¿La cadena 2 está bien parentizada? " + verificarParentesis(cadena2));
        System.out.println("¿La cadena 3 está bien parentizada? " + verificarParentesis(cadena3));
    }
}
