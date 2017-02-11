package tw.designpattern.structural.proxy1;

/**
 * Created by chiachen on 2017/1/9.
 */
public class RealImage implements tw.designpattern.structural.proxy1.Image {
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
