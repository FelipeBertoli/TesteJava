package orientacaoobjetos.npraum;

public class CompraTeste {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente = "João";
        c1.addItem(new Item("Caneta", 20, 7.45));
        c1.addItem(new Item("Borracha", 12, 3.50));
        c1.addItem(new Item("Caderno", 3, 18.79));


    System.out.println(c1.getValorTotal());
    }
}
