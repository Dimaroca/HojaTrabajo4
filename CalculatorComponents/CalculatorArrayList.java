package CalculatorComponents;

import StackElements.StackArrayList;
import java.util.ArrayList;

public class CalculatorArrayList implements Calc {

    private Double lastNum = null;
    private Double firstNum = null;
    private double result;

    StackArrayList<String> stack = new StackArrayList<>(new ArrayList<>());

    @Override
    public double Operate(String input) {

        input = input.trim();
        String[] parts = input.split(" ");

        for (int i = parts.length - 1; i >= 0; i--) {
            stack.push(parts[i]);
        }

        for (int i = 0; i < parts.length; i++) {

            String value = stack.pop();

            if (value.equals("+") || value.equals("-") ||
                value.equals("*") || value.equals("/")) {

                double n1 = firstNum;
                double n2 = lastNum;

                switch (value) {
                    case "+": 
                        result = n1 + n2; 
                        break;
                    case "-": 
                        result = n1 - n2; 
                        break;
                    case "*": 
                        result = n1 * n2; 
                        break;
                    case "/": 
                        result = n1 / n2; 
                        break;
                }

                firstNum = result;
                lastNum = null;

            } else {
                if (firstNum == null) {
                    firstNum = Double.parseDouble(value);
                } else {
                    lastNum = Double.parseDouble(value);
                }
            }
        }

        return result;
    }
}