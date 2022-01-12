package playerTests;

import MyPackage.Players.Barbarian;
import MyPackage.Players.Dwarf;
import MyPackage.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void before(){
        dwarf = new Dwarf(700, 35, 40, WeaponType.AXE);
    }

    @Test
    public void hasHealth(){
        assertEquals(700, dwarf.getHealthPoints());
    }

    @Test
    public void hasArmour(){
        assertEquals(35, dwarf.getArmour());
    }

    @Test
    public void hasAttack(){
        assertEquals(40, dwarf.getAttack());
    }


    @Test
    public void hasWeapon(){
        assertEquals(WeaponType.AXE, dwarf.getWeaponType());
    }
}
