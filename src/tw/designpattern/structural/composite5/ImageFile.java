package tw.designpattern.structural.composite5;

public class ImageFile implements AbstractFile{
    private String mName;

    public String getName() {
        return mName;
    }

    public ImageFile(String name) {
        mName = name;
    }

    @Override
    public void killFil() {
        System.out.println("kill file"+this.getName());
    }
}
