package loosely_coupled;

public class Bus implements ITransport{

    @Override
    public void start() {
        System.out.println("Traveling by bus started...");
    }
}
