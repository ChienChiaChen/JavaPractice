package tw.designpattern.structural.composite5;

public interface Composite extends AbstractFile {
    void add(AbstractFile abstractFile);
    void remove(AbstractFile abstractFile);
    AbstractFile getChild(int index);
}
