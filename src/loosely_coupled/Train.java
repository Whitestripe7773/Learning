package loosely_coupled;

public class Train implements ITransport{

    @Override
    public void start() {
        System.out.println("Traveling by train started...");
    }
}
