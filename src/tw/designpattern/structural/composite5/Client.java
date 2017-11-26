package tw.designpattern.structural.composite5;

public class Client {
    public static void main(String[] args) {
        AbstractFile a1, a2, a3, a4;
        a1 = new ImageFile("image 1");
        a2 = new TextFile("text 1");
        a3 = new ImageFile("image 2");
        a4 = new TextFile("text 2");

        Folder folder = new Folder("Desktop");
        folder.add(a1);
        folder.add(a2);
        folder.add(a3);
        folder.add(a4);

        folder.remove(a1);
        folder.remove(a1);

        folder.killFil();



    }
}
