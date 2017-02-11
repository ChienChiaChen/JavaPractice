package tw.designpattern.structural.composite2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chiachen on 2017/1/25.
 */
public class PlayList implements Playable {
    private List<Playable> ww = new ArrayList<>();

    public void add(Playable w){
        ww.add(w);
    }

    @Override

    public void play() {
        for (Playable s : ww) {
            s.play();
        }

    }
}
