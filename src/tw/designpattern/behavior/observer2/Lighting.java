package tw.designpattern.behavior.observer2;

/**
 * Created by chiachen on 2017/3/4.
 */
public class Lighting implements AlarmListener {
    @Override
    public void alarm() {
        System.out.println(" Lighting ");
    }
}
