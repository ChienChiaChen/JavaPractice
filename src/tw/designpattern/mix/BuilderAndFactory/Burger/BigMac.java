package tw.designpattern.mix.BuilderAndFactory.Burger;

/**
 * Created by chiachen on 2017/1/18.
 */
public class BigMac implements IBurgers {
    @Override
    public String makeBurger() {
        return "大麥克";
    }
}
