package exemplos.exemplo01;

public class App {
    public static void main(String[] args) {
        //Funcionario func = new Funcionario();
        Funcionario func2 = new Funcionario("Mané",3000);
        Funcionario func3 = new Funcionario("Joaquim");
        Gerente gerente = new Gerente("Mario");
        Gerente gerente2 = new Gerente("João",5000,30);
        
        func3.setNome("Cleiton");

        System.out.println("Funcionário: " + func2.getNome());
        System.out.println("Gerente: " + gerente.getNome());
        System.out.println("Gerente: " + gerente.getNome("Sr. "));

        System.out.println("Funcionário: " + func2.getDados());
        System.out.println("Gerente: " + gerente2.getDados());

        func2.aumentarSalario(10);
        System.out.println("Funcionário após aumento de salário: " + func2.getDados());

        gerente2.aumentarSalario(10);
        System.out.println("Gerente após aumento de salário: " + gerente2.getDados());

        //teste do Override do toString
        System.out.println(func2);
        System.out.println(gerente2);

    }
}