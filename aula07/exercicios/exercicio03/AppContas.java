package exercicios.exercicio03;

//import java.util.ArrayList;
import java.util.Scanner;

public class AppContas {
    public static void main(String[] args) {

        /*
        conta.depositar(1000);
        System.out.println("Conta: " + conta.getNumeroConta() + " - Saldo: " + conta.getSaldo());
        conta.sacar(500);
        System.out.println("Conta: " + conta.getNumeroConta() + " - Saldo: " + conta.getSaldo());
        */

        /*
        ContaCorrente cc = n7ew ContaCorrente(1000);
        cc.saque(300);
        System.out.println("ContaCorrente: " + cc.getNumeroConta() + " - Saldo: " + cc.getSaldo());
        */

        /*
        ContaPoupanca cp1 = new ContaPoupanca(123);
        ContaPoupanca cp2 = new ContaPoupanca(321);

        ContaPoupanca.setTaxa(0.1);

        System.out.println(cp1);
        System.out.println(cp2);
        */

        Scanner entrada = new Scanner(System.in);
        int opcao, numeroconta;
        double limite, valor;

        //ContaCorrente cc = null;
        //ContaEspecial ce = null;
        //ContaPoupanca cp = null;

        //ArrayList<ContaCorrente> contas = new ArrayList<>();
        //ArrayList<ContaEspecial> contasEspeciais = new ArrayList<>();
        //ArrayList<Conta> contas = new ArrayList<>();
        GerenciaConta gerencia = new GerenciaConta();

        do{
            System.out.println("1 - Nova Conta Corrente");
            System.out.println("2 - Nova Conta Especial");
            System.out.println("3 - Nova Conta Poupança");
            System.out.println("4 - Saque");
            System.out.println("5 - Depósito");
            System.out.println("6 - Saldo");
            System.out.println("7 - Sair");
            System.out.print("Opção ==> ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o número da Conta Corrente: ");
                    numeroconta = entrada.nextInt();
                    //cc = new ContaCorrente(numeroconta);
                    //contas.add(cc);
                    gerencia.novaContaCorrente(numeroconta);
                    break;
                case 2:
                    System.out.print("Informe o número da Conta Especial: ");
                    numeroconta = entrada.nextInt();                    
                    System.out.print("Informe o limite: ");
                    limite = entrada.nextDouble();
                    //ce = new ContaEspecial(numeroconta,limite);
                    //contas.add(ce);
                    gerencia.novaContaEspecialLimite(numeroconta, limite);
                    break;
                case 3:
                    System.out.print("Informe o número da Conta Poupança: ");
                    numeroconta = entrada.nextInt();
                    //cp = new ContaPoupanca(numeroconta);
                    //contas.add(cp);
                    gerencia.novaContaPoupanca(numeroconta);
                    break;
                case 4:
                    System.out.print("Informe o número da Conta: ");
                    numeroconta = entrada.nextInt();
                    System.out.print("Informe o valor do Saque: ");
                    valor = entrada.nextDouble();
                    /*
                    for (Conta conta : contas) {
                        if(conta.getNumeroConta() == numeroconta){
                            conta.saque(valor);
                            System.out.println("Saque de " + valor + " efetuado na conta: " + numeroconta);
                            break;
                        }
                    }
                    */
                    if(gerencia.novoSaque(numeroconta, valor)){
                        System.out.println("Saque realizado com sucesso!");
                    }
                    else {
                        System.out.println("Falha ao realizar o saque!");
                    }
                    break;
                case 5:
                    System.out.print("Informe o número da Conta: ");
                    numeroconta = entrada.nextInt();
                    System.out.print("Informe o valor do Depósito: ");
                    valor = entrada.nextDouble();
                    /*
                    for (Conta conta : contas) {
                        if(conta.getNumeroConta() == numeroconta){
                            conta.deposito(valor);
                            System.out.println("Depósito de " + valor + " efetuado na conta: " + numeroconta);
                            break;
                        }
                    }
                    */
                    if(gerencia.novoDeposito(numeroconta, valor)){
                        System.out.println("Depósito realizado com sucesso!");
                    }
                    else {
                        System.out.println("Falha ao realizar o depósito!");
                    }

                    break;
                case 6:
                    System.out.print("Informe o número da Conta: ");
                    numeroconta = entrada.nextInt();

                    /*
                    for (Conta conta : contas) {
                        if(conta.getNumeroConta() == numeroconta){
                            System.out.println(conta);
                            break;
                        }
                    }
                    */
                    System.out.println(gerencia.saldoConta(numeroconta));


                    //System.out.println(contas);
                    //System.out.println(contasEspeciais);
                    /*
                    contas.forEach(xcc -> {
                        System.out.println("Saldo " + xcc);
                    });
                    */
                        
                    break;
                case 7:
                    break;                    
                default:
                    System.out.println("Default");
                    break;
            }

        } while(opcao != 7);

        entrada.close();



    }
}
