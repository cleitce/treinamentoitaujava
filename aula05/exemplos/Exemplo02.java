public class Exemplo02 {
    public static void main(String[] args) {
        linha(10, '-');
        String texto = "Programa v01";
        System.out.println("Programa v01");
        linha(texto.length(), '=');
        System.out.println("Escolha uma opção");
        linha(30, '*');        
    }

    public static void linha(int tamanho, char tipo)
    {
        for(int i = 0; i < tamanho; i++){
            System.out.print(tipo);
        }
        System.out.println();
    }
}
