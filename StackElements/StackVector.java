package StackElements;

public class StackVector<T> implements Stack<T> {
    
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

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }
}
