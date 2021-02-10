package uri;

import java.util.Scanner;

public class Uri1005 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorA, valorB, valorC, media;

        valorA = entrada.nextDouble() * 2;
        valorB = entrada.nextDouble() * 3;
        valorC = entrada.nextDouble() * 5;

        media = (valorA + valorB + valorC) / 10 ;

        System.out.printf("MEDIA = %.1f\n", media);

        entrada.close();

    }
}
