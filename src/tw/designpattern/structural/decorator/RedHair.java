package tw.designpattern.structural.decorator;

/**
 * Created by chiachen on 2017/1/18.
 */
public class RedHair extends AvatarDecorator {

    public RedHair(Avatar av) {
        super(av);
    }

    @Override
    public String describe() {
        return super.describe()+"RedHair";
    }
}
