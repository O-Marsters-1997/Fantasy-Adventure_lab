package MyPackage;

public abstract class Player {

        int healthPoints;
        int armour;


    public Player(int healthPoints, int armour) {
        this.healthPoints = healthPoints;
        this.armour = armour;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getArmour() {
        return armour;
    }


}
