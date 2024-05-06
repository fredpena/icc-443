package edu.pucmm;

/**
 * @author me@fredpena.dev
 * @created 02/05/2024  - 13:45
 */
public class OperationMath {

    public static float sum(float a, float b) {
        return a + b;
    }

    public static float subtract(float a, float b) {
        return a - b;
    }

    public static float multiply(float a, float b) {
        return a * b;
    }

    public static float divide(float a, float b) {
        if (b == 0.0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}
