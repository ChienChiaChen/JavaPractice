package tw.designpattern.structural.bridge3;

public class Desktop extends Computer {
    public Desktop(Brand b) {
        super(b);
    }

    @Override
    public void show() {
        System.out.println(b.getName() + " " + Desktop.class.getSimpleName());
    }
}
