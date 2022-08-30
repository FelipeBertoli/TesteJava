package orientacaoobjetos.npran;

import java.util.ArrayList;

public class Aluno {
    
    final String nome;
    ArrayList<Curso> cursos = new ArrayList<Curso>();

    Aluno(String nome){
        this.nome = nome;
    }
    
    void addCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    Curso obterCurso(String nome) {
        for(Curso curso: this.cursos) {
            if(curso.nome.equalsIgnoreCase(nome)) {
                return curso;
            }
        }
        return null;
    }
}
