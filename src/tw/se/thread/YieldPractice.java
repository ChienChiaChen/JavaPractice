package tw.se.thread;

/**
 * Created by chiachen on 2017/4/16.
 */
public class YieldPractice {
    public volatile static int i = 0;

    public static class AddThread extends Thread
    {
        @Override
        public void run()
        {
            for (i = 0; i < 10000000; i++)
                System.out.println(i);
        }
    }


    public static void main(String[] args) throws InterruptedException{
        AddThread at = new AddThread();
        at.start();
        at.join();
        System.out.println(i);
    }
}
