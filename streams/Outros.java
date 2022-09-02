package streams;
import java.util.*;

public class Outros {
public static void main(String[] args) {
    FAluno a1 = new FAluno("Ana", 7.8);
    FAluno a2 = new FAluno("Bia", 7.2);
    FAluno a3 = new FAluno("Carlos", 8.3);
    FAluno a4 = new FAluno("Daniel", 10.0);
    FAluno a5 = new FAluno("Erick", 6.0);
    FAluno a6 = new FAluno("Daniel", 9.1);

    List<FAluno> alunos = Arrays.asList(a1, a2, a3, a4);
    
    System.out.println("Distinct...");
    alunos.stream().distinct().forEach(System.out::println);
}
}
