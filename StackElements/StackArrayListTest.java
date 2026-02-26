package StackElements;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;

import org.junit.Test;

public class StackArrayListTest {
    @Test
    public void testPeek() {
        StackArrayList<Integer> stack = new StackArrayList<>(new ArrayList<Integer>());
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        assertEquals(Integer.valueOf(4), stack.peek());
    }

    @Test
    public void testPop() {
        StackArrayList<Integer> stack = new StackArrayList<>(new ArrayList<Integer>());
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        stack.pop();
        assertEquals(Integer.valueOf(3), stack.peek());
    }

    @Test
    public void testPush() {
        StackArrayList<Integer> stack = new StackArrayList<>(new ArrayList<Integer>());
        stack.push(1);
        assertNotEquals(Integer.valueOf(0), stack.peek());

    }
}
