package tw.designpattern.structural.decorator5;

public class Client {

    public static void main(String[] args) {
        Car car = new Car();
//        car.move();

        SuperCar waterCar = new WaterCar(car);
//        waterCar.move();

        SuperCar aiCar = new AICar(waterCar);

        aiCar.move();
    }
}
