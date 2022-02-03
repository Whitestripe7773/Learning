package tightly_coupled;

public class Travel {

    public void start(){
        Bus bus = new Bus();
        bus.start();

        // If the method name start() changes in Train class, we can't use it anymore here
        Train train = new Train();
        train.start();
    }

}
