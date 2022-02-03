package java_8;

public class MethodReferenceDemo {

    public static void main(String[] args){

        FunctionalInterfaceDemo functionalInterfaceDemo = Test :: testImplementation;
        // The singleAbstractMethod() is referencing to the testImplementation method
        functionalInterfaceDemo.singleAbstractMethod();

        /**
         * If no testImplementation() is available in existing code base, then use this lambda expression
         * For showcase you could comment out the Test Class
         */
        FunctionalInterfaceDemo f = () -> System.out.println("Implementation of lambda");
        f.singleAbstractMethod();
    }

    /**
     * - Is a replacement of lambda expressions
     * - Used to refer method of functional interface to an existing method
     * - Used for code reuseability
     *
     * - Function Interface methods can be mapped to specific existing method using double colon (::)
     * - Alternative to lambda expressions
     * - Whenever we have existing implementation of abstract method of the functional interface
     *   we can go for method reference
     * - If there is no such method for example:"testImplmentation()" then go for lambda expression
     */

}

class Test {
    public static void testImplementation(){
        System.out.println("This is the test implementation of the abstract method");
    }
}
