package exercicios.exercicio02;

public class Estudante extends Pessoa {
    private String curso;

    Estudante(String nome, String telefone, String curso){
        super(nome, telefone);
        this.curso = curso;
    }

    @Override   //anotação indicando a sobreescrita do método de Pessoas para o Estudante
    public String getDados() {
        return super.getDados() + ", " + curso;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + curso;
        //return getDados();
    }

}
