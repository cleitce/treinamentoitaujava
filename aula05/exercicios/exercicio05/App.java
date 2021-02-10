package exercicio05;

public class App {
    public static void main(String[] args) {
        Ebook ebook = new Ebook("Treinamento Itau","Gama Academy", 10, 1);

        System.out.println("Você está na página " + ebook.exibirPagina());

        ebook.avancarPagina();

        System.out.println("Agora você avançou para página " + ebook.exibirPagina());
        
        ebook.retrocederPagina();

        System.out.println("Agora você retrocedeu para página " + ebook.exibirPagina());
        
        ebook.irParaPagina(5);

        System.out.println("Agora você decidiu exibir a página " + ebook.exibirPagina());

        System.out.println("Exibição da Capa:");
        ebook.mostrarCapa();

    }
}
