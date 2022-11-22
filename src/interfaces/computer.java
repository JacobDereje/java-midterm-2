package interfaces;

public class computer implements Tech{
    @Override
    public boolean isSmall() {
        return false;
    }

    @Override
    public void OS() {
        System.out.println("MacOS");
    }
}
