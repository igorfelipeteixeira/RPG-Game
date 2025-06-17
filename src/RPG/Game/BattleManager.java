package RPG.Game;

import RPG.Characters.Enemy;
import RPG.Characters.Player;

public class BattleManager {

   private Player player;
   private Enemy enemy;

    public BattleManager() {
    }

    public BattleManager(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public void startBattle() {
        System.out.println("The Battle starts!");
        int round = 1;

        while (player.isAlive() && enemy.isAlive()) {

            System.out.println("Round " + round);

            int playerAction = player.takeTurn();
            int enemyAction = enemy.takeTurn();

            player.action(enemy, playerAction);
            if (!enemy.isAlive()) {
                System.out.println(enemy.getName() + " defeated!");
                System.out.println(player.getName() + " wins!");
                break;
            }

            enemy.action(player, enemyAction);
            if (!player.isAlive()) {
                System.out.println(player.getName() + " defeated!");
                System.out.println(enemy.getName() + " wins!");
                break;
            }

            System.out.println(player.getName() + " Health: " + player.getHealth());
            System.out.println(enemy.getName() + " Health: " + enemy.getHealth());

            System.out.println("------------------------------");

            round++;
        }
    }
}
