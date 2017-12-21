package tw.designpattern.behavior.state2;

public class HouseContext {
    private State mState;

    public void setState(State state) {
        System.out.println("Changing state");
        mState = state;
        mState.handle();
    }
}
