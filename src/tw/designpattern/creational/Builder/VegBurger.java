package tw.designpattern.creational.Builder;

/**
 * Created by chiachen on 2016/11/24.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
