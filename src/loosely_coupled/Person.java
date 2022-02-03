package loosely_coupled;


/**
 * Loose-coupling eliminates the need to bind application-specific classes into the code. That means the code
 * interacts solely with the resultant interface or abstract class, so that it will work with any classes that
 * implement that interface or that extends that abstract class.
 */
public class Person {

    public static void main(String[] args){

        ITransport transporBus = new Bus();
        ITransport transportTrain = new Train();
        ITravel travel1 = new Travel(transporBus);
        ITravel travel2 = new Travel(transportTrain);

        travel1.start();
        travel2.start();

    }

}
