package RPG.Characters;

import java.util.Scanner;

public class Player extends Character {

    public Player() {
    }

    public Player(String name, int health, int attack, int defense, boolean isDefending) {
        super(name, health, attack, defense, isDefending);
    }

    @Override
    public boolean isAlive() {
        if (getHealth() == 0) {
            return false;
        }
        return true;
    }

    @Override
    public void defend() {
        setIsDefending(true);
    }

    @Override
    public int takeDamage(int amount){
        int damageTake = 0;
        if (getIsDefending()) {
            damageTake = amount - getDefense();
        } else {
            damageTake = amount;
        }
        if (damageTake < 0) {
            return 0;
        }

        int newHealth = getHealth();

        newHealth -= damageTake;
        if (newHealth < 0) {
            newHealth = 0;
        }

        setHealth(newHealth);
        return damageTake;
    }

    @Override
    public int takeTurn() {
        setIsDefending(false);

        Scanner scanner = new Scanner(System.in);

        System.out.println("It's your turn! Choose an action:");
        System.out.println("1 - Attack");
        System.out.println("2 - Defend");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();
        return choice;
    }

    @Override
    public void action(Character opponent, int action) {
        switch (action) {
            case 1:
                int damage = getAttack();
                int actualDamage = opponent.takeDamage(damage);
                System.out.println(getName() + " attacks " + opponent.getName() + " for " + actualDamage + " damage.");
                break;
            case 2:
                defend();
                System.out.println(getName() + " is defending and will reduce incoming damage by " + getDefense() + " this turn.");
                break;
            default:
                System.out.println("Invalid choice you lose your turn!");
                break;
        }
    }
}