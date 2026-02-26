package StackElements;
/**
 * Generic node class used for linked list implementations.
 *
 * <p>This node stores a data element of type {@code T} and
 * maintains references to the next and previous nodes.
 * It can be used for both singly and doubly linked structures.</p>
 *
 * @param <T> the type of data stored in the node
 */
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
