package StackElements;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 * Unit tests for the {@link StackSimpleList} class.
 *
 * <p>This test class verifies the correct behavior of the
 * push, pop, and peek operations for a stack implemented
 * using a singly linked list.</p>
 */
public class StackSimpleListTest {
    @Test
    public void testPeek() {
        StackSimpleList<Integer> stack = new StackSimpleList<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        assertEquals(Integer.valueOf(4), stack.peek());
    }

    @Test
    public void testPop() {
        StackSimpleList<Integer> stack = new StackSimpleList<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        stack.pop();
        assertEquals(Integer.valueOf(3), stack.peek());
    }

    @Test
    public void testPush() {
        StackSimpleList<Integer> stack = new StackSimpleList<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        assertEquals(Integer.valueOf(4), (Integer) stack.getHead().dato);

    }
}
