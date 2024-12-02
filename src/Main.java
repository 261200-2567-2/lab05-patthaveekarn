// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        // Create characters
        RPGCharacter warrior = new paladin("Conan", 100, 50);
        RPGCharacter mage = new wizard("Merlin", 80, 100);

        // Create accessories
        accessory necklace = new necklace();
        accessory ring = new ring();

        // Simulate interactions
        warrior.attack(mage);
        mage.attack(warrior);

        warrior.useMana(10);
        mage.useMana(20);

        necklace.applyEffect(warrior);
        ring.applyEffect(warrior);

        System.out.println("\nStatus:");
        warrior.showStatus();
        mage.showStatus();
    }
}