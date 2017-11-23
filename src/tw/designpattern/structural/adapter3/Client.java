package tw.designpattern.structural.adapter3;

//Class adapter
public class Client {

    public void test(Target target) {
        target.handleReq();
    }

    public static void main(String[] args) {
        Client client = new Client();
        Adapter adapter = new Adapter();
        client.test(adapter);
    }
}
