package exemplos.exemplo01;

public class App {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();

        cc.saque(200);

        Contas c = new ContaCorrente();

        c.deposito(1000);
    }
}
