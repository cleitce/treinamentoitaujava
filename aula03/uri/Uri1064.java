package uri;

import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor = 0, somaPositivos = 0;
        int cont = 1, qtdePositivos = 0; 

        while (cont <= 6) {
            //System.out.print("Digite o " + cont + "º valor: ");
            valor = entrada.nextDouble();

            if(valor > 0){  //valores positivos
                qtdePositivos ++;
                somaPositivos += valor;
            }
            cont ++;
        } 
        System.out.println(qtdePositivos + " valores positivos");        
        System.out.printf("%.1f\n",((double)somaPositivos/qtdePositivos));
        entrada.close();
    }
}
