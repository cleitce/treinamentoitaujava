package exercicios.exercicio03;

public class ContaCorrente extends Conta {
    private final double TAXA_DEPOSITO = 0.1;

    public ContaCorrente(int numeroConta){
        super(numeroConta);
    }
    
    @Override
    public boolean saque(double valorSaque) {
        if(valorSaque <= getSaldo()){
            super.saque(valorSaque);
            return true;
        }
        return false;  //saldo insuficiente
    }

    public boolean deposito(double valorDeposito){
        if(valorDeposito >= 0.10){
            super.deposito(valorDeposito - TAXA_DEPOSITO);
            return true;
        }
        return false;  // valor de deposito precisa ser maior do que zero
    }

    @Override
    public String toString() {
        return "Conta Corrente:" + getNumeroConta() + " - " + getSaldo();
    }
}
