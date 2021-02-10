package uri;

import java.util.Scanner;

public class Uri1114 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int password = 0;
        Boolean senhaOK = false;

        while (senhaOK == false) {
            //System.out.print("Digite o " + cont + "º valor: ");
            password = entrada.nextInt();

            if(password != 2002){
                System.out.println("Senha Invalida");
            } else {
                System.out.println("Acesso Permitido");
                senhaOK = true;                
            }
        } 
        entrada.close();
    }

}
