public class operadores_logivo {
    public static void main(String[] args) {
        boolean fimDeSemana = true;
        boolean vamosAPraia = true;
        boolean resultado = fimDeSemana && vamosAPraia;

        // Tabela verdade
        // operador and
        // true && true  = true
        // false && true  = false
        // true && false  = false
        // false &&false  = false

        // Operados OR
        // true && true  = true
        // false && true  = true
        // true && false  = true
        // false &&false  = false

        System.out.println(resultado);

        String mensagem = fimDeSemana ? "É fim de semana" : "não é fim de semana ";
        System.out.println(mensagem);
    }
}
