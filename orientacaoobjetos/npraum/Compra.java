package orientacaoobjetos.npraum;

import java.util.ArrayList;

public class Compra {
    
    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    void addItem(Item item) {
        this.itens.add(item);
    }
    
    double getValorTotal(){
        double total = 0;

        for(Item item: itens) {
            total += item.quantidade * item.preco;
        }  
              
        return total;
    }

}
