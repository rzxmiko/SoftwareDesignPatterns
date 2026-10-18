package calculator;

public class DivideStrategy implements OperationStrategy {
    @Override
    public double execute(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Error: Division by zero is not possible!");
        }
        return a / b;
    }
}