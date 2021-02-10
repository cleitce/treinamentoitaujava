package exemplos.exemplo03;

import java.util.Stack;

// EXEMPLO DE PILHA

public class App {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>(); 

        pilha.push("um");
        pilha.push("dois");
        pilha.push("tres");
        pilha.push("quatro");

        System.out.println(pilha);

        /*
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        */

        while(! pilha.isEmpty()){
            System.out.println(pilha.pop());
        }
    }
}
