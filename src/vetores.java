public class vetores {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        String[] letras = {"a","b", "d", "f"};

        for (int i = 0; i < letras.length; i++){
            System.out.println(letras[i]);
        }
    }
}
