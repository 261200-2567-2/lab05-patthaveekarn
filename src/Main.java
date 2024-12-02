// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        RPGCharacter warrior = new paladin("Conan", 100, 50);
        RPGCharacter mage = new wizard("Merlin", 80, 100);

        accessory necklace = new necklace();
        accessory ring = new ring();

        warrior.attack(mage);
        mage.attack(warrior);

        warrior.useMana(10);
        mage.useMana(20);

        necklace.applyEffect(warrior);
        ring.useSkill(warrior);

        System.out.println("\nFinal Status:");
        warrior.showStatus();
        mage.showStatus();
    }
}