package tw.designpattern.Behavior.command2;

/**
 * Created by chiachen on 2017/1/19.
 */
public class Main {
    public static void main(String[] args) {
        Broker broker = new Broker();
        broker.takeOrder(new BuyStock(new Stock()));
        broker.takeOrder(new SellStock(new Stock()));

        broker.placeOrders();
    }
}
