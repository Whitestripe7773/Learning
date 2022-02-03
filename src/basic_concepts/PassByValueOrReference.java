package basic_concepts;

public class PassByValueOrReference {

    /**
     * Java is always pass by value!
     * @param args
     */
    public static void main(String[] args) {

        PassByValueTest testValue = new PassByValueTest();
        testValue.setAttribute(10);
        System.out.println("At start: " + testValue.getAttribute());

        increaseAttribute(testValue);
        System.out.println("Increase value by 1: " + testValue.getAttribute());

        increaseAttributeFake(testValue);
        System.out.println("Create new object and set a value: " + testValue.getAttribute());

    }

    /**
     * The value of the passed obj will increase by one
     * It points to the same location in memory and gets the value from it then increase it by one
     * @param test
     */
    private static void increaseAttribute(PassByValueTest test){
        test.setAttribute(test.getAttribute() + 1);
    }

    /**
     * Instead of return the new value we will still get the old value back
     * After creating a new obj we will have a new memory location (not the same address as before)
     * @param test
     */
    private static void increaseAttributeFake(PassByValueTest test){
        test = new PassByValueTest();
        test.setAttribute(1000);
    }

}
