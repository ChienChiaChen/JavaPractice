package tw.designpattern.behavior.state1;

public class StateStop implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Player is in stop state";
    }
}
