import MyPackage.Players.Enemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    private Enemy enemy;

    @Before
    public void before(){
        enemy=new Enemy("Golem", 200, 10);
    }

    @Test
    public void enemyHasName(){
        assertEquals("Golem", enemy.getName());
    }

    @Test
    public void enemyHasHealth(){
        assertEquals(200, enemy.getName());
    }

    @Test
    public void enemyHasAttack(){
        assertEquals(10, enemy.getAttack());
    }


}
