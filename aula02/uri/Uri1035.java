package uri;

import java.util.Scanner;

public class Uri1035 {
    public static void main(String[] args) {
        /*Leia 4 valores inteiros A, B, C e D. 
        A seguir, se B for maior do que C e se D for maior do que A, 
        e a soma de C com D for maior que a soma de A e B e se C e D, 
        ambos, forem positivos e se a variável A for par escrever a 
        mensagem "Valores aceitos", senão escrever "Valores nao aceitos".
        */
        Scanner entrada = new Scanner(System.in);
        int valA = entrada.nextInt();
        int valB = entrada.nextInt();
        int valC = entrada.nextInt();
        int valD = entrada.nextInt();
        boolean condicoes;

        condicoes = (valB > valC) && (valD > valA) && ((valC + valD) > (valA + valB)) && (valC > 0) && (valD > 0) && (valA%2 == 0);

        if(condicoes){
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores nao aceitos");
        }

        entrada.close();


    }
}
