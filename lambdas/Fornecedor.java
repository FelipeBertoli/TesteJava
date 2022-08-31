package lambdas;

import java.util.*;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {
         Supplier<List<String>> lista  = () -> Arrays.asList("Ana", "Bia", "Carlos");

         System.out.println(lista.get());
    }
} 
