package tw.designpattern.creational.facotry2;

/**
 * Created by chiachen on 2016/11/6.
 */
public class BeverageStores {
    BeverageFactory beverageFactory;
    public BeverageStores(BeverageFactory beverageFactory) {
        this.beverageFactory = beverageFactory;
    }

    public BeverageProvide getBeverage() {
        return beverageFactory.CreateBeverage();
    }
}
