import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int primeroNumero, segundoNumero, terceiroNumero;

        System.out.print("Digite o primeiro número: ");
        primeroNumero = in.nextInt();
        System.out.print("Digite o segundo número: ");
        segundoNumero = in.nextInt();
        System.out.print("Digite o terceiro número: ");
        terceiroNumero = in.nextInt();

        System.out.println("O menor número é: " + retornaNumeroMenor(primeroNumero,segundoNumero,terceiroNumero));

        in.close();        
    }

    public static int retornaNumeroMenor(int n1, int n2, int n3){
        int numeromenor = n1;
    
        if(numeromenor > n2){
            numeromenor = n2;
        } 
        if(numeromenor > n3){
            numeromenor = n3;
        }
        return numeromenor;
    }    
}

