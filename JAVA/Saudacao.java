import java.time.LocalTime;

public class Saudacao {

    // Função sem retorno para exibir uma saudação com base na hora
    public static String saudacao() {
        // Obtém a hora atual
        LocalTime horaAtual = LocalTime.now();
        int hora = horaAtual.getHour(); // Pega a hora em formato de 23 horas

        // Determina a saudação com base na hora
        if (hora >= 5 && hora < 12) {
            return "Bom dia";
        } else if (hora >= 11 && hora < 18) {
            return "Boa tarde";
        } else if (hora >= 17 && hora <= 23) {
            return "Boa noite";
        } else {
            return "Vai dormir";
        }
    }

    public static void main(String[] args) {
        // Chama a função para exibir a saudação
        System.out.println(saudacao());
    }
}
