package tw.designpattern.behavior.strategy3;

/**
 * Created by chiachen on 2016/11/5.
 */
public class main {
    public static void main(String[] args) {
        Strategy strategy=new Impl1();
        strategy.solve();
    }
}
