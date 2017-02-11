package tw.designpattern.behavior.command2;


public class Main {
    public static void main(String[] args) {
        Broker broker = new Broker();
        broker.takeOrder(new BuyStock(new Stock()));
        broker.takeOrder(new SellStock(new Stock()));

        broker.placeOrders();
    }
}
