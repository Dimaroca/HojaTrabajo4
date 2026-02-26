package StackElements;
import java.util.ArrayList;
import java.util.Arrays;

public class NumberOperator {
    ArrayList<String> postfix = new ArrayList<>();
    ArrayList<String> stack = new ArrayList<>();
    public ArrayList<String> convert(String index) {

        ArrayList<String> parts = new ArrayList<>(Arrays.asList(index.split(" ")));

        for (String value : parts) {

            if (!(value.equals("+") || value.equals("-") ||
                value.equals("*") || value.equals("/") ||
                value.equals("(") || value.equals(")"))) {

                postfix.add(value);
            }

            else if (value.equals("(")) {
                stack.add(value);
            }

            else if (value.equals(")")) {

                while (!stack.isEmpty() &&
                    !stack.get(stack.size() - 1).equals("(")) {

                    postfix.add(stack.remove(stack.size() - 1));
                }

                stack.remove(stack.size() - 1);
            }

            else {

                while (!stack.isEmpty() &&
                    (stack.get(stack.size() - 1).equals("*") ||
                    stack.get(stack.size() - 1).equals("/") ||
                    ((value.equals("+") || value.equals("-")) &&
                        (stack.get(stack.size() - 1).equals("+") ||
                        stack.get(stack.size() - 1).equals("-"))))) {

                    postfix.add(stack.remove(stack.size() - 1));
                }

                stack.add(value);
            }
        }

        return postfix;
        
    }
}
