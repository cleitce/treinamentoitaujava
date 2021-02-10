package exemplo05;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Cleiton",2000);
        Pessoa pessoa2 = new Pessoa("João",5000);

        pessoa1.apresentar();
        pessoa1.exibir();

        pessoa2.apresentar();
        pessoa2.exibir();
    }
}
