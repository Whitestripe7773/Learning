package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args){

        /**
         * Before (without Generics)
         */

        System.out.println("Before (without Generics): ");
        IntegerPrinter intPrinter = new IntegerPrinter(22);
        intPrinter.print();
        DoublePrinter doublePrinter = new DoublePrinter(22.5);
        doublePrinter.print();
        StringPrinter Stringprinter = new StringPrinter("Test");
        Stringprinter.print();

        /**
         * After (with Generics)
         */

        System.out.println("\nAfter (with Generics): ");
        Printer<Integer> printerInteger = new Printer<>(22);
        printerInteger.print();
        Printer<Double> printerDouble = new Printer<>(22.5);
        printerDouble.print();
        Printer<String> printerString = new Printer<>("Test");
        printerString.print();


        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(new Integer(10));
        arrayList.add(new Double(10.50));

        Integer myInt = (Integer) arrayList.get(0);
        System.out.println(myInt);

        // Here is the problem when we use Object as the type:
        // We don't see a compile error but during runtime we will get an exception
        try {
            Integer myInt2 = (Integer) arrayList.get(1);
        }
        catch (ClassCastException ex){
            System.out.println(ex.getMessage() + "\n");
        }

        genericsMethod("Testing generic method:");
        genericsMethod(1234);
        genericsMethod(100.50);

        genericsMethodTwoArgs("Testing generic method with two args:", "Second arg");
        genericsMethodTwoArgs("ABC", 5);
        genericsMethodTwoArgs(99.52, 1);

        System.out.println("\nList with any objects:");

        List testList = new ArrayList();
        testList.add(new Integer(10));
        testList.add(new Double(50.35));
        testList.add("String");

        printList(testList);


    }

    /**
     * Generic method with one arg
     * @param thingToSay
     * @param <T>
     */
    private static <T> void genericsMethod(T thingToSay){
        System.out.println(thingToSay);
    }

    /**
     * Generic method with two args
     * @param thingToSay
     * @param anotherThingToSay
     * @param <T>
     * @param <V>
     */
    private static <T, V> void genericsMethodTwoArgs(T thingToSay, V anotherThingToSay){
        System.out.println(thingToSay + ", " + anotherThingToSay);
    }

    /**
     * Generic method with a wildcard
     * @param myList
     */
    private static void printList(List<?> myList){
        System.out.println(myList);
    }

}
