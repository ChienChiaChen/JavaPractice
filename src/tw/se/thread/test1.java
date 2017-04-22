package tw.se.thread;

/**
 * Created by chiachen on 2017/2/12.
 */
public class test1 {
    public static void main(String[] args) throws InterruptedException{
        MyThread thread=new MyThread();
        thread.start();
    }
}
class MyThread extends Thread {
    int i=1;
    @Override
    public void run() {
        while (true) {
            System.out.println(i);
            System.out.println(this.isInterrupted());
            try {
                System.out.println("我马上去sleep了");
                Thread.sleep(2000);
                this.interrupt();
            } catch (InterruptedException e) {
                System.out.println("异常捕获了"+this.isInterrupted());
                return;
            }
            i++;
        }

    }
}