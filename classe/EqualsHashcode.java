package classe;

public class EqualsHashcode {
    public static void main(String[] args) {
        Print print = new Print();
        Usuario u1 = new Usuario();

        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@email.com";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva@email.com";

        print.s(u1.nome == u2.nome);
        print.s(u1.equals(u2));

    }
}
