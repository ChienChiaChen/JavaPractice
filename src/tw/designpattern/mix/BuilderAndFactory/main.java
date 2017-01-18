package tw.designpattern.mix.BuilderAndFactory;

import tw.designpattern.mix.BuilderAndFactory.Beverage.Coke;
import tw.designpattern.mix.BuilderAndFactory.Burger.DoubleCheeseBurger;
import tw.designpattern.mix.BuilderAndFactory.Snack.ChocolateShack;

/**
 * Created by chiachen on 2017/1/18.
 */
public class main {
    public static void main(String[] args) {
        Order order = new Order.OrderBuilder()
                .addBurger( new DoubleCheeseBurger())
                .addBeverage( new Coke())
                .addSnack( new ChocolateShack())
                .build();
        System. out.println( order.makeOrder());

        order = new Order.OrderBuilder()
                .addBeverage(new Coke())
                .build();
        System. out.println( order.makeOrder());

        order = OrderFactory.createBigMacCombo();
        System.out.println(order.makeOrder());

    }
}
