package tw.designpattern.callback1;

/**
 * Created by chiachen on 2016/12/9.
 */
public class Called implements callback{
    @Override
    public void onCall() {
        System.out.println("im called");
    }
}
