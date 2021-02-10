package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {    
        Scanner entrada = new Scanner(System.in);
        int numero, contador;
        contador = 1;

        System.out.print("Digite o número: ");
        numero = entrada.nextInt();

        while (contador <= numero) {
            System.out.print(contador);
            contador = contador * 2;
            if(contador <= numero)
            {
                System.out.print(",");
            }
        }

        entrada.close();
    }
}
