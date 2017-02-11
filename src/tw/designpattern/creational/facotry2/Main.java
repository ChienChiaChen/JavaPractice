package tw.designpattern.creational.facotry2;

/**
 * Created by chiachen on 2016/11/6.
 */
public class Main {
    public static void main(String[] args) {
        BeverageStores GreenTeadFactory = new BeverageStores(new GreenTeaFactory());
        GreenTeadFactory.getBeverage();
    }
}
