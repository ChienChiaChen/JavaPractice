package tw.designpattern.structural.decorator5;

public class SuperCar implements ICar {
    protected ICar mCar;

    public SuperCar(ICar car) {
        mCar = car;
    }

    @Override

    public void move() {
        mCar.move();
    }
}
