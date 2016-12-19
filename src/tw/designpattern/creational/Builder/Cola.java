package tw.designpattern.creational.Builder;

/**
 * Created by chiachen on 2016/11/24.
 */
public class Cola extends ColdDrink {
    @Override
    public String name() {
        return "Cola";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
