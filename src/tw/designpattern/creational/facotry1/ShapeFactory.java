package tw.designpattern.creational.facotry1;

/**
 * Created by chiachen on 2016/11/6.
 */
public class ShapeFactory {
    private Shape shape;
    public Shape getShaper(String type){
        switch (type) {
            case Main.CIRCLE:
                shape=new Circle();
                break;
            case Main.RECTANGLE:
                shape = new Rectangle();
                break;
            case Main.SQUARE:
                shape = new Square();
                break;

        }
        return getShape();
    }

    private Shape getShape() {
        return shape;
    }
}
