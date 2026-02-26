package StackElements;

import java.util.ArrayList;
/**
 * Stack implementation backed by an {@link ArrayList}.
 *
 * <p>This class provides a Last-In, First-Out (LIFO) structure
 * using a dynamic array internally.</p>
 *
 * @param <T> the type of elements stored in the stack
 */
public class StackArrayList <T> implements Stack<T> {

     ArrayList<T> items = new ArrayList<T>();

    public StackArrayList(ArrayList<T> items) {
        this.items = items;
    }

    @Override
    public T pop(){
        int lastIndex = items.size() - 1;
        T item = items.get(lastIndex);
        items.remove(lastIndex);
        return item;
    }

    @Override
    public T peek(){
        int lastIndex = items.size() - 1;
        return items.get(lastIndex);
    }


    @Override
    public void push( T item) {
        items.add(item);
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
    
}
