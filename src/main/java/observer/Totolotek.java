package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Totolotek implements Observed {

    private List<Observer> observers = new ArrayList<>();
    private List<Integer> result = new ArrayList<>();
    private final Random random = new Random();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(result);
        }
    }

    public void randomResult() {
        result.clear();
        for (int i = 0; i < 6; i++) {
            result.add(random.nextInt(60) + 1);
        }
        notifyObservers();
    }
}
