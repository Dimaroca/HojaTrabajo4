package StackElements;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class StackVectorTest {

    @Test
    public void testPeek() {

        StackVector<Integer> stack = new StackVector<>();
        stack.setItems(5);
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        assertEquals(Integer.valueOf(4), stack.peek());
    }

    @Test
    public void testPop() {
        StackVector<Integer> stack = new StackVector<>();
        stack.setItems(5);
        stack.push(7);
        stack.push(2);
        stack.pop();
        assertEquals(Integer.valueOf(7), stack.peek());
    }

    @Test
    public void testPush() {
        StackVector<Integer> stack = new StackVector<>();
        stack.setItems(5);
        stack.push(1);
        assertNotEquals(Integer.valueOf(0), stack.peek());

    }

    @Test
    public void testSetItems() {

        StackVector<Integer> stack = new StackVector<>();
        stack.setItems(5);
        for (int i = 0; i < 10; i++) {
            try {
                stack.push(i);
            } catch (StackOverflowError e) {
                assertEquals("Pila llena", e.getMessage());
            }
        }
    }
}
