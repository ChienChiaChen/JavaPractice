package tw.se.thread.futurepractice;

import java.util.concurrent.Callable;

/**
 * Created by chiachen on 2017/4/16.
 */
public class RealData1 implements Callable<String> {
    private String para;

    public RealData1(String para) {
        this.para = para;
    }

    @Override
    public String call() throws Exception {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            sb.append(para);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }
        return sb.toString();
    }
}