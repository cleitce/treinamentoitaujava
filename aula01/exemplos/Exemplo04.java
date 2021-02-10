package exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;
        double altura;
        
        System.out.print("Digite a sua idade: ");
        idade = teclado.nextInt();

        System.out.print("Digite a sua altura: ");
        altura = teclado.nextDouble();

        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua altura é: " + altura);

        teclado.close();
    }
}
