package tw.designpattern.structural.adapter2;

/**
 * Created by chiachen on 2017/1/23.
 */
public class NormalArcher implements Archer {
    @Override
    public void shot() {
        System.out.println("射箭");
    }
}
