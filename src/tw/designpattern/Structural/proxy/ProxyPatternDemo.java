package tw.designpattern.Structural.proxy;

/**
 * Created by chiachen on 2017/1/9.
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        tw.designpattern.Structural.proxy.Image image = new tw.designpattern.Structural.proxy.ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
