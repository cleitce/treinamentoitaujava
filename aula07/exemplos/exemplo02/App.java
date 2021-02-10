package exemplos.exemplo02;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(0,4);   // exemplo com (posição onde o valor será adicionado, valor adicionado)

        System.out.print(lista);
        System.out.println("Segundo elemento da lista: " + lista.get(2));
        System.out.println("Size da lista: " + lista.size());

        System.out.println("Exemplo com FOR:");
        for(int x = 0; x < lista.size(); x++){
            System.out.println("Elemento: " + lista.get(x));
        }

        System.out.println("Exemplo para achar valor com FOR:");
        for(int x = 0; x < lista.size(); x++){
            System.out.println("Elemento: " + lista.get(x));
            if(lista.get(x) == 2){
                System.out.println("Achei o valor: " + x);
                break;
            }
        }

        System.out.println("Exemplo com a variavel 'item' no FOR:");
        for (Integer item : lista) {
            System.out.println("Elmento variavel item: " + item);
        }

        System.out.println("Exemplo com método ForEach do ArraList:");
        lista.forEach((x) -> {
            System.out.println("Elemento ForEach: " + x);
        });

    }
}
