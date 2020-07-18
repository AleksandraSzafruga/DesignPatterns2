package adapter;

public class UniversalRemote {

    private Plasma plasma;

    public void turnOn(){
        plasma.turnOnPlasma();
    }

    public void turnOff(){
        plasma.turnOffPlasma();
    }

    public void setPlasma(Plasma plasma) {
        this.plasma = plasma;
    }


}
