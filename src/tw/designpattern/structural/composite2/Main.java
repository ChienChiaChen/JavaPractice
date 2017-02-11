package tw.designpattern.structural.composite2;

/**
 * Created by chiachen on 2017/1/25.
 */
public class Main {
    public static void main(String[] args) {
        Frame logo = new Frame("片頭 LOGO");

        PlayList playlist1 = new PlayList();
        playlist1.add(new Frame("Duke 左揮手"));
        playlist1.add(new Frame("Duke 右揮手"));

        PlayList playlist2 = new PlayList();
        playlist2.add(new Frame("Duke 走左腳"));
        playlist2.add(new Frame("Duke 走右腳"));

        PlayList all = new PlayList();
        all.add(logo);
        all.add(playlist1);
        all.add(playlist2);

        all.play();
    }
}
