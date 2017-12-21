package tw.designpattern.behavior.state2;

public class Client {
    public static void main(String[] args) {
        HouseContext houseContext = new HouseContext();
        houseContext.setState(new FreeState());
        houseContext.setState(new BookedState());
        houseContext.setState(new CheckedInState());

    }
}
