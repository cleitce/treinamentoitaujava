package exercicios.exercicio03;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numeroConta, double limite){
        super(numeroConta);
        setLimite(limite);
    }

    public void setLimite(double valor){
        if(valor > 0){
            limite = valor;
        }
    }

    public double getLimite(){
        return limite;
    }

    @Override
    public boolean saque(double valorSaque) {
        if(valorSaque > 0 && valorSaque <= getSaldo() + limite){
            super.saque(valorSaque);
            return true;
        }
        return false;  //saldo insuficiente
    }

    @Override
    public String toString() {
        return "Conta Especial:" + getNumeroConta() + " - " + getSaldo() + " - " + limite;
    }

}
