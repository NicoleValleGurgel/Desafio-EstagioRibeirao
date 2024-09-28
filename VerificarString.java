public class VerificarString {

    public static String verificarString(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        if (count > 0) {
            return "A letra 'a' aparece " + count + " vezes na string.";
        } else {
            return "A letra 'a' não aparece na string.";
        }
    }

    public static void main(String[] args) {
        String string = "A aranha arranha a rã, a rã arranha a aranha, nem a aranha arranha a rã, nem a rã arranha a aranha";

        String resultado = verificarString(string);
        System.out.println(resultado);
    }

}
