package exercicios.exercicio01;

public class Placar {
    private String time1, time2;
    private int golsTime1, golsTime2;

    Placar(){  // Construtor Default
        this("time1", "time2");  //chamada do construtor seguinte com 2 parâmetros      
    }

    Placar(String time1, String time2){   // Construtor com 2 times
       this(time1, time2, 0, 0);  //chamada do construtor seguinte com 4 parâmetros
    }    

    Placar(String time1, String time2, int golsTime1, int golsTime2){   // Construtor com times e gols
        this.time1 = time1;
        this.time2 = time2;
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;
    }

    public String getPlacar(){    // Método para retornar o placar
        return time1 + " " + golsTime1 + " X " + golsTime2 + " " + time2;
    }
    
    public void setPlacar(String time1, String time2, int golsTime1, int golsTime2){  // Método para setar os valores
        this.time1 = time1;
        this.time2 = time2;
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;      
    }
}
