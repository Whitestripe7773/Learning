package java_8;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

    void singleAbstractMethod();
    // If we add another abstract methods, the compiler will find an exception
    // void singleAbstractMethod2();

    default void helloWorld(){
        System.out.println("HelloWorld");
    }

    default void helloWorld2(){
        System.out.println("HelloWorld");
    }

}
