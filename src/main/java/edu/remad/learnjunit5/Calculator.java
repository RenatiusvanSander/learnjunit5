package edu.remad.learnjunit5;

/**
 * This class calculates number results.
 * @author Remy Meier
 */
public class Calculator {

    /**
     * Standard constructor.
     */
    public Calculator() {}

    /**
     * Adds two values.
     * @param val1 First number value to add.
     * @param val2 Second number value to add.
     * @return The number as result of the val1 and val2.
     */
    public static int add(int val1, int val2) {
        return val1 + val2;
    }

    /**
     * Multiplies two numbers.
     * @param val1 First number to multiply.
     * @param val2 Second number to multiply
     * @return The multiplied result as number.
     */
    public static int multiply(int val1, int val2) { return val1 * val2; }

    /**
     * Divides number.
     * @param val The number to divide, zero is an illegal argument.
     * @param divisor the divisor, zero is an illegal argument.
     * @return division result as number.
     * @throws ArithmeticException In case number or divisor are zero.
     */
    public static int divide(int val, int divisor) throws ArithmeticException {
            return val / divisor;
    }
}
