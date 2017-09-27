package tw.designpattern.structural.decorator4;


public class ShapeColorDecorator {
    Shape shape;
    String color;
    public ShapeColorDecorator(Shape shape,String color) {
        this.shape = shape;
        this.color = color;
    }

    public void draw(){
        if (null != color && !color.isEmpty()) {
            System.out.println(this.shape.draw() + " " + color);
        }
    }


}
