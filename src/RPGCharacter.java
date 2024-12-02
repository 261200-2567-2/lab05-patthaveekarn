public interface RPGCharacter {
    String getName();
    int getHealth();
    int getMana();
    void attack(RPGCharacter target);
    void useMana(int amount);
    void recoveyHealth(int amount);
    void recoverMana(int amount);
    void takeDamage(int damage);
    void showStatus();
}
