package playerTests;

import MyPackage.Players.Cleric;
import MyPackage.Players.Druid;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DruidTest {

    Druid druid;

    @Before
    public void before(){
        druid = new Druid(750, 25, "Herbs");
    }

    @Test
    public void hasHealth(){
        assertEquals(750, druid.getHealthPoints());
    }

    @Test
    public void hasArmour(){
        assertEquals(25, druid.getArmour());
    }


    @Test
    public void hasHealing(){
        assertEquals("Herbs", druid.getHealingTool());
    }
}
