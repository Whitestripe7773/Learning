package factory;

import java.util.Scanner;

public class Test {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = input.nextDouble();

        CalculateFactory factory = new CalculateFactory();
        System.out.println("What calculation do you wanna do? (add, subtract, divide)");
        Calculate calcObj = factory.getCalculation(input.next());
        calcObj.calculate(10, 5);
    }

}
