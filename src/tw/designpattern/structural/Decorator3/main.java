package tw.designpattern.structural.Decorator3;

/**
 * Created by chiachen on 2017/8/11.
 */
public class main {
    public static void main(String[] args) {
        Food toast = new Toast(10);
        Food ham = new Ham(toast,10);
        Food cheese = new Cheese(ham,5);

        System.out.println(cheese.getCost());
    }
}
