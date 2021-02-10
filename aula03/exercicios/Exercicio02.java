package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont = 0;

        System.out.print("Digite o número: ");
        int numero = entrada.nextInt();

        while (cont <= 10) {
            System.out.println(numero + " x " + cont + " = " + (numero * cont));
            cont ++;
        } 
        entrada.close();
    }
}
