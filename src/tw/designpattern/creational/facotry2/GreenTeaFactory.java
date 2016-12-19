package tw.designpattern.creational.facotry2;

/**
 * Created by chiachen on 2016/11/6.
 */
public class GreenTeaFactory implements BeverageFactory {
    @Override
    public BeverageProvide CreateBeverage() {
        return new GreenTea();
    }
}
