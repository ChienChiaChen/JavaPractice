package tw.designpattern.behavior.strategy4_2;

public class Client {
    public static void main(String[] args) {
        TransportationStrategy transportationStrategy = new TransportationStrategy();
        transportationStrategy.setCalculateStrategy(new BusStrategy());
    }
}
