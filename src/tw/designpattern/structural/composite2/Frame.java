package tw.designpattern.structural.composite2;

/**
 * Created by chiachen on 2017/1/25.
 */
public class Frame implements Playable {
    private String name;

    public Frame(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("play  " + name);

    }
}
