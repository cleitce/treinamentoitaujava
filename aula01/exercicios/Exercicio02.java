package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media;
        
        System.out.print("Digite a nota 1: ");
        nota1 = teclado.nextDouble();

        System.out.print("Digite a nota 2: ");
        nota2 = teclado.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("Média: " + media);

        teclado.close();

    }
}
