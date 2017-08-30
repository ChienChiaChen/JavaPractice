package tw.designpattern.structural.Facade1;

public class main {
    public static void main(String[] args) {
        //https://www.tutorialspoint.com/design_pattern/facade_pattern.htm
        //It's feel like controller.

        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.makeCirle();
        shapeMaker.makeRectangle();
        shapeMaker.makeSquare();
    }
}
