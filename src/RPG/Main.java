package RPG;

import RPG.Characters.Enemy;
import RPG.Characters.Player;
import RPG.Game.BattleManager;

public class Main {
    public static void main(String[] args) {

        Player player = new Player("Shikamaru Nara", 100, 25, 10, false);
        Enemy enemy = new Enemy("Hidan", 100, 30, 20, false);

        BattleManager battleManager = new BattleManager(player, enemy);
        battleManager.startBattle();
    }
}
