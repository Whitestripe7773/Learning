package basic_concepts;

// public class B extends A <- This was before
public class B implements A{

    public void methodB(){
        System.out.printf("B - Method B\n");
    }

    public void methodA(){
        System.out.printf("B - Method A\n");
    }

}
