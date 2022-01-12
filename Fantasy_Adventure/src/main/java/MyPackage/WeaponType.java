package MyPackage;

public enum WeaponType {

    SWARD(1),
    AXE(2),
    CLUB(3);

    private final int value;

    WeaponType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
