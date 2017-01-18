package tw.designpattern.mix.BuilderAndFactory;

import tw.designpattern.mix.BuilderAndFactory.Beverage.IBeverages;
import tw.designpattern.mix.BuilderAndFactory.Burger.IBurgers;
import tw.designpattern.mix.BuilderAndFactory.Snack.ISnacks;

/**
 * Created by chiachen on 2017/1/18.
 */
public class Order {
    private final IBeverages mBeverage;
    private final IBurgers mBurger;
    private final ISnacks mSnacks;

    private Order(OrderBuilder orderBuilder) {
        this.mBeverage = orderBuilder.iBeverages;
        this.mBurger = orderBuilder.iBurgers;
        this.mSnacks = orderBuilder.iSnacks;
    }

    public String makeOrder() {

        StringBuilder sb = new StringBuilder();
        if (mBurger != null) {
            sb.append(mBurger.makeBurger()).append(" ");
        }
        if (mBeverage != null) {
            sb.append(mBeverage.makeDrinking()).append(" ");
        }
        if (mSnacks != null) {
            sb.append(mSnacks.makeSnack());
        }
        return sb.toString();
    }

    public static class OrderBuilder{
        private IBeverages iBeverages;
        private IBurgers iBurgers;
        private ISnacks iSnacks;

        public OrderBuilder() {
        }

        public OrderBuilder addBurger(IBurgers burger){
            this.iBurgers = burger;
            return this;
        }

        public OrderBuilder addBeverage(IBeverages beverage){
            this.iBeverages = beverage;
            return this;
        }

        public OrderBuilder addSnack(ISnacks snack){
            this.iSnacks = snack;
            return this;
        }

        public Order build( ){
            return new Order(this);
        }


    }
}
