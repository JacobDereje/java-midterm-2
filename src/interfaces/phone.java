package interfaces;

public class phone implements Tech{


    @Override
    public boolean isSmall() {
        return true;
    }

    @Override
    public void OS() {
        System.out.println("IOS");
    }

}
