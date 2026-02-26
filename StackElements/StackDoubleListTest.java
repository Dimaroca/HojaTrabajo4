package StackElements;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StackDoubleListTest {
    @Test
    public void testPeek() {
        StackDoubleList<Integer> stack = new StackDoubleList<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        assertEquals(Integer.valueOf(4), stack.peek());
        stack.pop();
        assertEquals(Integer.valueOf(3), stack.peek());
    }

    @Test
    public void testPop() {
        StackDoubleList<Integer> stack = new StackDoubleList<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        assertEquals(Integer.valueOf(4), stack.pop());
        assertEquals(Integer.valueOf(3), stack.peek());
    }

    @Test
    public void testPush() {
        StackDoubleList<Integer> stack = new StackDoubleList<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        assertEquals(Integer.valueOf(4), stack.peek());
        assertEquals(Integer.valueOf(0), stack.getTail().dato);

    }
}
