public class necklace implements accessory {
    private String accessoryName = "necklace";

    @Override
    public String getAccessoryName() {
        return accessoryName;
    }

    @Override
    public void applyEffect(RPGCharacter character) {
        System.out.println(accessoryName + " heals " + character.getName());
        character.recoveyHealth(50); // Recover mana as an effect
    }

    @Override
    public void useSkill(RPGCharacter target) {
        System.out.println("necklace has no skill to use!");
    }
}


