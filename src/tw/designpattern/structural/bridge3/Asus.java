package tw.designpattern.structural.bridge3;

public class Asus implements Brand {
    @Override
    public String getName() {
        return Asus.class.getSimpleName();
    }
}
