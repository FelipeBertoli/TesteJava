package streams;
import java.util.*;

public class MinMax {
    public static void main(String[] args) {
        FAluno a1 = new FAluno("Ana", 7.8);
        FAluno a2 = new FAluno("Bia", 7.2);
        FAluno a3 = new FAluno("Carlos", 8.3);
        FAluno a4 = new FAluno("Daniel", 10.0);

        List<FAluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<FAluno> melhorNota = (aluno1, aluno2) -> {
            if(aluno1.nota > aluno2.nota) return 1; 
            if(aluno1.nota < aluno2.nota) return -1; 
            return 0;
        };

        Comparator<FAluno> piorNota = (aluno1, aluno2) -> {
            if(aluno1.nota > aluno2.nota) return -1; 
            if(aluno1.nota < aluno2.nota) return 1; 
            return 0;
        };

        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(piorNota).get());
        
        System.out.println(alunos.stream().min(melhorNota).get());     
        System.out.println(alunos.stream().max(piorNota).get());
    }
}
