package StackComponents;

/**
 * Generic stack implementation based on an array.
 * <p>
 * This class implements the {@link Stack} interface and provides
 * basic stack operations such as push, pop, and peek.
 * </p>
 *
 * @param <T> the type of elements stored in the stack
 */

public class StackO<T> implements Stack<T> {
    private T[] items;
    private int top = 0;

    @SuppressWarnings("unchecked")
    public void setItems(int capacity) {
        this.items = (T[]) new Object[capacity];
        this.top = 0;
    }

    @Override
    public void push(T item) {
        if (top == items.length) {
            throw new StackOverflowError("Pila llena");
        }
        items[top++] = item;
    }

    @Override
    public T pop() {
        if (top == 0) {
            throw new IllegalStateException("La pila esta vacia");
        }
        T item = items[--top];
        items[top] = null;
        return item;
    }

    @Override
    public T peek() {
        if (top == 0) {
            throw new IllegalStateException("La pila esta vacia");
        }
        return items[top - 1];
    }
}