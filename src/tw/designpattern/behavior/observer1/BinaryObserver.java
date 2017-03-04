package tw.designpattern.behavior.observer1;

/**
 * Created by chiachen on 2017/3/4.
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);

    }

    @Override
    public void update() {
        System.out.println("Binary String: "+Integer.
                toBinaryString(subject.getState()).
                toUpperCase());
    }
}
