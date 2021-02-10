package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1 = entrada.nextDouble();
        double n2 = entrada.nextDouble();

        if(n1>=n2){
            System.out.println("Resultado: " + n1 + " , " + n2);
        }else{
            System.out.println("Resultado: " + n2 + " , " + n1);
        }
        
        entrada.close();
    }
}
