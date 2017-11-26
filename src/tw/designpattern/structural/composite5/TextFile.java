package tw.designpattern.structural.composite5;

public class TextFile implements AbstractFile {
    private String mName;

    public TextFile(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    @Override
    public void killFil() {
        System.out.println("kill file"+this.getName());
    }
}
