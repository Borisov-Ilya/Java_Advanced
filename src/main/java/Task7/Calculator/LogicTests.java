package Task7.Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogicTests {
    Logic logic = new Logic();

    @Test
    public void testAddition() {
        Assertions.assertEquals(3, logic.getResult(1,2,"+"));
    }

    @Test
    public void testSubtraction() {
        Assertions.assertEquals(7, logic.getResult(10,3,"-"));
    }

    @Test
    public void testMultiplication() {
        Assertions.assertEquals(4, logic.getResult(2,2,"*"));
    }

    @Test
    public void testDivision() {
        Assertions.assertEquals(15, logic.getResult(30,2,"/"));
    }

    @Test
    public void testDivisionOnZero() {
        Assertions.assertEquals(0, logic.getResult(3, 0, "/"));
    }
}