package streams;

public class FAluno {
    
    final String nome;
    final double nota;
    final boolean bomComportamento;

    public FAluno(String nome, double nota) {
        this(nome, nota, true);
    }

    public FAluno(String nome, double nota, boolean bomComportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }

    public String toString(){
        return nome + " tem nota " + nota;
    }
}
