package StackElements;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class NumberOperatorTest {
    @Test
    public void testConvert() {
        NumberOperator numberOperator = new NumberOperator();
        numberOperator.convert("3 + 4 * 2 / ( 2 - 5 )");
        assertArrayEquals(new String[]{"3", "4", "2", "*", "2", "5", "-", "/", "+"},
                numberOperator.postfix.toArray());
    }
}
