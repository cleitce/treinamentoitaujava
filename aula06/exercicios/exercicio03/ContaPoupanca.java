package exercicios.exercicio03;

public class ContaPoupanca extends Conta{
    private static double taxa;   //a palavra static torna esse atributo de classe

    public ContaPoupanca(int numeroConta){
        super(numeroConta);
    }

    @Override
    public void saque(double valorSaque) {
        if(valorSaque < getSaldo() + taxa){
            super.saque(valorSaque + taxa);
        }
    } 

    public static void setTaxa(double novaTaxa){
        if(novaTaxa > 0)
        {
            taxa = novaTaxa;
        }
    }

    @Override
    public String toString() {
        return getNumeroConta() + ":" + getSaldo() + ":" + taxa;
    }
}
