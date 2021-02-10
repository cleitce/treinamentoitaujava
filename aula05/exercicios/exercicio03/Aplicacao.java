package exercicio03;

public class Aplicacao {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Fusca","Volkswagen", 15.5);
        Veiculo veiculo2 = new Veiculo("HB20","Hyundai", 8.6);
        Veiculo veiculo3 = new Veiculo("Renegade","Jeep", 12.4);

        veiculo1.ExibirMarca();
        veiculo1.ExibirModelo();
        System.out.println("Consumo: " + veiculo1.getConsumo());

        veiculo2.ExibirMarca();
        veiculo2.ExibirModelo();
        System.out.println("Consumo: " + veiculo2.getConsumo());

        veiculo3.ExibirMarca();
        veiculo3.ExibirModelo();
        System.out.println("Consumo: " + veiculo3.getConsumo());
        veiculo3.setConsumo(21.3);
        System.out.println("Consumo: " + veiculo3.getConsumo());
    }
}
