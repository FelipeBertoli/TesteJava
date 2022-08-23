import javax.swing.JOptionPane;

public class Metodos {

    public static String print(String string){
        return JOptionPane.showInputDialog(null, string);
    }

    public static void show(String string){
        System.out.println(string);
    }



    public static void main(String[] args) {
        String valor = print("Digite o valor:");
        int num = Integer.parseInt(valor);

        if(num % 2 == 0) {
            show("Número par!");

        } else{
            show("Número ímpar!");
        }
    }
}
