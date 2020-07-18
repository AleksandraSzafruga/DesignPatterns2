package observer;

public class TV extends Media {

    public TV(Totolotek totolotek) {
        super(totolotek);
    }

    @Override
    public void inform() {
        System.out.print("Wynik losowania TV: ");
        super.inform();
    }
}
