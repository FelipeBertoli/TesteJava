package lambdas;
import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Carlos", "Daniel");

        System.out.println("-> Forma tradicional...");
        for(String aprovado: aprovados) {
            System.out.println(aprovado);
        }

        System.out.println("\n-> Lambda #01...");
        aprovados.forEach((aprovado) -> {System.out.println(aprovado);});

        System.out.println("\n-> Method Referece #02...");
        aprovados.forEach(System.out::println);

        System.out.println("\n-> Lambda #02...");
        aprovados.forEach(aprovado -> show(aprovado));

        System.out.println("\n->  Method Reference #02...");
        aprovados.forEach(Foreach::show);

    }

    static void show(String nome) {
        System.out.println("Meu nome é " + nome);
    }
}
