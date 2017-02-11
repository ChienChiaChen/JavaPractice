package tw.designpattern.structural.adapter2;

/**
 * Created by chiachen on 2017/1/23.
 */
public class AdapterClient {
    public static void main(String[] args) {
        test();
    }
    public static void test(){
        System.out.println("============轉接器模式測試============");

        Wizard wizard = new Adapter(new NormalArcher());
        wizard.fireBall();
    }
}
