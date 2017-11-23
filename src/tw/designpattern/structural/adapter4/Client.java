package tw.designpattern.structural.adapter4;

//Object adapter
public class Client {

    public void test(Target target) {
        target.handleReq();
    }

    public static void main(String[] args) {
        Client client = new Client();
        Adapter adaptee = new Adapter(new Adaptee());
        client.test(adaptee);
    }
}
