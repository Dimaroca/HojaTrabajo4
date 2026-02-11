package StackComponents;

/**
 * Generic Stack interface that defines basic stack operations.
 *
 * @param <T> the type of elements stored in the stack
 */
public interface Stack<T>{
    public void push(T item);
    public T pop();
    public T peek();
}
