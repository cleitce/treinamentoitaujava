package exercicio03;

public class Veiculo {
    private String modelo, marca;
    private double consumo;

    Veiculo(String modelo, String marca, double consumo){
        this.modelo = modelo;
        this.marca = marca;
        /*if(consumoPorKM > 0){
            this.consumoPorKM = consumoPorKM;
        }*/
        setConsumo(consumo);
    }

    void ExibirModelo(){
        System.out.println("O modelo é: " + modelo);
    }     

    void ExibirMarca(){
        System.out.println("A marca é: " + marca);
    }

    double getConsumo(){
        return consumo;
    } 
    
    void setConsumo(double consumo){
        if(consumo > 0){        
            this.consumo = consumo;
        }
    }
}
