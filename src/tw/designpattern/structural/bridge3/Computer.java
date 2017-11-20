package tw.designpattern.structural.bridge3;

public abstract class Computer {
    protected final Brand b;

    public Computer(Brand b) {
        this.b = b;
    }

    public abstract void show();
}
