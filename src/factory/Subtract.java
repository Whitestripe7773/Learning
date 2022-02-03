package factory;

public class Subtract implements Calculate{

    public void calculate(double a, double b){
        System.out.println("a minus b is: " + (a - b));
    }

}
