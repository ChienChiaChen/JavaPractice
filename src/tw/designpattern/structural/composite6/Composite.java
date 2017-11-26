package tw.designpattern.structural.composite6;

public interface Composite extends Component {
    void add(Component e);
    void remove(Component component);
    Component getChild(int index);
}