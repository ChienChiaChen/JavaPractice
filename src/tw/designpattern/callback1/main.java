package tw.designpattern.callback1;

/**
 * Created by chiachen on 2016/12/9.
 */
public class main {
    public static void main(String[] args) {
        Caller caller=new Caller(new Called());
        caller.call();
    }
}
