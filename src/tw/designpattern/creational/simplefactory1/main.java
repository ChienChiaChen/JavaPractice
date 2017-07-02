package tw.designpattern.creational.simplefactory1;

/**
 * Created by chiachen on 2017/6/18.
 */
public class main {
    public static void main(String[] args) {
        Pizza pizza = SimplePizzaFactory.createPizza("Cheese");
        pizza.makePizza();

        pizza = SimplePizzaFactory.createPizza("Veggie");
        pizza.makePizza();
    }
}
