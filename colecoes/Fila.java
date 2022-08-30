package colecoes;

import java.util.*;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Ana"); // Retorna falso quando a fila está cheia
        fila.offer("Bia"); // Lança uma exceção quando a fila está cheia
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafael");
        fila.offer("Guilherme");

        System.out.println(fila); // Retorna nulo se a fila estiver vazia
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Lança uma exceção
        System.out.println(fila.element());
        System.out.println(fila.poll()); // Imprime pela ordem
        System.out.println(fila.poll());
    }
}
