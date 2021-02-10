package uri;

import java.util.Scanner;

public class Uri1117 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1 = 0, nota2 = 0, media = 0;
        boolean nota1OK = false, nota2OK = false;

        while (media == 0) {
            //System.out.print("Digite o " + cont + "º valor: ");
            while(nota1OK == false)
            {
                nota1 = entrada.nextDouble();
                if((nota1 < 0) || (nota1 >10))
                {
                    System.out.println("nota invalida");
                }
                else 
                {
                    nota1OK = true;
                }
            }
            while(nota2OK == false)
            {            
                nota2 = entrada.nextDouble();
                if((nota2 < 0) || (nota2 >10))
                {
                    System.out.println("nota invalida");
                }
                else
                {
                    nota2OK = true;
                }
            }
            media = (nota1 + nota2)/2;            
        }
        System.out.println("media = " + media);

        entrada.close();
    }   
}
