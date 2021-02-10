package exercicios.exercicio03;

import java.util.ArrayList;

public class GerenciaConta {
    private ArrayList<Conta> contas;

    public GerenciaConta(){
        contas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroconta){
        //ContaCorrente cc = new ContaCorrente(numeroconta);
        //contas.add(cc);
        contas.add(new ContaCorrente(numeroconta));
    }

    public void novaContaEspecialLimite(int numeroconta, double limite){
        contas.add(new ContaEspecial(numeroconta,limite));
    }

    public void novaContaPoupanca(int numeroconta){
        contas.add(new ContaPoupanca(numeroconta));
    }

    public boolean novoSaque(int numeroconta, double valor){
        for (Conta conta : contas) {
            if(conta.getNumeroConta() == numeroconta){
                //conta.saque(valor);
                //break;
                return conta.saque(valor);
            }
        }
        return false;  // se chegou até aqui não achou a conta
    }

    public boolean novoDeposito(int numeroconta, double valor){
        for (Conta conta : contas) {
            if(conta.getNumeroConta() == numeroconta){
                //conta.deposito(valor);
                //System.out.println("Depósito de " + valor + " efetuado na conta: " + numeroconta);
                //break;                
                return conta.deposito(valor);
            }
        }
        return false;  // se chegou até aqui não achou a conta
    }

    public String saldoConta(int numeroconta){
        for (Conta conta : contas) {
            if(conta.getNumeroConta() == numeroconta){
                //System.out.println(conta);
                //break;
                return conta.toString();
            }
        }
        return "Conta não encontrada";
    }


}
