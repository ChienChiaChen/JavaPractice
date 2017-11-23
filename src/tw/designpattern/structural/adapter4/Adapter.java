package tw.designpattern.structural.adapter4;

public class Adapter implements Target {
    private final Adaptee mAdaptee;

    public Adapter(Adaptee adaptee) {
        mAdaptee = adaptee;
    }

    @Override
    public void handleReq() {
        mAdaptee.request();
    }
}
