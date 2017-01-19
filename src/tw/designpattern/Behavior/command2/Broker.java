package tw.designpattern.Behavior.command2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chiachen on 2017/1/19.
 */
public class Broker  {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){

        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
