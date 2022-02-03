package generics;

// Instead of <T> we can also type whatever we want in <whatever>
// <T> = Type
public class Printer <T>{

    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }

}
