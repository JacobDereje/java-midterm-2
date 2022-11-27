package abstraction;

public class computer extends tech{
    @Override
    void portable() {
        System.out.println("This tech is not portable");
    }

    void isBig(){
        System.out.println("this computer is big");
    }
}
