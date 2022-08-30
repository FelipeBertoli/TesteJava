package colecoes;
import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Carlos");

        lista.add(u1);
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Manu"));
        lista.add(new Usuario("Bia"));

        for(Usuario u: lista) {
            System.out.println(u);
        }

    }
}
