package basic_concepts;

public class Test {

    public static void main(String[] args){

        // We can't create an obj of an interface ->
        // A objA = new A();
        // objA.methodA();

        B objB = new B();
        objB.methodB();
        objB.methodA();

        System.out.println("A or B?");
        // Superclass obj = new Subclass();
        // This works even A is an interface
        A objAB = new B();
        // This doesn't work if Class A is not an interface -> objAB.methodB();
        objAB.methodA();
        objAB.methodB();

    }

}
