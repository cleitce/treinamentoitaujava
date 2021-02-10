package exemplos.exemplo01;

/**
 * Funcionario
 */
public class Funcionario {
    private String nome;
    protected double salario;

    //Construtor
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    // OVERLOAD - sobrecarga exige pelo menos um parametro diferente
    public Funcionario(String nome){
        this.nome = nome;
    }

    // Construtor vazio sem a necessidade de parâmetros
    /*public Funcionario(){   //Construtor default
    }*/

    public String getNome(){
        return this.nome;
    }

    //OVERLOAD do metodo getNome
    public String getNome(String titulo){
        return titulo + " " + this.nome;
    }    

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDados(){
        return nome + ", R$ " + salario;
    } 
    
    public void aumentarSalario(int percentual){
        salario = salario + salario * percentual/ 100;
    }

    @Override
    public String toString() {
        //return nome + ", R$ " + salario;
        return getDados();
    }
}