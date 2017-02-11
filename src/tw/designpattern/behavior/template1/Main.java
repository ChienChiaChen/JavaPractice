package tw.designpattern.behavior.template1;

/**
 * Created by chiachen on 2017/1/31.
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Baseball();
        game.play();
        System.out.println("===========");

        game = new Basketball();
        game.play();
    }
}
