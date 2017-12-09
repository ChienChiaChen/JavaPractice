package tw.designpattern.behavior.memento2;

public class CareTaker {
    Memento mMemento;

    public void archive(Memento memento) {
        mMemento = memento;
    }

    public Memento getMemento() {
        return mMemento;
    }
}
