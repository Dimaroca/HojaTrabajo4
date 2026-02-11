package CalculatorComponents;

import org.junit.Test;

/**
 * Unit test class for the {@link Calculator} class.
 * <p>
 * This class verifies the correct behavior of the
 * {@code Operate} method using predefined input expressions.
 * </p>
 */

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void testOperate() {
        String input = "3 4 + 2 * 7 /";
        double result = calculator.Operate(input);
        assert result == 2.0 : "Expected 2.0 but got " + result;
    }
}
