package tw.designpattern.structural.decorator5;

public class WaterCar extends SuperCar {

    public WaterCar(ICar car) {
        super(car);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("water car");
    }
}
