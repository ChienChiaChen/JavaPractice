package tw.designpattern.mix.BuilderAndFactory.Snack;

/**
 * Created by chiachen on 2017/1/18.
 */
public class ChocolateShack implements ISnacks {
    @Override
    public String makeSnack() {
        return "巧柯力奶昔";
    }
}
