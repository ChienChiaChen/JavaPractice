package tw.se.thread;

/**
 * Created by chiachen on 2017/4/16.
 */
public class DaemonPractice {
    public static class DaemonThread extends Thread
    {
        @Override
        public void run()
        {
            for (int i = 0; i < 10000000; i++)
            {
                System.out.println("hi");
            }
        }
    }

    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();
//        daemonThread.setDaemon(true);
        daemonThread.start();

    }
}
