import java.util.Arrays;

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

        //for (int i = 0; i < letras.length; i++){
         //   System.out.println(letras[i]);
        //}

        //outra forma de imprimir o arrays
        System.out.println(Arrays.toString(letras));

        int[] numero = {1, 5, 54, 63, 2};
        int maior = numero[0];
        int menor = numero[0];
        int media = 0;

        for (int i = 0;i < numero.length; i++){
            if (numero[i] > maior){
                maior = numero[i];
            }
            if (numero[i] < menor){
                menor = numero[i];
            }
            media += numero[i] / numeros.length;
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media);
    }
}
