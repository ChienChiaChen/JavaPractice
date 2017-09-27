package tw.designpattern.structural.decorator4;

public class main {

    public static void main(String[] args) {
        ShapeColorDecorator greenRectangle = new ShapeColorDecorator(new Rectangle(),"Green");
        greenRectangle.draw();
    }
}
