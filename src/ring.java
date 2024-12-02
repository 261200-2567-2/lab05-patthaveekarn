public class ring implements accessory {
    private String accessoryName = "ring";

    @Override
    public String getAccessoryName() {
        return accessoryName;
    }

    @Override
    public void applyEffect(RPGCharacter character) {
        System.out.println(accessoryName + " recover " + character.getName());
        character.recoverMana(20); // Recover mana as an effect
    }

    @Override
    public void useSkill(RPGCharacter target) {
        System.out.println("ring has no skill to use!");
    }
}


