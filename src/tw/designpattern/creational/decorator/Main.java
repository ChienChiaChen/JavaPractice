package tw.designpattern.creational.decorator;

/**
 * Created by chiachen on 2017/1/18.
 */
public class Main {
    public static void main(String[] args) {
        Avatar avatar1 = new RedHair(new Worrior());
        Avatar avatar2 = new RedHair(new Wizard());
        Avatar avatar3 = new GreenHair(new Worrior());
        Avatar avatar4 = new GreenHair(new Wizard());

    }
}
