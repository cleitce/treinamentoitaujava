package exercicio04;

public class Relogio {
    private int hora, minutos, segundos;

    Relogio(int hora, int minutos, int segundos){
        //this.hora = hora;
        //this.minutos = minutos;
        //this.segundos = segundos;

        setHoraAtual(hora,minutos,segundos);
    }

    public String getHoraAtual(){
        return this.hora + ":" + this.minutos + ":" + this.segundos;

    }

    public void setHoraAtual(int hora, int minutos, int segundos){
        if((hora >= 0) && (hora < 24))
        {
            this.hora = hora;
            if((minutos >= 0) && (minutos < 60))
            {
                this.minutos = minutos;
                if ((segundos >= 0) && (segundos < 60))
                {
                    this.segundos = segundos;
                }
                else
                {
                    System.out.println("Valor de segundos não permitido!");
                }
            }
            else
            {
                System.out.println("Valor de minutos não permitido!");
            }
        }
        else
        {
            System.out.println("Valor de horas não permitido!");
        }
   
    }
}
