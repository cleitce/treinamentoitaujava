package exercicios.exercicio02;

public class Professor extends Pessoa {
    private double salario;

    Professor(String nome, String telefone, double salario){
        super(nome, telefone);
        this.salario = salario;
    }
    
    @Override   //anotação indicando a sobreescrita do método de Pessoas para o Professor
    public String getDados() {
        return super.getDados() + ", " + salario;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + salario;
        //return getDados();
    }

}
