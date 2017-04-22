package tw.se.thread.futurepractice;

/**
 * Created by chiachen on 2017/4/16.
 */
public class RealData implements Data {
    protected final String result;

    public RealData(String result) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < 10; i++) {
            sb.append(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        this.result = sb.toString();
    }

    public String getResult() {
        return result;
    }
}
