public class funcao {
    public static void main(String[] args) {
        String nomeOriginal = "Jeff";
        saudacao(nomeOriginal);
        int resultado = soma(2,3);
        System.out.println(resultado);
    }

    public static void saudacao(String nome){
        System.out.println("Hello " + nome);
    }

    public static int soma(int a, int b){
        return a + b;
    }

}
