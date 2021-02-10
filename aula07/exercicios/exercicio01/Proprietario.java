package exercicios.exercicio01;

public class Proprietario {
    private String nome, telefone;

    public Proprietario(){
        setProprietario("Não definido", "00 0000-0000");
    }

    public Proprietario(String nome, String telefone){
        setProprietario(nome, telefone);
    }

    public String getProprietario(){
        return nome + " - " + telefone;
    }

    public void setProprietario(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return getProprietario();
    }
}
