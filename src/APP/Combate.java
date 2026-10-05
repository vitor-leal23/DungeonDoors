package APP;

import Seres.Monstro;
import Seres.Player;

public class Combate {

    public void realizarAtaque(Player atacante, Monstro defensor) {
        if (defensor.getVida() > 0) {
            int novaVida = defensor.getVida() - atacante.getDano();
            defensor.setVida(novaVida);

            System.out.println("\n [TURNO DO JOGADOR]");
            System.out.println("O Jogador atacou");
            System.out.println("Vida do Jogador: " + atacante.getVida() + "\n Vida do Monstro: " + defensor.getVida());
        }
        pausar();
    }

    public void realizarAtaque(Monstro atacante, Player defensor) {
        if (defensor.getVida() > 0) {
            int novaVida = defensor.getVida() - atacante.getDano();
            defensor.setVida(novaVida);

            System.out.println("\n [TURNO DO MONSTRO]");
            System.out.println("O Monstro atacou");
            System.out.println("Vida do Jogador: " + defensor.getVida() + "\n Vida do Monstro: " + atacante.getVida());
        }
        pausar();

    }

    public void pausar(){

        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println("Erro na pausa ");
        }
    }

}
