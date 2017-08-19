package tw.designpattern.structural.Decorator3;

/**
 * Created by chiachen on 2017/8/11.
 */
public class Cheese extends DecoratorFood {
    public Cheese(Food food,int cost) {
        super(food);
        mName = "Cheese";
        mCost = cost;
    }

}