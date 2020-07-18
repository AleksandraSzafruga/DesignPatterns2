package adapter;

public class PlasmaImpl implements Plasma {

    @Override

    public void turnOnPlasma() {
        System.out.println("Włącz plazmę");
    }

    @Override

    public void turnOffPlasma() {
        System.out.println("Wyłącz plazmę");
    }

}
