package StackElements;
/**
 * Generic Stack interface that defines the basic operations
 * for a Last-In, First-Out (LIFO) data structure.
 *
 * @param <T> the type of elements stored in the stack
 */
public interface Stack<T>{
    public void push(T item);
    public T pop();
    public T peek();
    public boolean isEmpty();
}