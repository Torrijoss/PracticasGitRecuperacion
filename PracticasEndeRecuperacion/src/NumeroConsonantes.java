public class NumeroConsonantes {
    private String frase;

    public NumeroConsonantes(String frase) {
        this.frase = frase;
    }

    public int contarConsonantes() {
        int contador = 0;
        String minuscula = frase.toLowerCase();

        for (int i = 0; i < minuscula.length(); i++) {
            char c = minuscula.charAt(i);
            if (c >= 'a' && c <= 'z' && !"aeiou".contains(String.valueOf(c))) {
                contador++;
            }
        }

        return contador;
    }
}

