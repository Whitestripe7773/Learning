package factory;

public class Divide implements Calculate{

    public void calculate(double a, double b){
        System.out.println("a divided by b is: " + (a / b));
    }

}
