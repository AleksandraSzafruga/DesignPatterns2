package adapter;

public class LedImpl implements Led{

    @Override

    public void turnOnLed() {
        System.out.println("Włącz led");
    }

    @Override

    public void turnOffLed() {
        System.out.println("Wyłącz led");
    }
}
