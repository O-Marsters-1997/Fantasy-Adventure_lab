package MyPackage.Players;

import MyPackage.Behaviours.IHeal;
import MyPackage.Player;

public abstract class Healer extends Player implements IHeal {

    private String healingTool;

    public Healer(int healthPoints, int armour, String healingTool) {
        super(healthPoints, armour);
        this.healingTool = healingTool;
    }

    public String getHealingTool() {
        return healingTool;
    }

    public void heal(){

    }
}
