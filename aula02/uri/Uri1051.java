package uri;

import java.util.Scanner;

public class Uri1051 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario = entrada.nextDouble();
        double imposto;

        if((salario >= 0) && (salario <= 2000))
        {
            System.out.println("Isento");
        }
        else 
        {
            if((salario > 2000) && (salario <= 3000))
            {
                imposto = (salario - 2000) * 0.08;
                System.out.printf("R$ %.2f\n", imposto);
            } 
            else 
            {
                if((salario > 3000) && (salario <= 4500))
                {
                    imposto = ((1000 * 0.08) + ((salario - 3000) * 0.18));

                    System.out.printf("R$ %.2f\n", imposto);
                }  
                else 
                {
                    if(salario > 4500)
                    {
                        imposto = ((1000 * 0.08) + (1500 * 0.18) +  ((salario - 4500) * 0.28));
                        System.out.printf("R$ %.2f\n", imposto);
                    }
                }
            }
        }
        
        entrada.close();
    }
}
