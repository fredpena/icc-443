package edu.pucmm;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

/**
 * @author me@fredpena.dev
 * @created 02/05/2024  - 13:40
 */
public class OperationTest extends TestCase {

    public void testSum() {
        assertEquals((float) 38, OperationMath.sum(25, 13));
    }

    public void testSubtraction() {
        assertEquals((float) 29, OperationMath.subtract(58, 29));
    }

    public void testMultiplication() {
        assertEquals((float) 28, OperationMath.multiply(7, 4));
    }

    public void testDivision() {
        assertEquals((float) 9, OperationMath.divide(45, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {

        assertThrows(ArithmeticException.class, () -> OperationMath.divide(1, 0));
//        assertThrows(IndexOutOfBoundsException.class, () -> OperationMath.divide(1, 0));

//        ArithmeticException exception = assertThrows(ArithmeticException.class, () ->
//                OperationMath.divide(1, 0));
//
//        assertEquals("Division by zero", exception.getMessage());
    }

}

