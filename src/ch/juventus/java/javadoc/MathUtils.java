package ch.juventus.java.javadoc;
import java.util.List;

/**
 *  MathUtil enables you to do addition, subtraction, multiplication and division with numbers of the type  double
 *    @author : ${user}
 *    @since : ${date}
 */

public class MathUtils {

    /**
     * Adds the numbers together
     * @param numbers addends
     * @return sum
     */
    public double addition(List<Double> numbers){
        double sum = 0;
        for ( double number : numbers ) {
            sum +=number;
        }
        return  sum;
    }

    /**
     * Subtracts a from b
     * @param a minuend
     * @param b subtrahend
     * @return difference
     */
    public double subtraction(double a, double b){
        return a - b;
    }

    /**
     * multiplies a with b
     * @param a multiplier
     * @param b multiplicand
     * @return product
     */
    public double multiplication(double a, double b){
        return a*b;
    }

    /**
     *  divides a with b
     * @param a divided
     * @param b divisor
     * @return quotient
     */
    public double division(double a, double b){
        return a / b;
    }
}
