package tw.designpattern.behavior.strategy3;

/**
 * Created by chiachen on 2016/11/5.
 */
public abstract class TemplateMethod1 implements Strategy{
    @Override
    public void solve() {
        start();
        while (nextTry()&&!isSolution())
            ;
        stop();

    }
    public abstract void start();
    public abstract boolean nextTry();
    public abstract boolean isSolution();
    public abstract void stop();
}
