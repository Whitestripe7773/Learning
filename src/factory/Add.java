package factory;

public class Add implements Calculate{

    public void calculate(double a, double b){
        System.out.println("a plus b is: " + (a + b));
    }

}
