package uri;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int codPeca1, qtdePecas1, codPeca2, qtdePecas2;
        double valorUnitPeca1, valorUnitPeca2, valorAPagar;
    
        codPeca1 = entrada.nextInt();
        qtdePecas1 = entrada.nextInt();
        valorUnitPeca1 = entrada.nextDouble();
    
        codPeca2 = entrada.nextInt();
        qtdePecas2 = entrada.nextInt();
        valorUnitPeca2 = entrada.nextDouble();
    
        valorAPagar = (qtdePecas1 * valorUnitPeca1) + (qtdePecas2 * valorUnitPeca2);
    
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorAPagar);
        System.out.println(codPeca1 + codPeca2);
    
        entrada.close();         
    }

}
