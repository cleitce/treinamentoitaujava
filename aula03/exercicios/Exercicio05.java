package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        //int cont = 1;
        int pares = 0;
        int impares = 0;

        /*
        while (cont <=10) {
            System.out.print("Digite o " + cont + "º número: ");
            numero = entrada.nextInt();
            if(numero%2 ==0){
                pares += 1;
            } else {
                impares += 1;
            }
            cont ++;
        }*/
  
        for(int cont = 1; cont <=10 ; cont ++)
        {
            System.out.print("Digite o " + cont + "º número: ");
            numero = entrada.nextInt();
            if(numero % 2 ==0){
                pares ++;
            }
            else
            {
                impares ++;
            }
        }
        System.out.println("O total de pares é: " + pares);
        System.out.println("O total de impares é: " + impares);

        entrada.close();
    }
}
