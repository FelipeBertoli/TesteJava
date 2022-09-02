package streams;
import java.util.*;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        FAluno a1 = new FAluno("Ana", 7.8);
        FAluno a2 = new FAluno("Bia", 7.2);
        FAluno a3 = new FAluno("Carlos", 8.3);
        FAluno a4 = new FAluno("Daniel", 10.0);

        List<FAluno> alunos = Arrays.asList(a1, a2, a3, a4);
        Predicate<FAluno> aprovado = a -> a.nota >= 7;
        Predicate<FAluno> reprovado = aprovado.negate();

        System.out.println(alunos.stream().allMatch(aprovado)); // AND
        System.out.println(alunos.stream().anyMatch(aprovado)); // OR
        System.out.println(alunos.stream().noneMatch(reprovado)); // NOR
    }
}
