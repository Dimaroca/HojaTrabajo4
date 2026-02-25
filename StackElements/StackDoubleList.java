package StackElements;

public class StackDoubleList<T> implements Stack<T> {
    
    Nodo head;
    Nodo tail;

    public StackDoubleList() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public void push(T item) {
        Nodo newNodo = new Nodo((Integer) item);
        if (head == null) {
            head = newNodo;
            tail = newNodo;
        } 
        else {
            tail.next = newNodo;
            newNodo.prev = tail;
            tail = tail.next;
        }
    }

    @Override
    public T pop() {
        if (head == null) {
            throw new RuntimeException("Stack is empty");
        }
        int dato = head.dato;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
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
