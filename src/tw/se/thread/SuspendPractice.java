package tw.se.thread;

/**
 * Created by chiachen on 2017/4/16.
 */
public class SuspendPractice {

    public static void main(String[] args) throws InterruptedException{
        t1.start();
        Thread.sleep(100);
        t2.start();
        t1.resume();
        t2.resume();
        t1.join();
        t2.join();

    }

    static Object u = new Object();
    static TestSuspendThread t1 = new TestSuspendThread("t1");
    static TestSuspendThread t2 = new TestSuspendThread("t2");

    public static class TestSuspendThread extends Thread
    {
        boolean suspended = true;
        public TestSuspendThread(String name)
        {
            setName(name);
        }

        @Override
        public void run()
        {
            System.out.println("eee");
            synchronized (u)
            {
                System.out.println("in " + getName());
                Thread.currentThread().suspend();
            }
        }

        void Tsuspend() {
            suspended = true;
        }

        synchronized void Tresume() {
            suspended = false;
            notify();
        }
    }
}
