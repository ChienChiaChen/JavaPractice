package tw.designpattern.structural.bridge1;

public class Circle extends Shape {

    int mRadius, mX,mY;

    public Circle(int radius, int x, int y,DrawAPI drawAPI) {
        super(drawAPI);
        mRadius = radius;
        mX = x;
        mY = y;
    }

    @Override
    void draw() {
        mDrawAPI.drawCircle(mRadius,mX,mY);
    }
}
