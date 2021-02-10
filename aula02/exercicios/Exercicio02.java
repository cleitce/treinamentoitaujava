package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;
        
        System.out.print("Informe a nota 1: ");
        nota1 = entrada.nextDouble() * 40;
        
        System.out.print("Informe a nota 1: ");
        nota2 = entrada.nextDouble() * 60;

        media = (nota1 + nota2) / 100;

        if(media >= 6.0){
            System.out.println("Média: " + media + " -  Aprovado!");
        }
        else{
            System.out.println("Média: " + media + " -  Reprovado!");
        }

        entrada.close();
    }
}
