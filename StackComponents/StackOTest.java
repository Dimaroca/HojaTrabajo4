package StackComponents;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test class for {@link StackOperator}.
 * <p>
 * This class verifies the correct behavior of the array-based
 * stack implementation, including push, pop, peek,
 * and stack initialization.
 * </p>
 */
public class StackOTest {

    StackO<String> stack = new StackO<String>();

    @Test
    public void testPeek() {
        stack.setItems(2);
        stack.push("1");
        stack.push("2");
        stack.pop();
        stack.push("2");
        Assert.assertEquals("2", stack.peek());

    }

    @Test
    public void testPop() {
        stack.setItems(2);
        stack.push("1");
        stack.push("2");
        String poppedItem = stack.pop();
        Assert.assertEquals("2", poppedItem);
        Assert.assertEquals("1", stack.peek());

    }

    @Test
    public void testPush() {
        stack.setItems(2);
        stack.push("1");
        stack.push("2");
        stack.pop();
        Assert.assertEquals("1", stack.peek());

    }

    @Test
    public void testSetItems() {
        stack.setItems(2);
        stack.push("1");
        stack.push("2");
        stack.pop();
        Assert.assertEquals("1", stack.peek());
    }
}