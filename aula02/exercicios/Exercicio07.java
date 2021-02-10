package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o salário: ");
        double salario = entrada.nextDouble();

        if (salario <= 600){
            System.out.println("Valor do salário: " + salario + " - Isento");
        } else{
            if(salario <= 1200){
                System.out.println("Valor do salário: " + salario + " - Desconto de 20%");
            } else{
                if(salario <= 2000){
                    System.out.println("Valor do salário: " + salario + " - Desconto de 25%");
                } else{
                    System.out.println("Valor do salário: " + salario + " - Desconto de 30%");
                }            
            }
        }

        entrada.close();
    }
}
