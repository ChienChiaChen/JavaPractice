package tw.designpattern.structural.adapter3;

public class Adapter extends Adaptee implements Target {

    @Override
    public void handleReq() {
        super.request();
    }
}
