package StackElements;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
/**
 * Unit tests for the {@link NumberOperator} class.
 *
 * <p>This test verifies that the convert method correctly transforms
 * an infix mathematical expression into postfix notation
 * (Reverse Polish Notation).</p>
 */
public class NumberOperatorTest {
    @Test
    public void testConvert() {
        NumberOperator numberOperator = new NumberOperator();
        numberOperator.convert("3 + 4 * 2 / ( 2 - 5 )");
        assertArrayEquals(new String[]{"3", "4", "2", "*", "2", "5", "-", "/", "+"},
                numberOperator.postfix.toArray());
    }
}
