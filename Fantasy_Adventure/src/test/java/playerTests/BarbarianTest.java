package playerTests;

import MyPackage.Player;
import MyPackage.Players.Barbarian;
import MyPackage.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian(500, 25, 50, WeaponType.AXE);
    }

    @Test
    public void hasHealth(){
        assertEquals(500, barbarian.getHealthPoints());
    }

    @Test
    public void hasArmour(){
        assertEquals(25, barbarian.getArmour());
    }

    @Test
    public void hasAttack(){
        assertEquals(50, barbarian.getAttack());
    }


    @Test
    public void hasWeapon(){
        assertEquals(WeaponType.AXE, barbarian.getWeaponType());
    }

}
