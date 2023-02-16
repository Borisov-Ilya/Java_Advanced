package Task4.Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator(1,2,"+");
        calculator.count();
        Assertions.assertEquals(3, calculator.getResult());
    }

    @Test
    void testSubtraction() {
        Calculator calculator = new Calculator(5,4,"-");
        calculator.count();
        Assertions.assertEquals(1, calculator.getResult());
    }

    @Test
    void testMultiplication() {
        Calculator calculator = new Calculator(4,3,"*");
        calculator.count();
        Assertions.assertEquals(12, calculator.getResult());
    }

    @Test
    void testDivision() {
        Calculator calculator = new Calculator(10,5,"/");
        calculator.count();
        Assertions.assertEquals(2, calculator.getResult());
    }

    @Test
    void testDivisionByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculator calculator = new Calculator(10,0,"/");
            calculator.count();
        });
    }
}