package CalculatorComponents;

import StackElements.StackVector;

/**
 * Calculator class that implements the Calc interface.
 * <p>
 * This calculator evaluates a mathematical expression provided as a
 * space-separated string. It supports the basic arithmetic operators:
 * addition (+), subtraction (-), multiplication (*), and division (/).
 * </p>
 * <p>
 * Internally, it uses a stack to process the input tokens.
 * </p>
 */

public class Calculator implements Calc {
    private Double lastNum = null;
    private Double firstNum = null;
    private double result;

    StackVector<String> stack = new StackVector<>();

    @Override
    public double Operate(String input) {
        input = input.trim();
        String[] parts = input.split(" ");
        stack.setItems(parts.length);

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
                        if (n2 == 0) {
                            throw new ArithmeticException("Division por cero");
                        }
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