package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;
        List<String> marcas = Arrays.asList("bmw ", "audi ", "honda ");

        marcas.stream().map(m -> m.toUpperCase()).forEach(print);
        
        System.out.println("\n-> USANDO COMPOSIÇÃO...");
        marcas.stream()
        .map(Utilitarios.maiuscula)
        .map(Utilitarios.primeiraLetra)
        .forEach(print);
    }
}
