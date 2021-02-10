package exercicios.exercicio02;

public class App {
    public static void main(String[] args) {
        //Pessoa pessoa1 = new Pessoa("Cleiton","11 9999 1111");
        Estudante estudante1 = new Estudante("Cleiton","11 9999 1111","Treinamento de Java");
        Professor professor1 = new Professor("Emerson","11 9999 2222", 1000);

        Pessoa pessoa2 = new Estudante("João","11 9999 3333","Atribuição de um Estudante para classe Pessoa");
        Pessoa pessoa3 = new Professor("Mario","11 9999 4444",5000);

        //System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(estudante1);
        System.out.println(professor1);
        System.out.println(pessoa3);
    }
}
