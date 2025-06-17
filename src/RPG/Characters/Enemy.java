package RPG.Characters;

import java.util.Random;

public class Enemy extends Character {

    public Enemy() {
    }

    public Enemy(String name, int health, int attack, int defense, boolean isDefending) {
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

        int choice = new Random().nextInt(2);
        if (choice == 1) {
            defend();
        }
        return choice;
    }

    @Override
    public void action(Character opponent, int action) {
         if (action == 0) {
             int damage = getAttack();
             int actualDamage = opponent.takeDamage(damage);
             System.out.println(getName() + " attacks " + opponent.getName() + " for " + actualDamage + " damage.");
         } else {
             System.out.println(getName() + " is defending and will reduce incoming damage by " + getDefense() + " this turn.");
         }
    }
}