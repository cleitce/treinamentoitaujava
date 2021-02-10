package exercicios.exercicio03;

public abstract class Conta {
    private int numeroConta;
    private double saldo;

    public Conta(int numeroConta){
        this.numeroConta = numeroConta;
        this.saldo = 5000;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }    

    public boolean deposito(double valorDeposito){
        if(valorDeposito > 0){
            saldo = saldo + valorDeposito;
            return true;            
        }
        return false;  // valor de deposito precisa ser maior do que zero
    }

    public boolean saque(double valorSaque){
        if(valorSaque > 0){
            saldo = saldo - valorSaque;
            return true;
        }
        return false;  //saldo insuficiente
    }

}
