package exemplos;

public class Exemplo01 {
    public static void main(String[] args) {
        double valorDouble = 4.567;
        int valorInt = 12;

        System.out.printf("Resposta = %f\n", valorDouble);
        System.out.printf("Resposta = %d\n", valorInt);
        System.out.printf("Respostas = %f - %d\n", valorDouble, valorInt);
        System.out.printf("Resposta = %.2f\n", valorDouble); //2 casas decimais
        System.out.printf("Resposta = %4.1f\n", valorDouble);  //4 total de digitos
    }
}
