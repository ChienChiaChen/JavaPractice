package tw.se.thread.futurepractice;

/**
 * Created by chiachen on 2017/4/16.
 */
public class FutureData implements Data {


    protected RealData realData = null;
    protected boolean isReady = false;

    public synchronized void setRealData(RealData realdata) {
        if (isReady) {
            return;
        }

        this.realData = realdata;
        isReady = true;
        notifyAll();

    }

    public synchronized String getResult()//会等待RealData构造完成
    {
        while (!isReady) {
            try {
                wait();    //一直等待，知道RealData被注入
            } catch (InterruptedException e) {
            }

        }
        return realData.result;  //由RealData实现
    }
}


