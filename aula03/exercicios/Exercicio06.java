package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int qtdePares = 0, somaPares = 0, qtdeImpares = 0;

        for(int cont = 1; cont <= 10 ; cont ++)
        {
            System.out.print("Digite o " + cont + "º número: ");
            numero = entrada.nextInt();
            if(numero % 2 == 0){
                qtdePares ++;
                somaPares += numero;
            } else {
                qtdeImpares ++;
            }
        }
        System.out.println("A média dos valores pares é: " + ((double) somaPares/qtdePares));
        System.out.println("A porcetagem de números impares é de: " + ((double) 10 * qtdeImpares) + "%");

        entrada.close();
    }

}
