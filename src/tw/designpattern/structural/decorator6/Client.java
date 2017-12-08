package tw.designpattern.structural.decorator6;

public class Client {

    public static void main(String[] args) {
        Component componentChild = new ComponentChild("hi");
        Component componentParent = new ComponentDecorator(componentChild);

        componentParent.doAction();
    }
}
