package tw.designpattern.creational.builder;

/**
 * Created by chiachen on 2016/11/24.
 */
public abstract class ColdDrink implements Item{



    @Override
    public Packing packing() {
        return new Bottle();
    }

}
