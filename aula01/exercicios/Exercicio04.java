package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario, valorquilowatt, valorpago, valorpagodesconto;
        int qtdequilowattconsumido;

        System.out.print("Informe o valor do salário mínimo: ");
        salario = teclado.nextDouble();

        System.out.print("Informa a quantidade de quilowatts consumido pela residência: ");
        qtdequilowattconsumido = teclado.nextInt();

        valorquilowatt = salario / 500;

        valorpago = valorquilowatt * qtdequilowattconsumido;

        valorpagodesconto = valorpago - (valorpago * 15)/100;

        System.out.println("Valor do quilowatt: " + valorquilowatt);
        System.out.println("Valor pago pela residência: " + valorpago);
        System.out.println("Valor pago com desconto de 15%: " + valorpagodesconto);

        teclado.close();
    }
}
