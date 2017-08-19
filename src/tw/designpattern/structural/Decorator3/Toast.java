package tw.designpattern.structural.Decorator3;

/**
 * Created by chiachen on 2017/8/11.
 */
public class Toast extends Food {
    public Toast(int cost) {
        mName = "Toast";
        mCost = cost;
    }

    @Override
    public int getCost() {
        return 30;
    }
}
