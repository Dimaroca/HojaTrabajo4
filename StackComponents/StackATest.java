package StackComponents;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test class for {@link StackOperatorArrayList}.
 * <p>
 * This class tests the basic stack operations: push, pop, and peek,
 * using an {@code ArrayList} as the underlying data structure.
 * </p>
 */

public class StackATest {
    private StackA<Integer> stack;

    @Before
    public void setUp(){
        stack = new StackA<Integer>(new java.util.ArrayList<Integer>());
    }

    @Test
    public void testPeek() {
        stack.push(1);
        stack.push(2);
        int topItem = stack.peek();
        Assert.assertEquals(2, topItem);
    }

    @Test
    public void testPop() {
        stack.push(1);
        stack.push(2);
        int poppedItem = stack.pop();
        Assert.assertEquals(2, poppedItem);
        Assert.assertEquals(1, stack.items.size());
    }

    @Test
    public void testPush() {
        stack.push(1);
        stack.push(2);
        stack.pop();
        Assert.assertEquals(1, stack.items.size());

    }
}