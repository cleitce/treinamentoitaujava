package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o salário bruto: ");
        double salariobruto = entrada.nextDouble();

        System.out.print("Informe o valor da prestação: ");
        double valorprestacao = entrada.nextDouble();

        if(valorprestacao > (salariobruto * 0.30))
            System.out.println("Salario bruto:" + salariobruto + "\nValor Prestação:" + valorprestacao + "\nEmpréstimo não pode ser concedido!");
        else
            System.out.println("Salario bruto:" + salariobruto + "\nValor Prestação:" + valorprestacao + "\nEmpréstimo concedido!");

        entrada.close();
    }
}
