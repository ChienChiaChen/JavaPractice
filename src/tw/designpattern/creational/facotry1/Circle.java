package tw.designpattern.creational.facotry1;

/**
 * Created by chiachen on 2016/11/6.
 */
public class Circle implements Shape {
    //makes sure constructor is protected
    protected   Circle() {
    }

    @Override
    public void draw() {
        System.out.println( "it's Circle");
    }
}
