package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ladoA, ladoB, ladoC;

        System.out.print("Informe o tamanho do lado A: ");
        ladoA = entrada.nextInt();

        System.out.print("Informe o tamanho do lado B: ");
        ladoB = entrada.nextInt();
        
        System.out.print("Informe o tamanho do lado C: ");
        ladoC = entrada.nextInt();

        if((ladoA > (ladoB+ladoC)) || (ladoB > (ladoA+ladoC)) || (ladoC > (ladoA+ladoB))){
            System.out.println("Comprimentos A:" + ladoA + " B:" + ladoB + " C:" + ladoC + " - Não formam um triângulo!");
        } else{
            if((ladoA == ladoB) && (ladoB == ladoC)){
                System.out.println("Comprimentos A:" + ladoA + " B:" + ladoB + " C:" + ladoC + " - Forma um triângulo equilátero!");
            } else{
                if((ladoA == ladoB) || (ladoB ==ladoC) || (ladoA == ladoC)){
                    System.out.println("Comprimentos A:" + ladoA + " B:" + ladoB + " C:" + ladoC + " - Forma um triângulo isósceles!");
                } else{
                    System.out.println("Comprimentos A:" + ladoA + " B:" + ladoB + " C:" + ladoC + " - Forma um triângulo escaleno!");
                }
                
            }
        }

        entrada.close();
    }
}
