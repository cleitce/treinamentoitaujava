package uri;

import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;
        int qtde100, qtde50, qtde20, qtde10, qtde5, qtde2, qtde1;

        valor = entrada.nextInt();

        // nota disponíveis 100, 50, 20, 10, 5, 2 e 1
        System.out.println(valor);

        qtde100 = valor / 100;
        valor = valor - (qtde100 * 100);
        qtde50 = valor / 50;
        valor = valor - (qtde50 * 50);
        qtde20 = valor / 20;
        valor = valor - (qtde20 * 20);
        qtde10 = valor / 10; 
        valor = valor - (qtde10 * 10);
        qtde5 = valor / 5;
        valor = valor - (qtde5 * 5);
        qtde2 = valor / 2;
        valor = valor - (qtde2 * 2);
        qtde1 = valor;

        System.out.println(qtde100 + " nota(s) de R$ 100,00");
        System.out.println(qtde50 + " nota(s) de R$ 50,00");
        System.out.println(qtde20 + " nota(s) de R$ 20,00");
        System.out.println(qtde10 + " nota(s) de R$ 10,00");
        System.out.println(qtde5 + " nota(s) de R$ 5,00");
        System.out.println(qtde2 + " nota(s) de R$ 2,00");
        System.out.println(qtde1 + " nota(s) de R$ 1,00");

        entrada.close();
    }
}
