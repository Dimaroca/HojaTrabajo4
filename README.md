#Hoja de trabajo 4 
Authors: Diego Mateo Rodríguez Carrillo, Lester Rodrigo Álvarez

STACK-BASED CALCULATOR PROJECT

OVERVIEW

This project implements a stack-based calculator capable of evaluating mathematical expressions.

The program performs the following steps:

1. Reads an infix expression from a text file.
2. Converts the infix expression into postfix notation (Reverse Polish Notation).
3. Evaluates the postfix expression using a selected stack implementation.
4. Writes the final result into an output text file.

The project demonstrates the implementation of data structures, stack operations, linked lists,
generic programming, and the Factory design pattern.


PROJECT STRUCTURE

The project includes four different stack implementations:

1. StackVector
   - Uses a fixed-size array.
   - Requires manual capacity initialization.

2. StackArrayList
   - Uses Java's ArrayList internally.
   - Supports dynamic resizing.

3. StackSimpleList
   - Implemented using a singly linked list.
   - Uses a custom Nodo<T> class.

4. StackDoubleList
   - Implemented using a doubly linked list.
   - Maintains head and tail references.

All implementations follow the Stack<T> interface and provide push, pop, peek, and isEmpty methods.


EXPRESSION PROCESSING

INFIX TO POSTFIX CONVERSION

The conversion is handled by the NumberOperator class.

The input expression must be space-separated.

Supported operators:
+
-
*
/
( )

The algorithm follows a simplified version of the Shunting Yard algorithm.


POSTFIX EVALUATION

Postfix evaluation is handled by:

- CalculatorVector
- CalculatorArrayList
- CalculatorSimpleList
- CalculatorDoubleList

Each calculator evaluates the postfix expression using its corresponding stack implementation.


FACTORY PATTERN

The StackFactory class selects which calculator implementation to use based on a numeric type.

Type selection:

1 → Vector
2 → ArrayList
3 → Simple Linked List
4 → Doubly Linked List

The factory performs the following:
- Converts infix to postfix
- Selects the appropriate calculator
- Returns the computed result


PROGRAM EXECUTION FLOW

1. The program reads the input expression from:

   Resources/datos.txt

2. The user selects the stack implementation from the console.

3. The program:
   - Converts infix to postfix
   - Evaluates the postfix expression
   - Writes the result to:

   Resources/resultado.txt


INPUT REQUIREMENTS

The expression must:

- Be space-separated
- Use valid arithmetic syntax
- Have properly matched parentheses

Correct example:

3 + 4 * 2 / ( 2 - 5 )

Incorrect example:

3+4*2

Operators and numbers must be separated by spaces.


LIMITATIONS

1. Only one expression is processed per execution.
2. The expression must be space-separated.
3. Only basic arithmetic operators are supported.
4. No support for:
   - Exponents
   - Advanced mathematical functions
   - Implicit negative numbers without spacing
5. Division by zero throws an ArithmeticException.
6. StackVector requires manual capacity initialization.
7. StackVector.isEmpty() is not implemented.
8. Error handling for malformed expressions is limited.
9. The final result is always returned as a double.


ERROR HANDLING

Possible runtime exceptions include:

- ArithmeticException (division by zero)
- StackOverflowError (Vector capacity exceeded)
- IllegalStateException (pop or peek on empty stack)
- IllegalArgumentException (invalid stack type selection)


TESTING

JUnit tests are included for:

- StackVector
- StackArrayList
- StackSimpleList
- StackDoubleList
- NumberOperator

The tests validate push, pop, peek, capacity behavior, and correct postfix conversion.


TIME COMPLEXITY

Stack operations:
push → O(1)
pop → O(1)
peek → O(1)

Infix to postfix conversion → O(n)
Postfix evaluation → O(n)

Where n represents the number of tokens in the expression.


EDUCATIONAL PURPOSE

This project demonstrates:

- Abstract data type implementation
- Generic programming in Java
- Linked list mechanics
- Array-based data structures
- Design pattern usage (Factory)
- Expression parsing and evaluation
- Unit testing practices


HOW TO RUN

1. Place the expression inside:

   Resources/datos.txt

2. Run the Main class.

3. Select the stack type when prompted.

4. The result will be written to:

   Resources/resultado.txt

This project is intended for educational purposes and focuses on demonstrating
data structure implementation and algorithmic processing.
