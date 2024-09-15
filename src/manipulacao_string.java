import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;

public class manipulacao_string {
    public static <localDate> void main(String[] args) {
        // Recuperando a data
        // Recuperando a data atual
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        // Definindo o Locale para o Brasil
        Locale brasil = new Locale("pt", "BR");

        // Exibindo o nome completo do dia da semana em português
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        System.out.println(diaSemana);

        LocalDateTime agora = LocalDateTime.now();
        String saudacao;
        if (agora.getHour() > 8 && agora.getHour() < 12) {
            saudacao = "Bom dia";
        }else {
            saudacao = "boa noite";
        }
        System.out.println(saudacao);
    }
}
