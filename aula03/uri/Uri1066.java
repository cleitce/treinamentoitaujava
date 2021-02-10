package uri;

import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont = 1, valor = 0, qtdePares = 0, qtdeImpares = 0, qtdePositivos = 0, qtdeNegativos = 0;

        while (cont <= 5) {
            //System.out.print("Digite o " + cont + "º valor: ");
            valor = entrada.nextInt();

            if(valor % 2 == 0){  //valores pares
                qtdePares ++;
            } else {
                qtdeImpares ++;
            }
            if(valor < 0){  //valores negativos
                qtdeNegativos ++;
            }
            else if (valor > 0){
                qtdePositivos ++;
            }
            cont ++;
        } 
        System.out.println(qtdePares + " valor(es) par(es)");
        System.out.println(qtdeImpares + " valor(es) impar(es)");
        System.out.println(qtdePositivos + " valor(es) positivo(s)");
        System.out.println(qtdeNegativos + " valor(es) negativo(s)");

        entrada.close();
    }  
}
