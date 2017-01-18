package tw.designpattern.mix.BuilderAndFactory.Snack;

/**
 * Created by chiachen on 2017/1/18.
 */
public class ApplePie implements ISnacks {
    @Override
    public String makeSnack() {
        return "蘋果派";
    }
}
