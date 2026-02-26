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
package CalculatorComponents;

import StackElements.StackSimpleList;

public class CalculatorSimpleList implements Calc {

    private Double lastNum = null;
    private Double firstNum = null;
    private double result;

    StackSimpleList<Double> stack = new StackSimpleList<>();

    @Override
    public double Operate(String input) {

        lastNum = null;
        firstNum = null;
        result = 0;

        input = input.trim();
        String[] parts = input.split(" ");

        for (int i = 0; i < parts.length; i++) {
            String value = parts[i];

            if (value.equals("+") || value.equals("-") ||
                value.equals("*") || value.equals("/")) {

                lastNum = stack.pop();
                firstNum = stack.pop();

                switch (value) {
                    case "+": result = firstNum + lastNum; break;
                    case "-": result = firstNum - lastNum; break;
                    case "*": result = firstNum * lastNum; break;
                    case "/":
                        if (lastNum == 0) throw new ArithmeticException("Division por cero");
                        result = firstNum / lastNum;
                        break;
                }

                stack.push(result);

            } else {
                stack.push(Double.parseDouble(value));
            }
        }

        return stack.pop();
    }
}