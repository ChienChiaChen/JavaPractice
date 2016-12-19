package tw.designpattern.creational.Builder;

/**
 * Created by chiachen on 2016/11/24.
 */
public class ChickenBurger extends Burger  {
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
