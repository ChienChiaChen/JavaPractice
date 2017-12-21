package tw.designpattern.behavior.state2;

public interface State {
    void handle();
}

class FreeState implements State {
    @Override
    public void handle() {
        System.out.println("Free");
        System.out.println();
    }
}

class BookedState implements State {
    @Override
    public void handle() {
        System.out.println("Booked");
        System.out.println();
    }
}

class CheckedInState implements State {
    @Override
    public void handle() {
        System.out.println("CheckedIn");
        System.out.println();
    }
}