package tw.designpattern.behavior.state1;

public class StateEnd implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in end state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Player is in end state";
    }
}
