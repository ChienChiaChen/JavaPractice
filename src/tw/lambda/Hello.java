package tw.lambda;

import static java.lang.System.out;

/**
 * Created by chiachen on 2017/4/9.
 */

//https://openhome.cc/Gossip/CodeData/JavaLambdaTutorial/Java8Lambda.html
public class Hello {

    public String toString() { return "Hello, world!"; }

    public static void main(String[] args) {
        new Hello().r1.run();
        new Hello().r2.run();

        System.out.println("==========");
        new Hello().r11.run();
        new Hello().r22.run();
    }

    Runnable r1 = new Runnable() {
        public void run() {
            out.println(this);
        }
    };
    Runnable r2 = new Runnable() {
        public void run() {
            out.println(toString());
        }
    };


    Runnable r11 = () -> {out.println(this); };
    Runnable r22 = () -> { out.println(toString()); };

}

