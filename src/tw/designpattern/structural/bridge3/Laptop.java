package tw.designpattern.structural.bridge3;

public class Laptop extends Computer {
    public Laptop(Brand b) {
        super(b);
    }

    @Override
    public void show() {
        System.out.println(b.getName() + " " + Laptop.class.getSimpleName());
    }
}
