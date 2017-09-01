package tw.designpattern.behavior.state1;

public class StateStart implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Player is in start state";
    }
}
