package tw.designpattern.structural.proxy1;

/**
 * Created by chiachen on 2017/1/9.
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        tw.designpattern.structural.proxy1.Image image = new tw.designpattern.structural.proxy1.ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
