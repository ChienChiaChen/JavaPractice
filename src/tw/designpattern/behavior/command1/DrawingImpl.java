package tw.designpattern.behavior.command1;


public class DrawingImpl implements Drawing {
    @Override
    public void processSome() {
        System.out.println("do some");
    }

    @Override
    public void processOther() {
        System.out.println("do other");
    }

    @Override
    public void processAnother() {
        System.out.println("do another");
    }
}
