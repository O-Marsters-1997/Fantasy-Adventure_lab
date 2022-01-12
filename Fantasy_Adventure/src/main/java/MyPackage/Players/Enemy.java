package MyPackage.Players;

public class Enemy {
    private String name;
    private int healthPoints;
    private int attack;


    public Enemy(String name, int healthPoints, int attack){
        this.name = name;
        this.healthPoints = healthPoints;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getAttack() {
        return attack;
    }
}
