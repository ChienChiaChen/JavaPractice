package tw.designpattern.Behavior.command1;

/**
 * Created by chiachen on 2017/1/19.
 */
public class DrawingImpl implements Drawing {
    @Override
    public void processSome() {
        System.out.println("do some");
    }

    @Override
    public void processOther() {
        System.out.println("do other");
    }

    @Override
    public void processAnother() {
        System.out.println("do another");
    }
}
