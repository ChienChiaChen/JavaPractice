package tw.designpattern.structural.decorator4;

public class Rectangle extends Shape {
    @Override
    public String draw() {
        return getClass().getSimpleName();
    }
}
