package StackElements;

public class StackSimpleList<T> implements Stack<T> {

    private Nodo head;

    public StackSimpleList() {
        this.head = null;
    }

    @Override
    public void push(T item) {
        Nodo newNodo = new Nodo((Integer) item);
        newNodo.next = head;
        head = newNodo;
    }

    @Override
    public T pop() {
        if (head == null) {
            throw new RuntimeException("Stack is empty");
        }
        int dato = head.dato;
        head = head.next;
        return (T) Integer.valueOf(dato);
    }

    @Override
    public T peek() {
        if (head == null) {
            throw new RuntimeException("Stack is empty");
        }
        return (T) Integer.valueOf(head.dato);
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
    
}
