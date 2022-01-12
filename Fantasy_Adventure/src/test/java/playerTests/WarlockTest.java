package playerTests;

import MyPackage.Players.Barbarian;
import MyPackage.Players.SpellType;
import MyPackage.Players.Warlock;
import MyPackage.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;

    @Before
    public void before(){
        warlock = new Warlock(500, 15, 60, SpellType.ICE, "Wyvern");
    }

    @Test
    public void hasHealth(){
        assertEquals(500, warlock.getHealthPoints());
    }

    @Test
    public void hasArmour(){
        assertEquals(15, warlock.getArmour());
    }

    @Test
    public void hasAttack(){
        assertEquals(60, warlock.getAttack());
    }


    @Test
    public void hasSpell(){
        assertEquals(SpellType.ICE, warlock.getSpellType());
    }

    @Test
    public void hasCreature(){
        assertEquals("Wyvern", warlock.getCreature());
    }
}
