package StackElements;
/**
 * Stack implementation using a singly linked list structure.
 *
 * <p>This class follows the Last-In, First-Out (LIFO) principle.
 * Elements are inserted and removed from the head of the list.</p>
 *
 * @param <T> the type of elements stored in the stack
 */
public class StackSimpleList<T> implements Stack<T> {

    private Nodo<T> head;

    public StackSimpleList() {
        head = null;
    }

    @Override
    public void push(T item) {
        Nodo<T> newNodo = new Nodo<>(item);
        newNodo.next = head;
        head = newNodo;
    }

    @Override
    public T pop() {
        if (head == null) {
            throw new RuntimeException("Stack is empty");
        }

        T dato = head.dato;
        head = head.next;
        return dato;
    }

    @Override
    public T peek() {
        if (head == null) {
            throw new RuntimeException("Stack is empty");
        }

        return head.dato;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    public Nodo<T> getHead() {
        return head;
    }
}
