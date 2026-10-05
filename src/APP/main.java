import APP.Combate;
import Seres.Monstro;
import Seres.Player;

public static void main (String[] args) {

    Player jogador = new Player();
    Monstro slime = new Monstro();
    Combate combate = new Combate();

     do {

        combate.realizarAtaque(jogador, slime);

        if (slime.getVida() > 0) {

            combate.realizarAtaque(slime, jogador);
        }

    } while (jogador.getVida() > 0 && slime.getVida() > 0);

        System.out.println("\n=== FIM DA BATALHA ===");
}


