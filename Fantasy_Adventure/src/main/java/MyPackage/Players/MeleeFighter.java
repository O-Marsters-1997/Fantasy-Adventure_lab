package MyPackage.Players;

import MyPackage.Behaviours.IFight;
import MyPackage.Player;
import MyPackage.WeaponType;

public abstract class MeleeFighter extends Player implements IFight {

    private int attack;
    private WeaponType weaponType;


    public MeleeFighter(int healthPoints, int armour, int attack, WeaponType weaponType) {
        super(healthPoints, armour);
        this.attack = attack;
        this.weaponType = weaponType;
    }

    public int getAttack() {
        return attack;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void fight() {
    }
}
