package exercicios.exercicio02;

public abstract class Pessoa {   // Classe abstrata que não pode criar objetos, só pode ser usada para herança
    private String nome;
    private String telefone;

    Pessoa(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getDados(){
        return nome + ", " + telefone;
    }

    @Override
    public String toString() {
        //getDados();
        return nome + ", " + telefone;
    }
}
