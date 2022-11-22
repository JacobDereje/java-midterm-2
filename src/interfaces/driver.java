package interfaces;

public class driver {
    public static void main(String[] args) {
        phone iphone = new phone();
        computer mac = new computer();
        System.out.println(iphone.isSmall());
        System.out.println(mac.isSmall());
        iphone.OS();
        mac.OS();
    }
}
