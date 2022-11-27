package abstraction;

public class driver {

    public static void main(String[] args) {
        phone android = new phone();
        computer windows = new computer();

        android.portable();
        windows.portable();
        windows.isBig();

    }
}
