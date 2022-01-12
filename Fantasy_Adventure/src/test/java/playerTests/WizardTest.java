package playerTests;

import MyPackage.Players.SpellType;
import MyPackage.Players.Warlock;
import MyPackage.Players.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before(){
        wizard = new Wizard(500, 15, 60, SpellType.FIRE, "Eagle");
    }

    @Test
    public void hasHealth(){
        assertEquals(500, wizard.getHealthPoints());
    }

    @Test
    public void hasArmour(){
        assertEquals(15, wizard.getArmour());
    }

    @Test
    public void hasAttack(){
        assertEquals(60, wizard.getAttack());
    }


    @Test
    public void hasSpell(){
        assertEquals(SpellType.FIRE, wizard.getSpellType());
    }

    @Test
    public void hasCreature(){
        assertEquals("Eagle", wizard.getCreature());
    }
}
