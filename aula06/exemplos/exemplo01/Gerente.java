package exemplos.exemplo01;


public class Gerente extends Funcionario {
    private int nFuncionarios;

    //Construtor 1 
    public Gerente(String nome, double salario, int nFuncionarios){
        super(nome, salario);  //chamada ao construtor da superclasse Funcionario
        this.nFuncionarios = nFuncionarios;
    }

    //Construtor 1 - OVERLOAD
    public Gerente(String nome){
        super(nome);  //chamada ao construtor da superclasse Funcionario
    }    
    
    public int getNumeroFuncionarios(){
        return nFuncionarios;
    }

    public void setNumeroFuncionarios(int qtdeFuncionarios){
        this.nFuncionarios = qtdeFuncionarios;
    }

    @Override   //anotação indicando a sobreescrita do método de Funcionario para o Gerente
    public String getDados() {
        return super.getDados() + ", " + nFuncionarios;
    }

    @Override
    public void aumentarSalario(int percentual) {
        super.aumentarSalario(percentual + 20);
    }
}
