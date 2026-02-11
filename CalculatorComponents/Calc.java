package CalculatorComponents;

/**
 * Interface that defines the basic behavior of a calculator.
 *
 * Classes implementing this interface must provide an implementation
 * of the {@code Operate} method, which processes a mathematical
 * expression given as a string and returns the result of the operation.
 */
public interface Calc {

    double Operate(String input);
}
