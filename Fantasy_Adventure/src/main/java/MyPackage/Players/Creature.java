package MyPackage.Players;

public class Creature {

    private String name;
    private int attack;

    public Creature(String name, int attack) {
        this.name = name;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }
}
