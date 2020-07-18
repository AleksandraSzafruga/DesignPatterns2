package observer;

public class Internet extends Media {

    public Internet(Totolotek totolotek) {
        super(totolotek);
    }

    @Override
    public void inform() {
        System.out.print("Wynik losowania w Internecie: ");
        super.inform();
    }
}
