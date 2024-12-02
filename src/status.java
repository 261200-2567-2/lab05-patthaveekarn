public class status implements RPGCharacter{
    protected String Name = "   ";
    protected int max_Hp ;
    protected int Hp_RPG ;
    protected int max_Mana ;
    protected int Mana_RPG ;
    protected boolean isring = false;
    protected boolean isnecklace = false;
    protected int Atk ;
    protected int Def ;
    protected boolean isDead = false;

    public void Attacked(paladin names) {
        if(isDead){System.out.println("Dead");}
        int result = this.Atk - names.Def;
        System.out.println(result);
        if(result >0){
            names.Hp_RPG -= result;
        }else{
            System.out.println("Block");
        }
        if(names.Hp_RPG <0){
            names.isDead = true;
            names.Hp_RPG = 0;
        }
    }

    public void Attacked(wizard names) {
        if(isDead){System.out.println("Dead");}
        int result = this.Atk - names.Def;
        if(result >0){
            names.Hp_RPG -= result;
        }else{
            System.out.println("Block");
        }
        if(names.Hp_RPG < 0){
            names.isDead = true;
            names.Hp_RPG =0;
        }
    }

    public void Show_detail() {
        System.out.println("--------------------------------------------------");
        System.out.println(this.Name);
        System.out.println("Hp/Hp: " + this.Hp_RPG + "/" + this.max_Hp);
        System.out.println("Mana/Mana: " + this.Mana_RPG + "/" + this.max_Mana);
        System.out.println("Atk: " + this.Atk);
        System.out.println("Def: " + this.Def);
        System.out.println("--------------------------------------------------");
    }

    public void Equipnecklace(necklace necklace) {
        if(!isnecklace){
            this.isnecklace = true;
            this.Atk += necklace.Atk;
            this.Def += necklace.Def;
        }
        necklace.Skill();
    }

    public void Equipring(ring ring) {
        if(!isring){
            this.isring = true;
            this.Hp_RPG += ring.Hp;
            this.max_Hp += ring.Hp;
            this.Atk += ring.Atk;
            this.Def += ring.Def;
        }
        ring.Skill();
    }
}
