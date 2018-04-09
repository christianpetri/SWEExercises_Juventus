import ch.juventus.java.javadoc.MathUtils;
import object.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class Main {
    final static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.warn("Hello World");
        MathUtils calc = new MathUtils();
        double result = calc.subtraction(1,15);
        System.out.println( "calc.subtraction(1,15) --> " + result );
        List<Double> numbers = Arrays.asList(1.38, 2.56, 4.3);
        result = calc.addition(numbers);
        System.out.println("calc.addition(1.38, 2.56, 4.3) --> " + result );
        result = calc.subtraction(5,3);
        System.out.println("calc.subtraction(5,3) --> "  + result );


        Person andi     =   new Person("Andi",12);
        Person peter    =   new Person("Andi",12);

        System.out.print("Needs generate \"equals and hash\" andi.equals(peter) that it is ");
        System.out.println(andi.equals(peter));
        System.out.print("Compare Objects: is andi == peter : ");
        System.out.println(andi == peter);
        System.out.println(andi.toString());

    }
}
