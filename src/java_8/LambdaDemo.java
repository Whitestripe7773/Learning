package java_8;

import java.util.Comparator;
import java.util.function.BiConsumer;

public class LambdaDemo {

    public static void main(String[] args){

        /**
         * What are functional interfaces?
         * - Interfaces that have only one abstract method
         * - It can have any number of static and default methods. No restriction
         * Examples in Java: Comparable, Runnable, BiConsumer
         */

        LambdaDemo demo = new LambdaDemo();
        demo.addTwoNum(10, 5);

        /**
         * Functional interface to use lambda
         * It is used to provide reference to lambda expressions
         * (s1, s2) -> s1.compareTo(s2) --- This is a lambda expression
         * Comparator<String> c --- This is a functional interface
         */

        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println("Lambda method: " + (a + b));
        biConsumer.accept(10, 5);


        Comparator<String> c = (s1, s2) -> s1.compareTo(s2);
        System.out.println(c);
    }

    public void addTwoNum(int a, int b){
        System.out.println("Normal method: " + (a + b));
    }


}
