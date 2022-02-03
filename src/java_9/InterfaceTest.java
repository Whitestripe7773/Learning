package java_9;

public interface InterfaceTest {

    public default void testMethod(){
        System.out.println("Default method");
    }

    /**
     * We can now create private methods within an interface if we dont wanna leak it to the public
     */
    private void testMethodPrivate(){
        System.out.println("Private method");
    }

}
