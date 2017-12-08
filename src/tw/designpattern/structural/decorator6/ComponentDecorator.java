package tw.designpattern.structural.decorator6;

public class ComponentDecorator implements Component {
    private final Component mComponent;

    public ComponentDecorator(Component component) {
        mComponent = component;
    }

    @Override
    public void doAction() {
        System.out.println("ComponentDecorator before");
        mComponent.doAction();
        System.out.println("ComponentDecorator after");
    }
}
