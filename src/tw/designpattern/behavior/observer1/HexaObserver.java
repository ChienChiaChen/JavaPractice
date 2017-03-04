package tw.designpattern.behavior.observer1;

/**
 * Created by chiachen on 2017/3/4.
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);

    }

    @Override
    public void update() {
        System.out.println("Hex String: "+Integer.
                toHexString(subject.getState()).
                toUpperCase());
    }
}
