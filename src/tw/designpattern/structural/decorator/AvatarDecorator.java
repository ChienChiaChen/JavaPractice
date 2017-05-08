package tw.designpattern.structural.decorator;

/**
 * Created by chiachen on 2017/1/18.
 */
public class AvatarDecorator implements  Avatar {
    private Avatar av;
    public AvatarDecorator(Avatar avatar){
        av = avatar;
    }

    @Override
    public String describe() {
        return av.describe();
    }
}
