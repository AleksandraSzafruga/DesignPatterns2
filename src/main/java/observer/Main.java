package observer;

public class Main {

    public static void main(String[] args) {
        Totolotek totolotek = new Totolotek();
        Media tv = new TV(totolotek);
        Media internet = new Internet(totolotek);

        totolotek.addObserver(tv);
        totolotek.addObserver(internet);

        tv.inform();
        internet.inform();

        totolotek.randomResult();
        System.out.println("Nastąpiło losowanie");

        tv.inform();
        internet.inform();

        tv.unsubscribe();

        totolotek.randomResult();;
        System.out.println("Nastąpiło losowanie 2");
        tv.inform();
        internet.inform();
    }
}
