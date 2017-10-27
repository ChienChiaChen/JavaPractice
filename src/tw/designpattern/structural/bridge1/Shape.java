package tw.designpattern.structural.bridge1;

public abstract class Shape {
    protected DrawAPI mDrawAPI;

    public Shape(DrawAPI drawAPI) {
        mDrawAPI = drawAPI;
    }

    abstract void draw();
}
