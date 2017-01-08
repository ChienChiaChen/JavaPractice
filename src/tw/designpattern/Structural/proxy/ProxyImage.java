package tw.designpattern.Structural.proxy;

import tw.designpattern.Structural.RealImage;

/**
 * Created by chiachen on 2017/1/9.
 */
public class ProxyImage implements tw.designpattern.Structural.proxy.Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
