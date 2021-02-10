import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número: ");
        System.out.println(verificaParImpar(in.nextInt()));
        in.close();
    }

    public static String verificaParImpar (int numero){
        String resultado = "numero impar";
        if(numero % 2 == 0)
        {
            resultado = "numero par";
        }
        return resultado;
    }
}
