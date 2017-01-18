package tw.designpattern.mix.BuilderAndFactory;

import tw.designpattern.mix.BuilderAndFactory.Beverage.Coke;
import tw.designpattern.mix.BuilderAndFactory.Beverage.Milk;
import tw.designpattern.mix.BuilderAndFactory.Beverage.OrangeJuice;
import tw.designpattern.mix.BuilderAndFactory.Burger.BigMac;
import tw.designpattern.mix.BuilderAndFactory.Burger.CheeseBurger;
import tw.designpattern.mix.BuilderAndFactory.Burger.DoubleCheeseBurger;
import tw.designpattern.mix.BuilderAndFactory.Snack.ApplePie;
import tw.designpattern.mix.BuilderAndFactory.Snack.ChocolateShack;
import tw.designpattern.mix.BuilderAndFactory.Snack.MilkShack;

/**
 * Created by chiachen on 2017/1/18.
 */
public class OrderFactory {
    public static Order createBigMacCombo(){
        return new Order.OrderBuilder()
                .addBurger( new BigMac())
                .addBeverage( new Coke())
                .addSnack( new ApplePie())
                .build();
    }
    public static Order createCheeseBurgerCombo(){
        return new Order.OrderBuilder()
                .addBurger( new CheeseBurger())
                .addBeverage( new Milk())
                .addSnack( new MilkShack())
                .build();
    }

    public static Order createDoubleBurgerCombo(){
        return new Order.OrderBuilder()
                .addBurger( new DoubleCheeseBurger())
                .addBeverage( new OrangeJuice())
                .addSnack( new ChocolateShack())
                .build();
    }
}

