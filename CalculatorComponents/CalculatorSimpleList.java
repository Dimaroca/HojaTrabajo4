package CalculatorComponents;

import StackElements.StackSimpleList;

public class CalculatorSimpleList implements Calc {

    private Double lastNum = null;
    private Double firstNum = null;
    private double result;

    StackSimpleList<String> stack =
        new StackSimpleList<>();

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