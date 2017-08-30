package tw.designpattern.structural.Facade1;

public interface Shape {
    void draw();
}
class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}

class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}

class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}