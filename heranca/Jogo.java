package heranca;

public class Jogo {
    public static void main(String[] args) {
        Heroi heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 11;

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;
        // j2.y == 12 --> Falso

        System.out.println("VIDA DO HEROI: " + heroi.vida);
        System.out.println("VIDA DO MONSTRO: " + monstro.vida);

        heroi.atacar(monstro);
        monstro.atacar(heroi);

        heroi.andar(Direcao.NORTE); // DESVIA 
        monstro.atacar(heroi);

        System.out.println("VIDA DO HEROI: " + heroi.vida);
        System.out.println("VIDA DO MONSTRO: " + monstro.vida);

    }
}
