package MyPackage.Players;

import MyPackage.Behaviours.IFight;
import MyPackage.Player;

public abstract class RangedFighter extends Player implements IFight {

    private int attack;
    private SpellType spellType;
    private String creature;

    public RangedFighter(int healthPoints, int armour, int attack, SpellType spellType, String creature) {
        super(healthPoints, armour);
        this.attack = attack;
        this.spellType = spellType;
        this.creature = creature;
    }

    public int getAttack() {
        return attack;
    }

    public SpellType getSpellType() {
        return spellType;
    }

    public String getCreature() {
        return creature;
    }

    public void fight() {

    }
}
