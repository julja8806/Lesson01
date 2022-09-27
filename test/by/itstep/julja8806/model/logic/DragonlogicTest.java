package by.itstep.julja8806.model.logic;
import static org.junit.Assert.*;
import by.itstep.julja8806.model.data.Dragon;
import org.junit.Assert;
import org.junit.Test;

public class DragonlogicTest {

    @Test
    public void testFirstPeriodPositive() {
        Dragon dragon = new Dragon();
        dragon.age = 10;
        int expected = 33;

        int actual = DragonLogic.calculateDragonHeads(dragon);
       assertEquals(expected, actual);
    }
    @Test
    public void testFirstPeriodNegative() {
        Dragon dragon = new Dragon();
        dragon.age = -10;
        int expected = -1;

        int actual = DragonLogic.calculateDragonHeads(dragon);
        assertEquals(expected, actual);
    }
    @Test
    public void testFirstBoundPositive() {
        Dragon dragon = new Dragon();
        dragon.age = DragonLogic.First_Period;
        int expected = 303;

        int actual = DragonLogic.calculateDragonHeads(dragon);
        assertEquals(expected, actual);
    }
    @Test
    public void testSecondBoundPositive() {
        Dragon dragon = new Dragon();
        dragon.age = DragonLogic.Second_Period;
        int expected = 503;

        int actual = DragonLogic.calculateDragonHeads(dragon);
        assertEquals(expected, actual);
    }
}
