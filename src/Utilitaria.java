public class Utilitaria {
    private static String[] numerosExtenso = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};

    public static void porExtenso(int numero) {
        String numeroExtenso = "";
        while (numero > 0) {
            numeroExtenso += numerosExtenso[numero%10] + " ";
            numero /= 10;
        }

        String[] strSplit = numeroExtenso.split(" ");
        String aux;
        for (int i = 0; i < strSplit.length/2; i++) {
            aux = strSplit[i];
            strSplit[i] = strSplit[strSplit.length - (i+1)];
            strSplit[strSplit.length - (i+1)] = aux;
        }

        for (String s : strSplit) {
            System.out.print(s + " ");
        }
    }
}
