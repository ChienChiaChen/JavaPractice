package tw.designpattern.structural.Decorator3;

/**
 * Created by chiachen on 2017/8/11.
 */
public abstract class Food {
    protected int mCost;
    protected String mName;

    public String getmName() {
        return mName;
    }

    public abstract int getCost();

}
