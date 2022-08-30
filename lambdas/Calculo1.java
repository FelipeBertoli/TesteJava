package lambdas;

public class Calculo1 {
    
    public static void main(String[] args) {
        
        Calculo calculo = new Soma();

        System.out.println(calculo.executar(2, 3));

        calculo = new Multiplicacao();
        
        System.out.println(calculo.executar(2, 3));

    }

}
