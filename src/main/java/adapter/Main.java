package adapter;

public class Main {
    public static void main(String[] args) {

        Plasma plasma = new PlasmaImpl();
        Led led = new LedImpl();

        UniversalRemote remote = new UniversalRemote();
        remote.setPlasma(plasma);

        remote.turnOn();
        remote.turnOff();

        Plasma adapter = new AdapterLedToPlasma();
        ((AdapterLedToPlasma)adapter).setLed(led);

        remote.setPlasma(adapter);
        remote.turnOn();
        remote.turnOff();

    }
}
