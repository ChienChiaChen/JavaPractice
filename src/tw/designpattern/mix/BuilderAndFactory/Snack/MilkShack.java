package tw.designpattern.mix.BuilderAndFactory.Snack;

/**
 * Created by chiachen on 2017/1/18.
 */
public class MilkShack implements ISnacks {
    @Override
    public String makeSnack() {
        return "奶昔";
    }
}
