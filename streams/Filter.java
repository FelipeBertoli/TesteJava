package streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Arrays;

public class Filter {
    public static void main(String[] args) {
        FAluno a1 = new FAluno("Ana", 7.8);
        FAluno a2 = new FAluno("Bia", 5.8);
        FAluno a3 = new FAluno("Carlos", 9.8);
        FAluno a4 = new FAluno("Daniel", 6.8);
        FAluno a5 = new FAluno("Erick", 7.1);

        List<FAluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
        Predicate<FAluno> aprovados = a -> a.nota >= 7;
        Function<FAluno, String> saudacao = 
                    a -> "Parabéns " + a.nome + "! Você foi aprovado(a)";

        alunos.stream()
        .filter(aprovados)
        .map(saudacao)
        .forEach(System.out::println);
    }
}
