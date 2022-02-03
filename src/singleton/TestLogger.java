package singleton;

public class TestLogger {

    public static void main(String[] args){

        Logger obj1 = Logger.getInstance();
        Logger obj2 = Logger.getInstance();

        System.out.println("Singleton: \n " + obj1.hashCode() + "\n " + obj2.hashCode() + "\n");

        TestLogger obj3 = new TestLogger();
        TestLogger obj4 = new TestLogger();

        System.out.println("Non-Singleton: \n " + obj3.hashCode() + "\n " + obj4.hashCode());

    }

}
