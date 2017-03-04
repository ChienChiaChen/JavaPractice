package tw.designpattern.behavior.observer1;

/**
 * Created by chiachen on 2017/3/4.
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "+Integer.
                toOctalString(subject.getState()).
                toUpperCase());

    }
}
