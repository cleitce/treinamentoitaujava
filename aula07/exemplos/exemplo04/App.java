package exemplos.exemplo04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        String texto;

        try{
            System.out.print("Digite um número: ");
            //num = entrada.nextInt();
            texto = entrada.nextLine();
            num = Integer.parseInt(texto);
            System.out.println("Você digitou o número:" + num);
        }
        catch(InputMismatchException ex){
            System.out.println("Entrada inválida!");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        /*catch(NumberFormatException ex)
        {
            System.out.println("Número inválido!");
            System.out.println("Mensagem de Erro: " + ex.getMessage());
            ex.printStackTrace();           
        }*/
        catch(Exception ex)
        {
            System.out.println("Erro na entrada dos dados!");
            System.out.println("Mensagem de Erro: " + ex.getMessage());
            ex.printStackTrace();            
        }
        finally{
            entrada.close();
        }
      

    }
}
