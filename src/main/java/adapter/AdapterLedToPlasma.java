package adapter;

public class AdapterLedToPlasma implements Plasma {

    private Led led;

    @Override
    public void turnOnPlasma() {
        led.turnOnLed();
    }

    @Override
    public void turnOffPlasma() {
        led.turnOffLed();
    }

    public void setLed(Led led) {
        this.led = led;
    }
}
