package tw.designpattern.callback1;

/**
 * Created by chiachen on 2016/12/9.
 */
public class Caller {
    private Called mCalled;
    public Caller(Called called) {
        mCalled=called;
    }
    public void call(){
        mCalled.onCall();
    }

}
interface callback{
        void onCall();
}
