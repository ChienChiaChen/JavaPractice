package tw.designpattern.behavior.template1;

/**
 * Created by chiachen on 2017/1/31.
 */
public abstract class Game {
    private void init(){
        System.out.println("init game");
    }

    protected abstract void startPlay();

    private void endPlay(){
        System.out.println("time's up");
    }

    public final void play(){
        init();
        startPlay();
        endPlay();
    }


}
