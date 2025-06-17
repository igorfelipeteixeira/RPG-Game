package RPG.Characters;

public abstract class Character {

    private String name;
    private int health;
    private int attack;
    private int defense;
    private boolean isDefending;

    abstract boolean isAlive();
    abstract int takeDamage(int amount);
    abstract int takeTurn();
    abstract void action(Character opponent, int action);
    abstract void defend();

    public Character() {
    }

    public Character(String name, int health, int attack, int defense, boolean isDefending) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.isDefending = isDefending;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public boolean getIsDefending() {
        return isDefending;
    }

    public void setIsDefending(boolean isDefending) {
        this.isDefending = isDefending;
    }
}
