package streams;
import java.util.function.UnaryOperator;

public class Utilitarios {
    final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
    final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + " ";
}
