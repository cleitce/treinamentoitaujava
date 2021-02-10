package exercicios;

import java.io.Console;
//import java.util.Scanner;

public class Exercicio05 {
   public static void main(String[] args) {
       //Scanner entrada = new Scanner(System.in);

       //System.out.print("Digite a senha: ");
       //String password = entrada.nextLine();

       Console console = System.console();
       String password = new String(console.readPassword("Digite a senha: "));

       if(password.equals("R10p5")){
            System.out.println("Acesso concedido!");
       } else {
            System.out.println("Acesso negado!");
       }

       //entrada.close();
   } 
}
