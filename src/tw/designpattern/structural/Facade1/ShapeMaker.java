package tw.designpattern.structural.Facade1;

public class ShapeMaker {
    private Shape mCircle, mRectangle, mSquare;

    public ShapeMaker() {
        mCircle = new Circle();
        mRectangle = new Rectangle();
        mSquare = new Square();
    }

    public void makeCirle(){
        mCircle.draw();
    }

    public void makeRectangle(){
        mRectangle.draw();
    }
    public void makeSquare(){
        mSquare.draw();
    }
}
