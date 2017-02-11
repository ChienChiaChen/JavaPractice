package tw.designpattern.behavior.strategy3;

/**
 * Created by chiachen on 2016/11/5.
 */
public class Impl1 extends TemplateMethod1 {
    private int state = 1;
    @Override
    public void start() {
        System.out.println("===  start");
    }

    @Override
    public boolean nextTry() {
        System.out.println("=== next try is  "+state++);
        return true;
    }

    @Override
    public boolean isSolution() {
        System.out.println("=== is solution is  (state == 3)" );
        return 3 == state;

    }

    @Override
    public void stop() {
        System.out.println("===  stop");

    }
}
