package tw.designpattern.mix.BuilderAndFactory.Beverage;

/**
 * Created by chiachen on 2017/1/18.
 */
public class Milk implements IBeverages {
    @Override
    public String makeDrinking() {
        return "牛奶";
    }
}
