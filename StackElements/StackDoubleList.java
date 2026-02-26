package StackElements;

public class StackDoubleList<T> implements Stack<T> {
    
    private Nodo<T> head;
    private Nodo<T> tail;

    public StackDoubleList() {
        head = null;
        tail = null;
    }

    @Override
    public void push(T item) {
        Nodo<T> newNodo = new Nodo<>(item);

        if (head == null) {
            head = newNodo;
            tail = newNodo;
        } else {
            newNodo.next = head;
            head.prev = newNodo;
            head = newNodo;
        }
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        T dato = head.dato;
        head = head.next;

        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }

        return dato;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
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

    public Nodo<T> getTail() {
        return tail;
    }
}