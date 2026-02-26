package StackElements;

import CalculatorComponents.CalculatorArrayList;
import CalculatorComponents.CalculatorDoubleList;
import CalculatorComponents.CalculatorSimpleList;
import CalculatorComponents.CalculatorVector;
import java.util.ArrayList;
/**
 * Factory class responsible for selecting the appropriate
 * calculator implementation based on the specified type.
 *
 * <p>This class converts an infix expression into postfix notation
 * using {@link NumberOperator}, then delegates the evaluation
 * to the selected calculator implementation.</p>
 */
public class StackFactory {
    
    public static double createStack(int type, String index) {
        NumberOperator operator = new NumberOperator();
        ArrayList<String> postfix = operator.convert(index);
        String operation = "";

        for (int i = 0; i < postfix.size(); i++) {
            operation = operation + postfix.get(i) + " ";
        }

        switch (type) {
            case 1:
                CalculatorVector calculatorVector = new CalculatorVector();
                return calculatorVector.Operate(operation);           
            case 2:
                CalculatorArrayList calculatorArrayList = new CalculatorArrayList();
                return calculatorArrayList.Operate(operation); 
            case 3:
                CalculatorSimpleList calculatorSimpleList = new CalculatorSimpleList();
                return calculatorSimpleList.Operate(operation); 
            case 4:
                CalculatorDoubleList calculatorDoubleList = new CalculatorDoubleList();
                return calculatorDoubleList.Operate(operation); 
            default:
                throw new IllegalArgumentException("Tipo de pila no soportado");
        }
    }
}
