package StackElements;

public class StackFactory {
    
    public static <T> Stack<T> createStack(int type) {
        switch (type) {
            case 1:
                StackVector<T> stackVector = new StackVector<>();
                
            case 2:
                return new StackArrayList<>(new java.util.ArrayList<>());
            case 3:
                return new StackSimpleList<>();
            case 4:
            default:
                throw new IllegalArgumentException("Tipo de pila no soportado");
        }
    }
}
