package tw.se.thread.threadlocal;

/**
 * Created by chiachen on 2017/4/22.
 */
public class LoggerTest {
    public static void main(String[] args) {
        new testThread("thread1").start();
        new testThread("thread2").start();
        new testThread("thread3").start();
    }


}

class testThread extends Thread {
    public testThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i = 0; i < 2; i++) {
            SimpleThreadLogger.log(getName() +
                    ": message " + i);


            try {
                Thread.sleep(500);
            }
            catch(Exception e) {
                SimpleThreadLogger.log(e.toString());
            }
        }
    }
}