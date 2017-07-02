package tw.designpattern.creational.simplefactory1;

/**
 * Created by chiachen on 2017/6/18.
 */
public interface Pizza {
    void makePizza();
}

class CheesePizza implements Pizza{
    @Override
    public void makePizza() {
        System.out.println(this.getClass().getSimpleName());
    }
}

class VeggiePizza implements Pizza{
    @Override
    public void makePizza() {
        System.out.println(this.getClass().getSimpleName());
    }
}

