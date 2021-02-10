package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 1, cont = 1, soma = 0;

        while (numero != 0) {
            System.out.print("Digite o " + cont + "º número: ");
            numero = entrada.nextInt();
            soma = soma + numero;
            cont ++;
        } 
        System.out.println("A soma dos valores é: " + soma);        
        entrada.close();
    }   
}
