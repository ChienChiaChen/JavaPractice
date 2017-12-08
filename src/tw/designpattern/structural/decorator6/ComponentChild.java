package tw.designpattern.structural.decorator6;

public class ComponentChild implements Component {
    private String name;

    public ComponentChild() {
    }

    public ComponentChild(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void doAction() {
        System.out.println(name);
    }
}
