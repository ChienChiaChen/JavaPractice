package tw.designpattern.structural.adapter2;

/**
 * Created by chiachen on 2017/1/23.
 */
public class Adapter implements Wizard{
    private Archer archer;

    public Adapter(Archer archer) {
        this.archer = archer;
    }

    @Override
    public void fireBall() {
        this.archer.shot();
        System.out.println("fire");
    }
}
