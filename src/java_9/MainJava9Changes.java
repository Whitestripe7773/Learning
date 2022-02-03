package java_9;

import java.util.*;

public class MainJava9Changes {

    public static void main(String[] args) {

        // 1. Collection creation before
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // New ways
        List.of(1, 2, 3, 4, 5);
        Set.of(1, 2, 3, 4, 5);
        // Set.of(1, 1, 2, 3, 4) -> IllegalArgumentException because every entry exist once
        Map.of("1", "Name1", "2", "Name2"); // Key Value pairs

        // 2. Optional

        Optional<String> customer = Optional.of("John Snow");
        customer.ifPresentOrElse(c -> System.out.println("Send Mail to customer: " + c), // If value
                () -> System.out.println("Customer does not exist")); // Empty

        // You can now convert optional to streams
        customer.stream();

        // 3. Database

    }

}
