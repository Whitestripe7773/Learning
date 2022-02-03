package loosely_coupled;

public class Travel implements ITravel{

    private ITransport transport;

    public Travel(ITransport transport){
        this.transport = transport;
    }

    @Override
    public void start() {
        transport.start();
    }
}
