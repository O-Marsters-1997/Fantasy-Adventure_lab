package playerTests;

import MyPackage.Players.Cleric;
import MyPackage.Players.SpellType;
import MyPackage.Players.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {


    Cleric cleric;

    @Before
    public void before(){
        cleric = new Cleric(750, 60, "Medicine");
    }

    @Test
    public void hasHealth(){
        assertEquals(750, cleric.getHealthPoints());
    }

    @Test
    public void hasArmour(){
        assertEquals(60, cleric.getArmour());
    }



    @Test
    public void hasHealing(){
        assertEquals("Medicine", cleric.getHealingTool());
    }

}
