package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Reduce3 {
    public static void main(String[] args) {
        FAluno a1 = new FAluno("Ana", 7.8);
        FAluno a2 = new FAluno("Bia", 5.8);
        FAluno a3 = new FAluno("Carlos", 9.8);
        FAluno a4 = new FAluno("Daniel", 6.8);
        FAluno a5 = new FAluno("Erick", 10.0);

        List<FAluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
        Predicate<FAluno> aprovado = a -> a.nota >= 7;
        Function<FAluno, Double> apenasNota = a -> a.nota;
        BiFunction<Media, Double, Media> calcularMedia = 
                (media, nota) -> media.adicionar(nota);
        BinaryOperator<Media> combinarMedia = 
                (m1, m2) -> Media.combinar(m1, m2);

        Media media = alunos.parallelStream()
            .filter(aprovado)
            .map(apenasNota)
            .reduce(new Media(), calcularMedia, combinarMedia);

        System.out.println("A media da turma é: " + media.getValor());
    }
}
