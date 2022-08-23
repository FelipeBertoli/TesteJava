import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String conceito = "";

        System.out.print("Informe a nota: ");
        int nota = sc.nextInt();
        sc.close();

        switch (nota) {
            case 10: 
                conceito = "S";
                break;
            case 9: case 8:
                conceito = "A";    
                break;
            case 7: 
                conceito = "B";    
                break;  
            case 6: case 5:
                conceito = "C";    
                break;  
            case 4: case 3:
                conceito = "D";    
                break;
            case 2: case 1: case 0:
                conceito = "E";    
                break;    
            default:
                conceito = "inválido";
        }
        System.out.println("Conceito é " + conceito);
    }
}
