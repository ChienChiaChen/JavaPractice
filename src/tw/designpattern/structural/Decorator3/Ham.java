package tw.designpattern.structural.Decorator3;

/**
 * Created by chiachen on 2017/8/11.
 */
public class Ham extends DecoratorFood {

    public Ham(Food food,int cost) {
        super(food);
        mName = "Ham";
        mCost = cost;
    }


}
