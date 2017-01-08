package tw.designpattern.Structural.proxy;

/**
 * Created by chiachen on 2017/1/9.
 */
public class RealImage implements tw.designpattern.Structural.proxy.Image {
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
