import java.util.Scanner;

public class SwitchSemBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        int idade = sc.nextInt();
        sc.close();

        switch (idade) {
            case 3:
                System.out.println("-> Sabe falar!");
            case 2:
                System.out.println("-> Sabe andar!");
            case 1:
                System.out.println("-> Sabe respirar!");
        }
    }
}
