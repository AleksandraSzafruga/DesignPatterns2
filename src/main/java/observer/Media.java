package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Media implements Observer {

    private Totolotek totolotek;
    private List<Integer> resultFromtotolotek = new ArrayList<>();

    public Media(Totolotek totolotek) {
        this.totolotek = totolotek;
    }

    @Override
    public void update(List<Integer> result) {
        resultFromtotolotek.clear();
        for (Integer integer: result){
            resultFromtotolotek.add(integer);
        }
    }

    public void inform (){
        System.out.println(resultFromtotolotek);
    }

    public void unsubscribe (){
        totolotek.removeObserver(this);
        resultFromtotolotek.clear();
    }
}
