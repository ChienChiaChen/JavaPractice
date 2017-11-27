package tw.designpattern.structural.decorator5;

public class AICar extends SuperCar {
    public AICar(ICar car) {
        super(car);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Ai Car");
    }
}
