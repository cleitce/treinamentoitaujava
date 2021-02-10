package exercicios.exercicio01;

public class Animal {
    private String nome, raca, cor;
    private int anonascimento;
    private Proprietario prop;

    public Animal(String nome, String raca, String cor, int anonascimento, String nomeProprietario, String telefone){
        setAnimal(nome, raca, cor, anonascimento, nomeProprietario, telefone);
    }

    public Animal(){
        setAnimal("Não definido", "Não definido", "Não definido", 0, "Não definido", "Não definido");
    }

    public void setAnimal(String nome, String raca, String cor, int anonascimento, String nomeProprietario, String telefone){
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.anonascimento = anonascimento;
        
        this.prop = new Proprietario(nomeProprietario,telefone);
        //prop.setProprietario(nomeProprietario,telefone);
     
    }

    public String getAnimal(){
        return nome + " - " + raca + " - " + cor + " - " + anonascimento + " - " + prop;
    }

}
