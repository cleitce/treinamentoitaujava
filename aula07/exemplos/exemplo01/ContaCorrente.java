package exemplos.exemplo01;

// Exemplo de uso de uma INTERFACE através do metodo IMPLEMENTS

public class ContaCorrente implements Contas{
    private double saldo;

    public ContaCorrente(){
        saldo = 0;
    }

    @Override
    public void saque(double valor) {
        saldo -= valor;
    }

    @Override
    public void deposito(double valor) {
        saldo += valor;
    }
}
