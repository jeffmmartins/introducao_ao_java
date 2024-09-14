public class estruturas_condicionais {
    public static void main(String[] args) {
        int nota = 50;
        String graduaco;
        if (nota >= 70 ){
            graduaco ="A";
        } else if (nota <= 70) {
            graduaco = "B";
        } else {
            graduaco = "";
        }

        switch (graduaco){
            case "A":
                System.out.println("Aluno aprovado");
                break;
            case "B":
                System.out.println("Aluno reprovado");
                break;
            default:
                System.out.println("Graduação invalida");

        }
    }
}
