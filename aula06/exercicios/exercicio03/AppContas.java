package exercicios.exercicio03;

public class AppContas {
    public static void main(String[] args) {

        /*
        conta.depositar(1000);
        System.out.println("Conta: " + conta.getNumeroConta() + " - Saldo: " + conta.getSaldo());
        conta.sacar(500);
        System.out.println("Conta: " + conta.getNumeroConta() + " - Saldo: " + conta.getSaldo());
        */

        /*
        ContaCorrente cc = new ContaCorrente(1000);
        cc.saque(300);
        System.out.println("ContaCorrente: " + cc.getNumeroConta() + " - Saldo: " + cc.getSaldo());
        */

        ContaPoupanca cp1 = new ContaPoupanca(123);
        ContaPoupanca cp2 = new ContaPoupanca(321);

        ContaPoupanca.setTaxa(0.1);

        System.out.println(cp1);
        System.out.println(cp2);



    }
}
