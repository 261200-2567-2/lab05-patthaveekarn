public class wizard implements RPGCharacter{
    private final String name;
    private int health;
    private int mana;

    public wizard(String name, int health, int mana) {
        this.name = name;
        this.health = health;
        this.mana = mana;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public void attack(RPGCharacter target) {
        System.out.println(name + " casts a fireball at " + target.getName());
        target.takeDamage(15);
    }

    @Override
    public void useMana(int amount) {
        if (mana >= amount) {
            mana -= amount;
            System.out.println(name + " uses " + amount + " mana. Remaining mana: " + mana);
        } else {
            System.out.println(name + " does not have enough mana!");
        }
    }

    @Override
    public void recoveyHealth(int amount) {

    }

    @Override
    public void recoverMana(int amount) {
        mana += amount;
        System.out.println(name + " recovers " + amount + " mana. Current mana: " + mana);
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " takes " + damage + " damage! Remaining health: " + health);
    }
    @Override
    public void showStatus() {
        System.out.println("Status of " + name + ": Health = " + health + ", Mana = " + mana);
    }

}



