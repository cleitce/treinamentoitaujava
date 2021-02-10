package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario, salarioaumento;
        int aumento;
        
        System.out.print("Informe o salário: ");
        salario = teclado.nextDouble();

        System.out.print("Informe o percentual de aumento: ");
        aumento = teclado.nextInt();

        salarioaumento = salario + (salario * aumento)/100;
        
        System.out.println("Valor do salario com aumento: " + salarioaumento);

        teclado.close();
    }
}
