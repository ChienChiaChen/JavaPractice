package tw.designpattern.structural.Decorator3;

/**
 * Created by chiachen on 2017/8/11.
 */
public abstract class DecoratorFood extends Food {
    protected Food mFood;

    public DecoratorFood(Food food) {
        mFood = food;
    }

    @Override
    public int getCost() {
        return mFood.getCost() + mCost;
    }
}
