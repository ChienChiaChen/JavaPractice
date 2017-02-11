package tw.designpattern.behavior.memento1;

/**
 * Created by chiachen on 2017/1/29.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
