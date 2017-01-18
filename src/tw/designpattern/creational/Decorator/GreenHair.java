package tw.designpattern.creational.Decorator;

/**
 * Created by chiachen on 2017/1/18.
 */
public class GreenHair extends AvatarDecorator {

    public GreenHair(Avatar av) {
        super(av);
    }

    @Override
    public String describe() {
        return super.describe()+"GreenHair";
    }
}

