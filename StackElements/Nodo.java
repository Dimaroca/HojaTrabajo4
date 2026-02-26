package StackElements;

public class Nodo<T> {
     T dato;
    Nodo<T> next;
    Nodo<T> prev;

    public Nodo(T dato) {
        this.dato = dato;
        this.next = null;
        this.prev = null;
    }
}
