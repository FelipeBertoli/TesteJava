package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<String>();

        livros.add("Senhor dos Anéis");
        livros.push("Deuses Americanos");
        livros.offer("Jogos Vorazes");

        System.out.println(livros.poll());
        System.out.println(livros.poll());
                System.out.println(livros.poll());
    }
}
