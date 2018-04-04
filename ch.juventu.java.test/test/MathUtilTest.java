package test;

import ch.juventus.java.javadoc.MathUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Arrays;

/**
 * Testing the MathUtils functions:
 *
 MathUtilTest.subtraction
 MathUtilTest.addition
 MathUtilTest.division
 MathUtilTest.multiplication

 * @author : ${user}
 * @since: ${date}
 */
public class MathUtilTest {
    MathUtils calc = new MathUtils();

    @Test
    public void addition() {
        double result;
        List<Double> numbers = Arrays.asList(1.38, 2.56, 4.3);
        result = calc.addition(numbers);
        Assert.assertEquals(8.24 , result , 0);
        System.out.println("calc.addition(1.38, 2.56, 4.3) --> " + result );
    }

    @Test
    public void subtraction() {
        double result;
        result = calc.subtraction(1,15);
        System.out.println( "calc.subtraction(1,15) --> " + result );
        Assert.assertEquals(-14, result , 0);

    }

    @Test
    public void multiplication() {
        double result;
        result = calc.multiplication(5,3);
        Assert.assertEquals(15, result , 0);
        System.out.println("calc.multiplication(5,3) --> "  + result );
    }
    @Test
    public void division() {
        double result;
        result = calc.division(15,3);
        Assert.assertEquals(5, result , 0);
        System.out.println("calc.division(15,3) --> "  + result );
    }
}