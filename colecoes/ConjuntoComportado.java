package colecoes;

import java.util.*;

public class ConjuntoComportado {
  
    public static void main(String[] args) {

        Set<String> lista = new HashSet<>();
        lista.add("Carlos");
        lista.add("Ana");
        lista.add("Lucas");
        lista.add("Ana");
        lista.add("Pedro");

        for(String candidato: lista) {
            System.out.println(candidato);
        }

        SortedSet <Integer> nums = new TreeSet<>();
        nums.add(2);
        nums.add(1);
        nums.add(123);
        nums.add(3);
        
        for(int n: nums) {
            System.out.println(n);
        }
    }
}
