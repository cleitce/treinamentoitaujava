package exercicio04;

import java.time.LocalDateTime;

public class Aplicacao {
    public static void main(String[] args) {
        Relogio relogio1 = new Relogio(00,00,00);        

        // Cria uma variável com a classe LocalDateTime para capturar a hora atual do sistema
        LocalDateTime dateTimeNow = LocalDateTime.now();

        //Setar os valores de hora, minutos e segundos atuais na classe Relogio
        relogio1.setHoraAtual(dateTimeNow.getHour(),dateTimeNow.getMinute(),dateTimeNow.getSecond());
        //relogio1.setHoraAtual(23,00,01);

        // imprimir hora atual através do método geHoraAtual da classe relogio
        System.out.println("Hora atual: " + relogio1.getHoraAtual());
        
    }

}
