package tw.se.thread.futurepractice;

import java.util.concurrent.Callable;

/**
 * Created by chiachen on 2017/4/17.
 */
public class MyCallable implements Callable<String> {
    private long waitTime;
    public MyCallable(int timeInMillis){
        this.waitTime=timeInMillis;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(waitTime);
        //return the thread name executing this callable task
        return Thread.currentThread().getName();
    }

}