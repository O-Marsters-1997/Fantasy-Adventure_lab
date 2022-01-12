package MyPackage.Players;

public enum SpellType {

    FIRE(1),
    ICE(2),
    SPARKS(3);

    private final int value;

    SpellType(int value) {
        this.value = value;
    }

    public int getValue(){
        return  this.value;
    }
}
