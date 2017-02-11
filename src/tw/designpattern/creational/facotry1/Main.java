package tw.designpattern.creational.facotry1;

/**
 * Created by chiachen on 2016/11/6.
 */
public class Main {
    public static final String SQUARE = "SQUARE";
    public static final String CIRCLE = "CIRCLE";
    public static final String RECTANGLE = "RECTANGLE";
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();

        System.out.println("== START ==");
        Shape shape=shapeFactory.getShaper(SQUARE);
        shape.draw();
        //===

        shape = shapeFactory.getShaper(CIRCLE);
        shape.draw();
        //===

        shape = shapeFactory.getShaper(RECTANGLE);
        shape.draw();

        System.out.println("== END ==");
    }
}
