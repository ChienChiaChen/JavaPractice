package tw.designpattern.creational.facotry2;

/**
 * Created by chiachen on 2016/11/6.
 */
public class GreenTea implements BeverageProvide {
    public GreenTea() {
        addMaterial();
        brew();
        PouredCup();
    }

    @Override
    public void addMaterial() {
        System.out.println("addMaterial : GreenTea");
    }

    @Override
    public void brew() {
        System.out.println("brew : GreenTea");
    }

    @Override
    public void PouredCup() {
        System.out.println("PouredCup : GreenTea");
    }
}
