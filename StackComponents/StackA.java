package StackComponents;

import java.util.ArrayList;

/**
 * Stack implementation based on {@link ArrayList}.
 * <p>
 * This class implements the {@link Stack} interface and uses an
 * {@code ArrayList} as the underlying data structure to store elements.
 * </p>
 *
 * @param <T> the type of elements stored in the stack
 */

public class StackA<T> implements Stack<T>{
    
    ArrayList<T> items = new ArrayList<T>();

    public StackA( ArrayList<T> items)
    {
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
    
}
