package tw.designpattern.creational.simplefactory1;

/**
 * Created by chiachen on 2017/6/18.
 */
public class SimplePizzaFactory {
    public static Pizza createPizza(String type){
        Pizza pizza = null;
        switch (type) {
            case "Cheese":{
                pizza = new CheesePizza();
                break;
            }
            case "Veggie":{
                pizza = new VeggiePizza();
                break;
            }
        }
        return pizza;
    }
}

