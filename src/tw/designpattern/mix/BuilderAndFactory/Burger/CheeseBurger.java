package tw.designpattern.mix.BuilderAndFactory.Burger;

/**
 * Created by chiachen on 2017/1/18.
 */
public class CheeseBurger implements IBurgers {
    @Override
    public String makeBurger() {
        return "起司漢堡";
    }
}
