package tw.designpattern.behavior.memento1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chiachen on 2017/1/29.
 */
public class CareTaker {
    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento memento) {
        mementos.add(memento);
    }

    public Memento get(int index){
        return mementos.get(index);
    }
}
