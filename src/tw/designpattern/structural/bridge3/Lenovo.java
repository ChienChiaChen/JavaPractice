package tw.designpattern.structural.bridge3;

public class Lenovo implements Brand {
    @Override
    public String getName() {
        return Lenovo.class.getSimpleName();
    }

}
