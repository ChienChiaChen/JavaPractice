package tw.designpattern.structural.decorator2;

/**
 * Created by Jason_Chien on 2017/5/3.
 */
public class Main {
    public static void main(String[] args) {
        new RedShapeDecorator(new Triangle()).draw();
        new RedShapeDecorator(new Rectangle()).draw();
    }
}
interface Shape{
    void draw();
}

abstract class ShapeDecorator implements Shape {
    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}

class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("draw : Rectangle");
    }
}
class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("draw : Triangle");
    }
}

class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("plus: RedShapeDecorator");
    }
}