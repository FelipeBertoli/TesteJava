package colecoes;

import java.util.Map;
import java.util.HashMap;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto");
        usuarios.put(2, "Alice");
        usuarios.put(3, "Oliver");

        for(int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        System.out.println();

        for(String valor: usuarios.values()){
            System.out.println(valor);
        }

        System.out.println();

        for(java.util.Map.Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.print(registro.getKey() + " => ");
            System.out.println(registro.getValue());
        }

    }
}
