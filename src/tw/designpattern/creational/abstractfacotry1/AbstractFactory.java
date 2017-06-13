package tw.designpattern.creational.abstractfacotry1;

/**
 * Created by chiachen on 2017/6/12.
 */
public abstract class AbstractFactory {
    abstract Color getColor(ColorType color);
    abstract Shape getShape(ShapeType shape) ;
}

class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(ShapeType shapeType){
//        if(shapeType == null){
//            return null;
//        }
        switch (shapeType){
            case CIRCLE:{
                return new Circle();
            }
            case RECTANGLE:{
                return new Rectangle();
            }

            case SQUARE:{
                return new Square();
            }

        }
        return new Shape() {
            @Override
            public void draw() {

            }
        };
    }

    @Override
    Color getColor(ColorType color) {
        return null;
    }
}

class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(ShapeType shapeType){
        return null;
    }

    @Override
    Color getColor(ColorType color) {
        switch (color){
            case BLUE:{
                return new Blue();
            }
            case GREEN:{
                return new Green();
            }
            case RED:{
                return new Red();
            }
        }
        return new Color() {
            @Override
            public void fill() {

            }
        };
    }
}