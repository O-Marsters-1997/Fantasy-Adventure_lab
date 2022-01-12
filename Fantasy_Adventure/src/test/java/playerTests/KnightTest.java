package playerTests;

import MyPackage.Players.Barbarian;
import MyPackage.Players.Knight;
import MyPackage.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before(){
        knight = new Knight(500, 65, 30, WeaponType.SWARD);
    }

    @Test
    public void hasHealth(){
        assertEquals(500, knight.getHealthPoints());
    }

    @Test
    public void hasArmour(){
        assertEquals(65, knight.getArmour());
    }

    @Test
    public void hasAttack(){
        assertEquals(30, knight.getAttack());
    }


    @Test
    public void hasWeapon(){
        assertEquals(WeaponType.SWARD, knight.getWeaponType());
    }
}
