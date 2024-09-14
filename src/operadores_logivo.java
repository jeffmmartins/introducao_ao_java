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


        System.out.println(resultado);
    }
}
