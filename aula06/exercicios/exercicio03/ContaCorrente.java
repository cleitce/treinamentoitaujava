package exercicios.exercicio03;

public class ContaCorrente extends Conta {
    private final double TAXA_DEPOSITO = 0.1;

    public ContaCorrente(int numeroConta){
        super(numeroConta);
    }
    
    @Override
    public void saque(double valorSaque) {
        if(valorSaque <= getSaldo()){
            super.saque(valorSaque);
        }
    }

    public void deposito(double valorDeposito){
        if(valorDeposito >= 0.10){
            super.deposito(valorDeposito - TAXA_DEPOSITO);
        }
    }


}
