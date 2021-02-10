package exemplo05;

public class Pessoa {
    String nome;
    double salario;

    Pessoa(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    void apresentar(){
        System.out.println("Olá sou o " + nome);
    }

    void exibir(){
        System.out.println("O salário é " + salario);
    }    

}
