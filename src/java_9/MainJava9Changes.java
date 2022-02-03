package java_9;

import java.util.*;
import java.util.stream.Stream;

public class MainJava9Changes implements InterfaceTest {

    @Override
    public void testMethod() {
        System.out.println("Method from InterfaceTest");
    }

    public static void main(String[] args) {

        MainJava9Changes test = new MainJava9Changes();
        test.testMethod();
        // This method is not available -> test.testMethodPrivate();

        /** 1. Collection creation before */
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        List<String> euCountries = new ArrayList<>();
        euCountries.add("France");
        euCountries.add("Bulgaria");
        euCountries.add("Germany");

        /** New ways */

        List.of("France", "Bulgaria", "Germany");
        Set.of(1, 2, 3, 4, 5);
        // Set.of(1, 1, 2, 3, 4) -> IllegalArgumentException because every entry exist once
        Map.of("1", "Name1", "2", "Name2"); // Key Value pairs

        /** 2. Optional */

        Optional<String> customer = Optional.of("John Snow");
        customer.ifPresentOrElse(c -> System.out.println("Send Mail to customer: " + c), // If value
                () -> System.out.println("Customer does not exist")); // Empty

        /** You can now convert optional to streams */
        customer.stream();
        /**
         * Also four new stream methods
         *
         * stream.dropWhile() - discards the first items of the stream until a condition is met.
         * stream.takeWhile() - processes items until a condition is met.
         * stream.iterate() - allows you to write proper replacements for the for loops using streams.
         *                    It takes the initial value of the stream, the condition that defines when to stop
         *                    iterating and the step function to produce the next element.
         * stream.ofNullable() - as the name suggest let you create streams from objects without the need to check
         *                       for nulls. It returns a sequential Stream containing a single element, if non-null,
         *                       otherwise returns an empty Stream.
         */

        System.out.println("---- stream.takeWhile() ----");
        Stream.of("a", "b", "c", "de", "fg").takeWhile(s -> s.length() == 1).forEach(System.out::println);
        System.out.println("---- stream.dropWhile() ----");
        Stream.of("a", "b", "c", "de", "fg").dropWhile(s -> s.length() == 1).forEach(System.out::println);



        /** 3. New module system */

        /** 4. HTTP/2.0 Support */


    }

}
